package com.cts.javafundasdemo;

import java.util.Arrays;

public class LambdaExpressionsDemoApplication {

	public static void main(String[] args) {
		
		double[] nums = new double[] {1,2,3,4,5,6,7,8,9,0};
		
		Arrays.stream(nums).forEach(System.out::println);
		System.out.println("----------------------------------------------------------");
		
		Arrays.stream(nums).map( ele -> ele*ele ).forEach(System.out::println);
		System.out.println("----------------------------------------------------------");
		
		Arrays.stream(nums).map(Math::sqrt).forEach(System.out::println);
		System.out.println("----------------------------------------------------------");
		
		Arrays.stream(nums).map( ele -> ele*ele ).map(Math::sqrt).forEach(System.out::println);
		System.out.println("----------------------------------------------------------");

	}

}
