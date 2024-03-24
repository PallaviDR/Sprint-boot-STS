package com.banking.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String password;
	private String role;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "admin")
	private List<Addinguser> addingusers=new ArrayList<>();
	public void addAddinguser(Addinguser addinguser)
	{
		this.addingusers.add(addinguser);
	}
	
	public Admin() {

	}

	public Admin(int id, String username, String password, String role, List<Addinguser> addingusers) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.addingusers = addingusers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Addinguser> getAddingusers() {
		return addingusers;
	}

	public void setAddingusers(List<Addinguser> addingusers) {
		this.addingusers = addingusers;
	}	
	

}