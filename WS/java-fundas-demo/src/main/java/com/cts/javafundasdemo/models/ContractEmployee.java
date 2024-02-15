package com.cts.javafundasdemo.models;

public class ContractEmployee extends Employee {
	
	private int duration;

	public ContractEmployee() {
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(int empId, String fullName, double basiPay,int duration) {
		super(empId, fullName, basiPay);
		this.duration=duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return super.toString() + ", duration="+duration;
	}	
	
}
