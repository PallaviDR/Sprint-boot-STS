package com.banking.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.banking.model.Clerk;
import com.banking.services.ClerkService;

@RestController
public class ClerkController {
	private ClerkService clerkService;
	
		
	public ClerkController(ClerkService clerkService) {
		super();
		this.clerkService = clerkService;
	}
	
		@PostMapping("/loginclerk")
	@CrossOrigin(origins="http://localhost:4200")
	public Clerk loginClerk(@RequestBody Clerk clerk) throws Exception {
		String tempUsername = clerk.getUsername();
		String tempPass = clerk.getPassword();
		Clerk clerkobj = null;
		if (tempUsername != null && tempPass != null) {
			clerkobj = clerkService.fetchUserByUsernameAndPassword(tempUsername, tempPass);
		}
		if (clerkobj == null) {
			throw new Exception("Invalid Credentials");
		}
		return clerkobj;
	}
}