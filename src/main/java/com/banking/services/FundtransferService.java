package com.banking.services;

import java.util.List;

import com.banking.model.Fundtransfer;



public interface FundtransferService {
	public List<Fundtransfer> fetchFundtransfers();

	public Fundtransfer getFundtransfer(int fundingFId);

	public Fundtransfer saveFundtransfer(Fundtransfer fund);
	public void deleteFundtransfer(int fundFId);

}