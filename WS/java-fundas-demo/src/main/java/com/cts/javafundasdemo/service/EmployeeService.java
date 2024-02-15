package com.cts.javafundasdemo.service;

import com.cts.javafundasdemo.models.Employee;
import com.cts.javafundasdemo.models.Manager;

public class EmployeeService {

	public static final double TDS=0.10;
	
	public double netPay(Employee emp) {
		double gp = emp instanceof Manager ? grossPay((Manager)emp) : grossPay(emp);
		return gp - (gp*TDS);
	}
	
	public double grossPay(Employee emp) {
		return emp.getBasiPay(); 
	}
	
	public double grossPay(Manager mgr) {
		return mgr.getBasiPay() + mgr.getAllowence(); 
	}
}
