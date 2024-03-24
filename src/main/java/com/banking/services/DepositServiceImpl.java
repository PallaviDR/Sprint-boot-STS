package com.banking.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.model.Deposit;
import com.banking.repositories.DepositRepository;


@Service
public class DepositServiceImpl implements DepositService {

	@Autowired
	DepositRepository depositRepository;
	
	@Transactional
	public List<Deposit> fetchDeposits() {
		List<Deposit> depList=depositRepository.findAll();
		return depList;
		
	}
	
	@Transactional
	public Deposit saveDeposit(Deposit deposit) {
		
		return depositRepository.save(deposit);
		
	}
	@Transactional 
	  public Deposit getDeposit(int did) { 
	  Optional<Deposit> optional= depositRepository.findById(did);
	  Deposit dep=optional.get();
	  return dep;
	  

}

	@Transactional 
	public void deleteDeposit(int depDId) {
		System.out.println("service method called");
		depositRepository.deleteById(depDId);
		
	}

	
}

