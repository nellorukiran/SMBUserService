package com.smb.controller.dao;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CustomerUpdationMapping {

	private int dueAmount;
	
	@JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
	private LocalDate dueDate;
	
	private int eachDue;
	private int pendingDues;
	private int balanceDue;
	private String fileStatus;
	private int nextDueAmount;
	private int penality;
	private String customerPhone;
	
	
	public int getDueAmount() {
		return dueAmount;
	}
	public void setDueAmount(int dueAmount) {
		this.dueAmount = dueAmount;
	}
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public int getEachDue() {
		return eachDue;
	}
	public void setEachDue(int eachDue) {
		this.eachDue = eachDue;
	}
	public int getPendingDues() {
		return pendingDues;
	}
	public void setPendingDues(int pendingDues) {
		this.pendingDues = pendingDues;
	}
	public int getBalanceDue() {
		return balanceDue;
	}
	public void setBalanceDue(int balanceDue) {
		this.balanceDue = balanceDue;
	}
	public String getFileStatus() {
		return fileStatus;
	}
	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}
	public int getNextDueAmount() {
		return nextDueAmount;
	}
	public void setNextDueAmount(int nextDueAmount) {
		this.nextDueAmount = nextDueAmount;
	}
	
	public int getPenality() {
		return penality;
	}
	public void setPenality(int penality) {
		this.penality = penality;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	
}
