package com.banking.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.model.Manager;

@Repository
public interface ManagerRepository  extends JpaRepository<Manager, Integer>{
	Manager findByUsernameAndPassword(String userName,String password);
}

	

