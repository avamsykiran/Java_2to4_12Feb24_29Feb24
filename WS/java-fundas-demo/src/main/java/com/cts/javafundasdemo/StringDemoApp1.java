package com.cts.javafundasdemo;

import java.util.Scanner;

public class StringDemoApp1 {

	public static void main(String[] args) {
		
		String s = "Hello World";
		
		System.out.println(String.format("%d \t %d \t %s",System.identityHashCode(s), s.hashCode(),s));
		
		s = s + "!";
		System.out.println(String.format("%d \t %d \t %s",System.identityHashCode(s), s.hashCode(),s));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Name? ");
		String userName = scan.next();
		
		/*
		 * String reverse = "";
		 * for(int i=userName.length()-1;i>=0;i--) {
			reverse += userName.charAt(i);
		}*/
		
		String reverse = (new StringBuffer(userName)).reverse().toString();
		
		System.out.println(reverse);
		
		scan.close();
	}

}
