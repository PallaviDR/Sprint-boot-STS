package com.banking.services;

import com.banking.model.Admin;
import com.banking.model.AuthenticationStatus;

public interface AdminService {
	AuthenticationStatus getAuthenticationStatus(String userName,String password);
	void registerUser(Admin admin);
}