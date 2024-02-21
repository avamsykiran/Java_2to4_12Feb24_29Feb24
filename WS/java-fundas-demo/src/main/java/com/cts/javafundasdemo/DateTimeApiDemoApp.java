package com.cts.javafundasdemo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeApiDemoApp {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter DOB(yyyy-MM-dd): ");
		LocalTime startTime = LocalTime.now();
		String dobStr = scan.next();
		LocalTime endTime = LocalTime.now();
		
		LocalDate dob = LocalDate.parse(dobStr, formatter);
		LocalDate today = LocalDate.now();
		
		System.out.println("Today: "+today.format(formatter));
		
		Period age = Period.between(dob, today);
		Duration inputingDuration = Duration.between(startTime, endTime);
		
		System.out.println("You took "+ inputingDuration.toMillis() + " milli secs to input.");
		
		System.out.println(String.format("Age is %d yrs %d months and %d days exactly", 
				age.getYears(),age.getMonths(),age.getDays()));
		
		
		scan.close();
	}

}
