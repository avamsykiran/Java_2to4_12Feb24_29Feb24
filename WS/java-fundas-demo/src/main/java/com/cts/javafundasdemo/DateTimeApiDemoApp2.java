package com.cts.javafundasdemo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class DateTimeApiDemoApp2 {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Any Date (yyyy-MM-dd): ");
		String dobStr = scan.next();
		LocalDate date = LocalDate.parse(dobStr, formatter);
		
		System.out.println("Belwo are the all the Mondays in this month ");
		
		LocalDate monday = date.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.MONDAY));
		
		while(monday.isBefore(date.with(TemporalAdjusters.lastDayOfMonth()))) {
			System.out.println(monday.format(formatter));
			monday = monday.plusDays(7);
		}
		
		scan.close();
	}

}
