package com.banking.services;

import java.util.List;

import com.banking.model.Addinguser;



public interface AddinguserService {
	

	public List<Addinguser> fetchAddingusers();

	public Addinguser getAddinguser(int addinguserId);

	public Addinguser saveAddinguser(Addinguser adding);

	public void deleteAddinguser(int addingId);
}
