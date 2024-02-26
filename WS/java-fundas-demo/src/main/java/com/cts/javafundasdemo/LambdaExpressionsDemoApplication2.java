package com.cts.javafundasdemo;

import java.util.ArrayList;
import java.util.List;

import com.cts.javafundasdemo.models.Employee;

public class LambdaExpressionsDemoApplication2 {

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		
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
		
		emps.stream().forEach(System.out::println);
	}

}
