package com.cts.javafundasdemo;

import com.cts.javafundasdemo.models.BankAccount;
import com.cts.javafundasdemo.service.Swapper;

public class GenericsaDemoApplication {

	public static void main(String[] args) {
		
		Swapper<Integer> swapper1 = new Swapper<>();
		swapper1.swap(102, -90);

		Swapper<String> swapper2 = new Swapper<>();
		swapper2.swap("Apples","Mangoes");

		Swapper<BankAccount> swapper3 = new Swapper<>();
		swapper3.swap(new BankAccount("SBI001",67000), new BankAccount("HDFC00908",456789));

	}

}
