package com.banking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.model.Admin;




@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
	Admin findByUsernameAndPassword(String userName,String password);
}