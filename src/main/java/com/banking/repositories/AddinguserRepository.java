package com.banking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.model.Addinguser;



@Repository
public interface AddinguserRepository extends JpaRepository<Addinguser, Integer>{ 
	
}
