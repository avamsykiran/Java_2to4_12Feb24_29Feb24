package com.cts.javafundasdemo.service;

import java.util.Comparator;

import com.cts.javafundasdemo.models.Employee;

public class EmployeeSalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return ((Double)o1.getBasiPay()).compareTo(o2.getBasiPay());
	}
	
}