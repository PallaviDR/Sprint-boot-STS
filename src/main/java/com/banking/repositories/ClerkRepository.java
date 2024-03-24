package com.banking.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.model.Clerk;



@Repository
public interface ClerkRepository  extends JpaRepository<Clerk, Integer>{
	Clerk findByUsernameAndPassword(String userName,String password);
}