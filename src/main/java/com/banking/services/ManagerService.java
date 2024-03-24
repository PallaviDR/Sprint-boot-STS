package com.banking.services;

import com.banking.model.AuthenticationStatus;
import com.banking.model.Manager;


public interface ManagerService {
	AuthenticationStatus getAuthenticationStatus(String userName,String password);
	void registerUser(Manager manager);
}