package com.cts.javafundasdemo;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeApiDemoApp3 {

	public static void main(String[] args) {

		ZonedDateTime delhiTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		ZonedDateTime beijingTime = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
		
		System.out.println(delhiTime);
		System.out.println(newYorkTime);
		System.out.println(beijingTime);
	}

}
