package com.cts.javafundasdemo.service;

public class RectangularHoarding implements Horading {

	private int length;
	private int width;
	
	public RectangularHoarding(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		return length*width;
	}

}
