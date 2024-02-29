package com.cts.hrapp.models;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {

	private int empId;
	private String name;
	private String mobile;
	private double basic;
	
	public Employee() {
		
	}

	public Employee(int empId, String name, String mobile, double basic) {
		super();
		this.empId = empId;
		this.name = name;
		this.mobile = mobile;
		this.basic = basic;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	@Override
	public int hashCode() {
		return Objects.hash(basic, empId, mobile, name);
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
		return Double.doubleToLongBits(basic) == Double.doubleToLongBits(other.basic) && empId == other.empId
				&& Objects.equals(mobile, other.mobile) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", mobile=" + mobile + ", basic=" + basic + "]";
	}
	
	
}
