package com.cts.javafundasdemo;

import com.cts.javafundasdemo.models.ContractEmployee;
import com.cts.javafundasdemo.models.Director;
import com.cts.javafundasdemo.models.Employee;
import com.cts.javafundasdemo.models.Manager;
import com.cts.javafundasdemo.service.EmployeeService;

public class InheretenceDemoApp {

	public static void main(String[] args) {
		Employee[] emps = new Employee[] {
				new Employee(1, "Vamsy",450000),
				new ContractEmployee(2, "Sagar",78000,10),
				new Manager(3, "Suresh",89000, 4500),
				new Director(4, "Deleep", 90000,5000, 0.10)
		};
		
		EmployeeService es = new EmployeeService();
		
		for(Employee e : emps) {
			if(e instanceof Manager) {
				System.out.println(e +"\t Gross="+es.grossPay((Manager)e) + "\tNet="+es.netPay((Manager)e));
			}else {
				System.out.println(e +"\t Gross="+es.grossPay(e) + "\tNet="+es.netPay(e));	
			}
			
		}
	}

}
