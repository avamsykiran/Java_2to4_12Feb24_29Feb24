package com.cts.javafundasdemo.models;

import java.util.Objects;

public class BankAccount {

	private String accNumber;
	private double currentBalance;

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(String accNumber, double currentBalance) {
		super();
		this.accNumber = accNumber;
		this.currentBalance = currentBalance;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accNumber, currentBalance);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return Objects.equals(accNumber, other.accNumber)
				&& Double.doubleToLongBits(currentBalance) == Double.doubleToLongBits(other.currentBalance);
	}

	@Override
	public String toString() {
		return "BankAccount [accNumber=" + accNumber + ", currentBalance=" + currentBalance + "]";
	}

}
