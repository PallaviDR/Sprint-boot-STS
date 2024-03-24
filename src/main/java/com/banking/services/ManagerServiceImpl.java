package com.banking.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.banking.model.AuthenticationStatus;
import com.banking.model.Manager;
import com.banking.repositories.ManagerRepository;





@Service
@Transactional
public class ManagerServiceImpl implements ManagerService {
	private ManagerRepository managerRepository;
	
	public ManagerServiceImpl(ManagerRepository userRepository) {
		super();
		this.managerRepository = userRepository;
	}

	@Override
	public AuthenticationStatus getAuthenticationStatus(String userName, String password) {
		AuthenticationStatus status=null;
		Manager manager=managerRepository.findByUsernameAndPassword(userName, password);
		if(manager!=null)
		{
			status=new AuthenticationStatus(manager.getUsername(),manager.getRole(),true);
		}
		else
		{
			status=new AuthenticationStatus(null, null, false);
		}
		return status;
	}

	@Override
	public void registerUser(Manager manager) {
		managerRepository.save(manager);
	}
}