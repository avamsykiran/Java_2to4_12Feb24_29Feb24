package com.cts.javafundasdemo;

import java.util.Scanner;

public class UnCheckedExceptionsDemoApplication {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Operand1? ");
		int n1 = readInt();
		System.out.println("Operand2? ");
		int n2 = readInt();
		
		if(n2!=0) {
			System.out.println(n1/n2);
		}else {
			System.out.println("ZERO is not a valid divisor");
		}
		
		System.out.println("OK! The Application Terminated!");
		
		scan.close();
	}

	static int readInt() {
		while(!scan.hasNextInt()) {
			scan.next();
		}
		return scan.nextInt();
	}
}
