package com.banking.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.banking.model.Deposit;
import com.banking.services.DepositService;





@RestController
public class DepositController {
	private DepositService depositService;

	
	public DepositController(DepositService depositService) {
		super();
		this.depositService = depositService;
	}

	@GetMapping("/deposits")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Deposit> getDeposits() {
		List<Deposit> depList =depositService.fetchDeposits();
		return depList;
	}
	
	@GetMapping("/deposit/{did}")
	@CrossOrigin(origins="http://localhost:4200")
	public ResponseEntity<Deposit> getDepositById(@PathVariable("did") int did)
			throws Exception {
		Deposit d = depositService.getDeposit(did);
		return ResponseEntity.ok().body(d);
	}
	
	@PostMapping("/dep")
	@CrossOrigin(origins="http://localhost:4200")
	public Deposit deposit(@RequestBody Deposit d) throws Exception {
		Deposit deposit = depositService.saveDeposit(d);
		return deposit;
	}
	@DeleteMapping(value = "/deletedeposit/{did}")
	@CrossOrigin(origins="http://localhost:4200")
	public ResponseEntity<Object> deleteUser(@PathVariable("did") int did) {
		depositService.deleteDeposit(did);
		return new ResponseEntity<>("User deleted successsfully", HttpStatus.OK);
		}}