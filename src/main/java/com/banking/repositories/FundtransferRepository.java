package com.banking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.model.Fundtransfer;





@Repository
public interface FundtransferRepository extends JpaRepository<Fundtransfer, Integer>{ 
	
}
