package com.cts.hrapp.uis;

import java.util.List;
import java.util.Scanner;

import com.cts.hrapp.HrApplication;
import com.cts.hrapp.exceptions.InvalidEmployeeDetailsException;
import com.cts.hrapp.exceptions.InvalidEmployeeIdException;
import com.cts.hrapp.exceptions.OperationFailedException;
import com.cts.hrapp.models.Employee;
import com.cts.hrapp.services.EmployeeService;
import com.cts.hrapp.services.EmployeeServiceImpl;

public class EmployeeCRUDUI {

	private EmployeeService empService;
	private Scanner scan;

	public EmployeeCRUDUI() throws OperationFailedException {
		this.empService = new EmployeeServiceImpl();
		this.scan = HrApplication.scan;
	}

	public void run() {
		String cmd = null;

		while (!"QUIT".equals(cmd)) {
			System.out.println("Command [LIST/ADD/DELETE/QUIT]: ");
			cmd = scan.nextLine().toUpperCase();

			switch (cmd) {
			case "ADD":
				doAdd();
				break;
			case "DELETE":
				doDelete();
				break;
			case "LIST":
				doList();
				break;
			case "QUIT":
				System.out.println("Application Terminated!");
				break;
			default:
				System.out.println("No Such Operation!");
			}
		}
	}

	private void doAdd() {
		Employee emp = new Employee();

		System.out.println("Name? ");
		emp.setName(scan.nextLine());
		System.out.println("Mobile: ");
		emp.setMobile(scan.nextLine());
		System.out.println("Basic: ");
		emp.setBasic(scan.nextDouble());

		try {
			empService.add(emp);
			System.out.println("Employee Saved!");
		} catch (OperationFailedException | InvalidEmployeeDetailsException e) {
			System.out.println(e.getMessage());
		}
	}

	private void doList() {
		try {
			List<Employee> emps = empService.getAll();
			if (emps.isEmpty()) {
				System.out.println("No data to display");
			} else {
				emps.stream().forEach(System.out::println);
			}
		} catch (OperationFailedException e) {
			System.out.println(e.getMessage());
		}
	}

	private void doDelete() {
		System.out.println("Employee Id? ");
		int empId = scan.nextInt();
		try {
			empService.deleteById(empId);
		} catch (OperationFailedException | InvalidEmployeeIdException e) {
			System.out.println(e.getMessage());
		}
	}
}
