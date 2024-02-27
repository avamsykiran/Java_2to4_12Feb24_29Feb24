package com.cts.javafundasdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.cts.javafundasdemo.models.Employee;

public class StreamsApiDemoApplication2 {

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
		System.out.println("-------------------------------------------------------------------");
		
		emps.stream()
			.map(e -> String.format("%s having emp#%d earns %.2f as monthly salary", e.getFullName(),e.getEmpId(),e.getBasiPay()))
			.forEach(System.out::println);
		System.out.println("-------------------------------------------------------------------");
		
		Set<String> allNames = emps.stream().map(Employee::getFullName).collect(Collectors.toSet());
		System.out.println(allNames);
		System.out.println("-------------------------------------------------------------------");
		
		List<Employee> empsEarningLessthan40k = emps.stream().filter( e -> e.getBasiPay()<=40000).collect(Collectors.toList());
		empsEarningLessthan40k.forEach(System.out::println);
		System.out.println("-------------------------------------------------------------------");
		
		Optional<Employee> maxPaidEmployee = emps.stream().reduce((e1,e2) -> e1.getBasiPay()>e2.getBasiPay()?e1:e2);
		System.out.println(maxPaidEmployee.get());
		
		System.out.println("-------------------------------------------------------------------");
		
		Optional<Employee> maxPaidEmployee2 = emps.stream().filter( e -> e.getFullName().startsWith("V") ).reduce((e1,e2) -> e1.getBasiPay()>e2.getBasiPay()?e1:e2);
		System.out.println(maxPaidEmployee2.get());
		
	}

}
