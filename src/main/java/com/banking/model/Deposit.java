 package com.banking.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Deposit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
 private String accno;
 private String amount;
 private String amountinwords;
 @ManyToOne
 @JoinColumn(name="manager_id")
 private Manager manager;
 public Deposit() {
	 
 }
public Deposit(int did, String accno, String amount, String amountinwords, Manager manager) {
	super();
	this.did = did;
	this.accno = accno;
	this.amount = amount;
	this.amountinwords = amountinwords;
	this.manager = manager;
}
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getAccno() {
	return accno;
}
public void setAccno(String accno) {
	this.accno = accno;
}
public String getAmount() {
	return amount;
}
public void setAmount(String amount) {
	this.amount = amount;
}
public String getAmountinwords() {
	return amountinwords;
}
public void setAmountinwords(String amountinwords) {
	this.amountinwords = amountinwords;
}
public Manager getManager() {
	return manager;
}
public void setManager(Manager manager) {
	this.manager = manager;
}

 
}
