package com.cts.javafundasdemo.service;

public class NumericSeries implements Runnable {

	private int lowerBound;
	private int upperBound;
	
	
	public NumericSeries(int lowerBound, int upperBound) {
		super();
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}


	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		
		for(int i=lowerBound;i<=upperBound;i++) {
			System.out.println(thName +"\t" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
