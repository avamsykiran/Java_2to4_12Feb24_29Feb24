package com.cts.javafundasdemo.service;

public class CircularHoarding implements Horading {

	private int radius;

	public CircularHoarding(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		return PI*radius*radius;
	}
	
}
