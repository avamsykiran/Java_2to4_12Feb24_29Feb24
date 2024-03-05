package com.cts.javafundasdemo;

import com.cts.javafundasdemo.service.NumericSeries;

public class ThreadDemoApplication2 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new NumericSeries(1, 50), "Thread1");
		Thread t2 = new Thread(new NumericSeries(100, 150), "Thread2");
		Thread t3 = new Thread(new NumericSeries(200, 250), "Thread3");
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Program Terminated!");
	}

}
