package com.cts.javafundasdemo;

import java.util.Scanner;

import com.cts.javafundasdemo.exceptions.InsufficientBalanceException;
import com.cts.javafundasdemo.exceptions.InvalidAmountException;
import com.cts.javafundasdemo.models.BankAccount;
import com.cts.javafundasdemo.service.BankingServices;

public class UserDefinedCheckedExceptionsDemoApp {

	public static void main(String[] args) {

		BankAccount acc = new BankAccount("SB0000123", 7800);

		BankingServices bs = new BankingServices();

		Scanner scan = new Scanner(System.in);

		String cmd = null;

		while (!"quit".equalsIgnoreCase(cmd)) {
			System.out.println("Command (withdraw/deposit/quit): ");
			cmd = scan.next().toLowerCase();

			double amt = 0;

			switch (cmd) {
			case "withdraw":
				System.out.println("Amount? ");
				amt = scan.nextDouble();
				try {
					bs.withdraw(acc, amt);
					System.out.println("Balance after withdraw: " + acc.getCurrentBalance());
				} catch (InvalidAmountException | InsufficientBalanceException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "deposit":
				System.out.println("Amount? ");
				amt = scan.nextDouble();
				try {
					bs.deposite(acc, amt);
					System.out.println("Balance after deposit: " + acc.getCurrentBalance());
				} catch (InvalidAmountException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "quit":
				System.out.println("BYE!");
				break;
			default:
				System.out.println("Unknown command");
			}
		}
		scan.close();
	}

}
