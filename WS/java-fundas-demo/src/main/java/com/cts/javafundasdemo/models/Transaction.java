package com.cts.javafundasdemo.models;

import java.time.LocalDate;
import java.util.Objects;

public class Transaction {
	
	private int txnId;
	private double amount;
	private String header;
	private LocalDate txnDate;
	private TxnType txnType;

	public Transaction() {
	}

	public Transaction(int txnId, double amount, String header, LocalDate txnDate, TxnType txnType) {
		super();
		this.txnId = txnId;
		this.amount = amount;
		this.header = header;
		this.txnDate = txnDate;
		this.txnType = txnType;
	}

	public int getTxnId() {
		return txnId;
	}

	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public LocalDate getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(LocalDate txnDate) {
		this.txnDate = txnDate;
	}

	public TxnType getTxnType() {
		return txnType;
	}

	public void setTxnType(TxnType txnType) {
		this.txnType = txnType;
	}

	@Override
	public String toString() {
		return "Transaction [txnId=" + txnId + ", amount=" + amount + ", header=" + header + ", txnDate=" + txnDate
				+ ", txnType=" + txnType + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, header, txnDate, txnId, txnType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(header, other.header) && Objects.equals(txnDate, other.txnDate)
				&& txnId == other.txnId && Objects.equals(txnType, other.txnType);
	}
	
	
}
