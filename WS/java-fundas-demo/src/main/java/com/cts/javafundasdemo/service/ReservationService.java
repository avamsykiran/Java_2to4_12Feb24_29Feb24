package com.cts.javafundasdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.cts.javafundasdemo.models.Bus;

public class ReservationService implements Runnable {

	private Bus bus;
	private int seatsNeeded;
	private List<Integer> seatsReserved;
	
	public ReservationService(Bus bus,int seatsNeeded) {
		this.bus=bus;
		this.seatsNeeded=seatsNeeded;
		this.seatsReserved = new ArrayList<>();
	}
	
	private boolean haveASeat() {
		return bus.getMaxSeats()!=bus.getLastReservedSeat();
	}
	
	@Override
	public void run() {
		synchronized (bus) {
			for(int i=1;i<=seatsNeeded && haveASeat();i++) {
				int seat = bus.getLastReservedSeat() + 1;
				seatsReserved.add(seat);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bus.setLastReservedSeat(seat);
			}	
		}
		
	}

	public List<Integer> getSeatsReserved() {
		return seatsReserved;
	}

	
}
