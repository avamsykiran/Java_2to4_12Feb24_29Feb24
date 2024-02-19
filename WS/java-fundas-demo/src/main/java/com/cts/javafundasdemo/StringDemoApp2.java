package com.cts.javafundasdemo;

import java.util.Scanner;

public class StringDemoApp2 {

	public static void main(String[] args) {
		String[] digits =new String[] {
		    "ZERO","ONE","TWO","THREE","FOUR","FIVE",
		    "SIX","SEVEN","EIGHT","NINE"
		};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("A Number? ");
		double n = scan.nextDouble();
		
		String nStrValue = String.valueOf(n);
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<nStrValue.length();i++) {
			char ch = nStrValue.charAt(i);
			if('.'==ch) {
				sb.append("dot ");
			}else {
				int index = Integer.valueOf(String.valueOf(ch));
				sb.append(digits[index]).append(" ");
			}
		}
		
		String result = sb.toString();
		System.out.println(result);
		scan.close();
	}

}
