package com.cts.javafundasdemo.models;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String fullName;
	private double basiPay;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String fullName, double basiPay) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.basiPay = basiPay;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getBasiPay() {
		return basiPay;
	}

	public void setBasiPay(double basiPay) {
		this.basiPay = basiPay;
	}

	@Override
	public int hashCode() {
		return Objects.hash(basiPay, empId, fullName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Double.doubleToLongBits(basiPay) == Double.doubleToLongBits(other.basiPay) && empId == other.empId
				&& Objects.equals(fullName, other.fullName);
	}

	@Override
	public String toString() {
		return "empId=" + empId + ", fullName=" + fullName + ", basiPay=" + basiPay;
	}

	@Override
	public int compareTo(Employee obj2) {
		return  ((Integer) this.empId).compareTo(obj2.empId);
	}
	
	
}
