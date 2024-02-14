package com.cts.javafundasdemo;

import com.cts.javafundasdemo.models.Employee;

public class ClassAndObjectDemoApp {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Vamsy",90000);
		Employee e2 = new Employee(102, "Sagar",91000);
		Employee e3 = new Employee(103, "Suresh",19000);
		Employee e4 = new Employee(103, "Suresh",19000);
		Employee e5 = e3;
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		System.out.println(e5.hashCode());
		
		System.out.println(e3==e4);
		System.out.println(e3==e5);
		
		System.out.println(e3.equals(e4));
		System.out.println(e3.equals(e5));
	}

}
