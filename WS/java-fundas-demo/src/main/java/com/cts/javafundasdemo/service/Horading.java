package com.cts.javafundasdemo.service;

public interface Horading {

	public static final double PI =3.14;
	
	double area();
	
	default double estiamteRent(double rentPerSquareUnit) {
		return area()*rentPerSquareUnit;
	}

}
