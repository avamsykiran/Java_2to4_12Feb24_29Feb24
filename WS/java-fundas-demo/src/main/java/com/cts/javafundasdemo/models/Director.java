package com.cts.javafundasdemo.models;

public class Director extends Manager {

	private double share;
	
	public Director() {
		// TODO Auto-generated constructor stub
	}

	public Director(int empId, String fullName, double basiPay, int allowence,double share) {
		super(empId, fullName, basiPay, allowence);
		this.share=share;
	}

	public double getShare() {
		return share;
	}

	public void setShare(double share) {
		this.share = share;
	}

	@Override
	public String toString() {
		return super.toString() + ", share="+share;
	}
	
}
