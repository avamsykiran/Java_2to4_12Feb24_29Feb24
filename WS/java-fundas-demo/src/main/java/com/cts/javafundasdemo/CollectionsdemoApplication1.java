package com.cts.javafundasdemo;

import java.util.Set;
import java.util.TreeSet;

import com.cts.javafundasdemo.models.Employee;
import com.cts.javafundasdemo.service.EmployeeSalaryComparator;

public class CollectionsdemoApplication1 {

	public static void main(String[] args) {
		//Set<Employee> emps = new HashSet<>();
		//Set<Employee> emps = new LinkedHashSet<>();
		//Set<Employee> emps = new TreeSet<>();
		//Set<Employee> emps = new TreeSet<>( new EmployeeNameComparator());
		Set<Employee> emps = new TreeSet<>(new EmployeeSalaryComparator());
		
		emps.add(new Employee(1, "Vamsy", 45000));
		emps.add(new Employee(10, "Bharwa", 46000));
		emps.add(new Employee(9, "Karthik", 75000));
		emps.add(new Employee(7, "Aruna", 95000));
		emps.add(new Employee(6, "Drona", 58000));
		emps.add(new Employee(8, "Chaitanya", 41000));
		emps.add(new Employee(5, "Zareena", 25000));
		emps.add(new Employee(3, "Farookh", 35000));
		emps.add(new Employee(4, "Edward", 85000));
		emps.add(new Employee(2, "Viswa", 50000));
		emps.add(new Employee(1, "Vamsy", 45000));
		emps.add(new Employee(10, "Bharwa", 46000));
		
		System.out.println(emps.size() + " employee found! ");
		for(Employee e : emps) {
			System.out.println(e);
		}
	}

}
