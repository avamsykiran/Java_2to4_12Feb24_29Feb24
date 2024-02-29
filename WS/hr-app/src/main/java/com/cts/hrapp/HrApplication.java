package com.cts.hrapp;

import java.util.Scanner;

import com.cts.hrapp.exceptions.OperationFailedException;
import com.cts.hrapp.uis.EmployeeCRUDUI;

public class HrApplication {
	
	public static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		EmployeeCRUDUI empUI;
		
		try {
			empUI = new EmployeeCRUDUI();
			empUI.run();
		} catch (OperationFailedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scan.close();
	}

}
