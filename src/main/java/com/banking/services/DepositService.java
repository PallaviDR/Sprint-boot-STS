package com.banking.services;


import java.util.List;

import com.banking.model.Deposit;


public interface DepositService {
	public List<Deposit> fetchDeposits();

	public Deposit getDeposit(int depoDId);

	public Deposit saveDeposit(Deposit dep);
	
	public void deleteDeposit(int depDId);
}
