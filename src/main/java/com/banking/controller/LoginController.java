package com.banking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.banking.model.Admin;
import com.banking.model.AuthenticationStatus;
import com.banking.model.Manager;
import com.banking.services.AdminService;
import com.banking.services.ManagerService;


@RestController
@RequestMapping("/api")
public class LoginController {
	private AdminService adminService;
	private ManagerService managerService;
	
	
	
	
	public LoginController(AdminService adminService, ManagerService managerService) {
		super();
		this.adminService = adminService;
		this.managerService = managerService;
		
	}
	@PostMapping("/admin")
	public ResponseEntity<AuthenticationStatus> authenticate(@RequestBody Admin admin){
		System.out.println(admin.getUsername()+"\t"+admin.getPassword());
		AuthenticationStatus status=adminService.getAuthenticationStatus(admin.getUsername(), admin.getPassword());
		return new ResponseEntity<AuthenticationStatus>(status, HttpStatus.OK);
	}
	@PostMapping("/admins")
	public ResponseEntity register(@RequestBody Admin admin) {
		adminService.registerUser(admin);
		return new ResponseEntity(HttpStatus.CREATED);
	}
	@PostMapping("/manager")
	public ResponseEntity<AuthenticationStatus> authenticate(@RequestBody Manager manager){
		System.out.println(manager.getUsername()+"\t"+manager.getPassword());
		AuthenticationStatus status=managerService.getAuthenticationStatus(manager.getUsername(), manager.getPassword());
		return new ResponseEntity<AuthenticationStatus>(status, HttpStatus.OK);
	}
	@PostMapping("/managers")
	public ResponseEntity register(@RequestBody Manager manager) {
		managerService.registerUser(manager);
		return new ResponseEntity(HttpStatus.CREATED);
	}
	

}