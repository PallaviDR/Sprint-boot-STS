package com.banking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Fundtransfer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fid;
   private String fromaccno;
   private String toaccno;
   private String amount;
   private String amountinwords;
   @ManyToOne
   @JoinColumn(name="manager_id")
   private Manager manager;
   public Fundtransfer() {
 
   }
public Fundtransfer(int fid, String fromaccno, String toaccno, String amount, String amountinwords, Manager manager) {
	super();
	this.fid = fid;
	this.fromaccno = fromaccno;
	this.toaccno = toaccno;
	this.amount = amount;
	this.amountinwords = amountinwords;
	this.manager = manager;
}
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getFromaccno() {
	return fromaccno;
}
public void setFromaccno(String fromaccno) {
	this.fromaccno = fromaccno;
}
public String getToaccno() {
	return toaccno;
}
public void setToaccno(String toaccno) {
	this.toaccno = toaccno;
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
