package com.banking.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.banking.model.Clerk;
import com.banking.repositories.ClerkRepository;





@Service

public class ClerkServiceImpl implements ClerkService {
	private ClerkRepository clerkRepository;

	public 	ClerkServiceImpl(ClerkRepository clerkRepository) {
		super();
		this.clerkRepository = clerkRepository;
	}

	@Override
	public Clerk saveClerk(Clerk clerk) {
		return clerkRepository.save(clerk);
	}

	@Override
	public Clerk fetchUserByUsernameAndPassword(String username, String password) {
		return  clerkRepository.findByUsernameAndPassword(username, password);
	}

	
	
}