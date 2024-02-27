package com.cts.javafundasdemo;

import java.util.Arrays;
import java.util.OptionalDouble;

public class StreamsApiDemoApplication1 {

	public static void main(String[] args) {
		double[] nums = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		Arrays.stream(nums).forEach(System.out::println);
		System.out.println("----------------------------------------------------------");

		Arrays.stream(nums).map(ele -> ele * ele).forEach(System.out::println);
		System.out.println("----------------------------------------------------------");

		Arrays.stream(nums).map(Math::sqrt).forEach(System.out::println);
		System.out.println("----------------------------------------------------------");

		Arrays.stream(nums).filter( x -> x%2==0 ).map(ele -> ele * ele).forEach(System.out::println);
		System.out.println("----------------------------------------------------------");
		
		OptionalDouble result = Arrays.stream(nums).reduce((x,y) -> x+y);
		System.out.println(result.getAsDouble());
		
		double result2 = Arrays.stream(nums).reduce(0,(x,y) -> x+y);
		System.out.println(result2);
		
		double result3 = Arrays.stream(nums).reduce(1,(x,y) -> x*y);
		System.out.println(result3);
		
	}

}
