  package com.banking.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.banking.model.Fundtransfer;
import com.banking.services.FundtransferService;
@CrossOrigin(origins="http://localhost:4200")

@RestController
public class FundtransferController {

	@Autowired
	private FundtransferService fundtransferService;


	public FundtransferController(FundtransferService fundtransferService) {
		super();
		this.fundtransferService = fundtransferService;
	}


	@GetMapping("/fundtransfers")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Fundtransfer> getFundtransfers() {
		List<Fundtransfer> fundList =fundtransferService.fetchFundtransfers();
		return fundList;
	}
	
	@GetMapping("/fundtransfer/{fid}")
	@CrossOrigin(origins="http://localhost:4200")
	public ResponseEntity<Fundtransfer> getFundtransferById(@PathVariable("fid") int fid)
			throws Exception {
		Fundtransfer f = fundtransferService.getFundtransfer(fid);
		return ResponseEntity.ok().body(f);
	}
	
	@PostMapping("/fund")
	@CrossOrigin(origins="http://localhost:4200")
	public Fundtransfer fundtransfer(@RequestBody Fundtransfer f) throws Exception {
		Fundtransfer fundtransfer = fundtransferService.saveFundtransfer(f);
		return fundtransfer;
	}
	@DeleteMapping(value = "/deletefundtransfer/{fid}")
	@CrossOrigin(origins="http://localhost:4200")
	public ResponseEntity<Object> deleteUser(@PathVariable("fid") int fid) {
		fundtransferService.deleteFundtransfer(fid);
		return new ResponseEntity<>("User deleted successsfully", HttpStatus.OK);
		}}