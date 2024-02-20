package com.cts.javafundasdemo.service;

import com.cts.javafundasdemo.exceptions.InsufficientBalanceException;
import com.cts.javafundasdemo.exceptions.InvalidAmountException;
import com.cts.javafundasdemo.models.BankAccount;

public class BankingServices {

	public void deposite(BankAccount acc, double amount) throws InvalidAmountException {
		if (amount < 0) {
			throw new InvalidAmountException("Negative amount can not be deposited");
		}

		if (acc != null) {
			acc.setCurrentBalance(acc.getCurrentBalance() + amount);
		}
	}

	public void withdraw(BankAccount acc, double amount) throws InvalidAmountException,InsufficientBalanceException {
		if (amount < 0) {
			throw new InvalidAmountException("Negative amount can not be withdrawn");
		}
		
		if (acc != null) {
			if(acc.getCurrentBalance()<amount) {
				throw new InsufficientBalanceException(
						String.format("Can not withdraw %f while the balance is %f", amount,acc.getCurrentBalance()));
			}
			
			acc.setCurrentBalance(acc.getCurrentBalance() - amount);
		}
	}

}
