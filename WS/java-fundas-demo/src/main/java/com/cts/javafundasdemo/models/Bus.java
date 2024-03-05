package com.cts.javafundasdemo.models;

public class Bus {

	private int maxSeats;
	private int lastReservedSeat;
	
	public Bus(int maxSeats) {
		this.maxSeats=maxSeats;
		this.lastReservedSeat=0;
	}

	public int getLastReservedSeat() {
		return lastReservedSeat;
	}

	public void setLastReservedSeat(int lastReservedSeat) {
		this.lastReservedSeat = lastReservedSeat;
	}

	public int getMaxSeats() {
		return maxSeats;
	}
	
	
}
