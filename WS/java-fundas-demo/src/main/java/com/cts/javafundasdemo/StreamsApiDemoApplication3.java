package com.cts.javafundasdemo;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import com.cts.javafundasdemo.models.Transaction;
import com.cts.javafundasdemo.models.TxnType;

public class StreamsApiDemoApplication3 {

	public static void main(String[] args) {
		List<Transaction> txns = new ArrayList<>();

		txns.add(new Transaction(1, 45000.0, "Salary", LocalDate.of(2024, Month.FEBRUARY, 1), TxnType.CREDIT));
		txns.add(new Transaction(2, 4500.0, "Rent", LocalDate.of(2024, Month.FEBRUARY, 1), TxnType.DEBIT));
		txns.add(new Transaction(3, 5000.0, "Fuel", LocalDate.of(2024, Month.FEBRUARY, 2), TxnType.DEBIT));
		txns.add(new Transaction(4, 500.0, "MobielBill", LocalDate.of(2024, Month.FEBRUARY, 2), TxnType.DEBIT));
		txns.add(new Transaction(5, 450.0, "Electricity", LocalDate.of(2024, Month.FEBRUARY, 3), TxnType.DEBIT));
		txns.add(new Transaction(6, 5000.0, "SavingsIntrest", LocalDate.of(2024, Month.FEBRUARY, 3), TxnType.CREDIT));
		
		
		double totalDebit = txns.stream().filter(t -> t.getTxnType()==TxnType.DEBIT).map(Transaction::getAmount).reduce(0.0, (a1,a2)->a1+a2);
		double totalCredit = txns.stream().filter(t -> t.getTxnType()==TxnType.CREDIT).mapToDouble(Transaction::getAmount).sum();
		
		
		System.out.println("Credit Total: "+totalCredit);
		System.out.println("Debit Total: "+totalDebit);
		System.out.println("Balance: "+ (totalCredit - totalDebit));
		 
		
	}

}
