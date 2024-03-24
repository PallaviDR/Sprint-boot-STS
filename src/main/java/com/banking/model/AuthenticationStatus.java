package com.banking.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AuthenticationStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String username;
	private String usertype;
	private Boolean authenticated;
	public AuthenticationStatus() {
		
	}
	public AuthenticationStatus(String username, String usertype, Boolean authenticated) {
		super();
		this.username = username;
		this.usertype = usertype;
		this.authenticated = authenticated;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public Boolean getAuthenticated() {
		return authenticated;
	}
	public void setAuthenticated(Boolean authenticated) {
		this.authenticated = authenticated;
	}

}
