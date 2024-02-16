package com.cts.javafundasdemo;

import com.cts.javafundasdemo.service.CircularHoarding;
import com.cts.javafundasdemo.service.RectangularHoarding;

public class AbstractionDemoApp {

	public static void main(String[] args) {
		RectangularHoarding rh = new RectangularHoarding(10,10);
		CircularHoarding ch = new CircularHoarding(10);
		
		System.out.println(rh.estiamteRent(100));
		System.out.println(ch.estiamteRent(100));

	}

}
