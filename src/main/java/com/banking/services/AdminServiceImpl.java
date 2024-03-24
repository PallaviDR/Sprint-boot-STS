     package com.banking.services;



import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.banking.model.Admin;
import com.banking.model.AuthenticationStatus;
import com.banking.repositories.AdminRepository;




@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	private AdminRepository adminRepository;
	
	public AdminServiceImpl(AdminRepository userRepository) {
		super();
		this.adminRepository = userRepository;
	}

	@Override
	public AuthenticationStatus getAuthenticationStatus(String userName, String password) {
		AuthenticationStatus status=null;
		Admin admin=adminRepository.findByUsernameAndPassword(userName, password);
		if(admin!=null)
		{
			status=new AuthenticationStatus(admin.getUsername(),admin.getRole(),true);
		}
		else
		{
			status=new AuthenticationStatus(null, null, false);
		}
		return status;
	}

	@Override
	public void registerUser(Admin admin) {
		adminRepository.save(admin);
	}
}