package com.banking.services;

import com.banking.model.AuthenticationStatus;
import com.banking.model.Clerk;


public interface ClerkService {
	Clerk saveClerk(Clerk clerk);
	Clerk fetchUserByUsernameAndPassword(String tempUsername, String tempPass);
}