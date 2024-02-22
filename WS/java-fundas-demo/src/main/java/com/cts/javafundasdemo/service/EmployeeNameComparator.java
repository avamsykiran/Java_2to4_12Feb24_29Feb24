package com.cts.javafundasdemo.service;

import java.util.Comparator;

import com.cts.javafundasdemo.models.Employee;

public class EmployeeNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getFullName().compareTo(o2.getFullName());
	}
	
}