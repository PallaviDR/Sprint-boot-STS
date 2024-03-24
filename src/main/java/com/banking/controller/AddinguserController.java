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

import com.banking.model.Addinguser;
import com.banking.services.AddinguserService;





@RestController
public class AddinguserController {
	private AddinguserService addinguserService;

	
	public AddinguserController(AddinguserService addinguserService) {
		super();
		this.addinguserService = addinguserService;
	}

	@GetMapping("/addingusers")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Addinguser> getAddingusers() {
		List<Addinguser> addList =addinguserService.fetchAddingusers();
		return addList;
	}
	
	@GetMapping("/addinguser/{aid}")
	@CrossOrigin(origins="http://localhost:4200")
	public ResponseEntity<Addinguser> getAddinguserById(@PathVariable("aid") int aid)
			throws Exception {
		Addinguser a = addinguserService.getAddinguser(aid);
		return ResponseEntity.ok().body(a);
	}
	
	@PostMapping("/add")
	@CrossOrigin(origins="http://localhost:4200")
	public Addinguser addinguser(@RequestBody Addinguser a) throws Exception {
		Addinguser addinguser = addinguserService.saveAddinguser(a);
		return addinguser;
	}
	@DeleteMapping(value = "/deleteaddinguser/{aid}")
	@CrossOrigin(origins="http://localhost:4200")
	public ResponseEntity<Object> deleteUser(@PathVariable("aid") int aid) {
		addinguserService.deleteAddinguser(aid);
		return new ResponseEntity<>("User deleted successsfully", HttpStatus.OK);
		}}