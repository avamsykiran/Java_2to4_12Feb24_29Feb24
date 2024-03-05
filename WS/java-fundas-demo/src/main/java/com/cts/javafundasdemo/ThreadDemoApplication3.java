package com.cts.javafundasdemo;

import com.cts.javafundasdemo.models.Bus;
import com.cts.javafundasdemo.service.ReservationService;

public class ThreadDemoApplication3 {

	public static void main(String[] args) throws InterruptedException {
		
		Bus bus = new Bus(25);
		
		ReservationService s1 = new ReservationService(bus, 10);
		ReservationService s2 = new ReservationService(bus, 10);
		ReservationService s3 = new ReservationService(bus, 10);
		
		Thread t1 = new Thread(s1,"th1");
		Thread t2 = new Thread(s2,"th2");
		Thread t3 = new Thread(s3,"th3");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.print("Please wait while reserving ....");
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("DONE");
		
		System.out.println("For t1 " + s1.getSeatsReserved());
		System.out.println("For t2 " + s2.getSeatsReserved());
		System.out.println("For t3 " + s3.getSeatsReserved());
	}

}
