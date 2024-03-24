package com.banking.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.model.Fundtransfer;
import com.banking.repositories.FundtransferRepository;


@Service
public class FundtransferServiceImpl implements FundtransferService {

	@Autowired
	FundtransferRepository fundtransferRepository;
	
	@Transactional
	public List<Fundtransfer> fetchFundtransfers() {
		List<Fundtransfer> fundList=fundtransferRepository.findAll();
		return fundList;
		
	}
	@Transactional
	public Fundtransfer saveFundtransfer(Fundtransfer fundtransfer) {
		
		return fundtransferRepository.save(fundtransfer);
		
	}
	@Transactional
	public void updateFundtransfer(Fundtransfer fund) {
		fundtransferRepository.save(fund);	
	
	}
	
	@Transactional 
	  public Fundtransfer getFundtransfer(int fid) { 
	  Optional<Fundtransfer> optional= fundtransferRepository.findById(fid);
	  Fundtransfer fund=optional.get();
	  return fund;
	  

}
	@Transactional 
	public void deleteFundtransfer(int fundFId) {
		System.out.println("service method called");
		fundtransferRepository.deleteById(fundFId);
	
		
	}
	

}

