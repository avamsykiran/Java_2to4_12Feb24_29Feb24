package com.cts.javafundasdemo.models;

public class Manager extends Employee {
	
	private int allowence;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(int empId, String fullName, double basiPay,int allowence) {
		super(empId, fullName, basiPay);
		this.allowence=allowence;
	}

	public int getAllowence() {
		return allowence;
	}

	public void setAllowence(int allowence) {
		this.allowence = allowence;
	}

	@Override
	public String toString() {
		return super.toString() + ", allowence="+allowence;
	}	
	
}
