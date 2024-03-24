package com.banking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Addinguser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String password;
	private String address;
	private String pancard;
	private String adharcard;
	private String mobile;
	@ManyToOne
	@JoinColumn(name="adminId")
	private Admin admin;
public Addinguser() {
		
	}
public Addinguser(int id, String username, String password, String address, String pancard, String adharcard,
		String mobile, Admin admin) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.address = address;
	this.pancard = pancard;
	this.adharcard = adharcard;
	this.mobile = mobile;
	this.admin = admin;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPancard() {
	return pancard;
}
public void setPancard(String pancard) {
	this.pancard = pancard;
}
public String getAdharcard() {
	return adharcard;
}
public void setAdharcard(String adharcard) {
	this.adharcard = adharcard;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public Admin getAdmin() {
	return admin;
}
public void setAdmin(Admin admin) {
	this.admin = admin;
}
	
	
}