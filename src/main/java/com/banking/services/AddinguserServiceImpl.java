package com.banking.services;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.model.Addinguser;
import com.banking.repositories.AddinguserRepository;

@Service
public class AddinguserServiceImpl implements AddinguserService {

	@Autowired
	AddinguserRepository addinguserRepository;
	
	@Transactional
	public List<Addinguser> fetchAddingusers() {
		List<Addinguser> addingList=addinguserRepository.findAll();
		return addingList;
		
	}
	@Transactional
	public Addinguser saveAddinguser(Addinguser addinguser) {
		
		return addinguserRepository.save(addinguser);
		
	}
	@Transactional
	public void updateAddinguser(Addinguser adding) {
		addinguserRepository.save(adding);	
	
	}
	
	@Transactional
	public void deleteAddinguser(int addingId) {
		//empRepository.delete(emp);	
		System.out.println("service method called");
		addinguserRepository.deleteById(addingId);
	
	}
	@Transactional 
	  public Addinguser getAddinguser(int id) { 
	  Optional<Addinguser> optional= addinguserRepository.findById(id);
	  Addinguser adding=optional.get();
	  return adding;
	  

}
}
