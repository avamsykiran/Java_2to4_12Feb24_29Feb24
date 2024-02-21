package com.cts.javafundasdemo.service;

public class Swapper<T> { // here T is a generic or a ADT

	public void swap(T a, T b) {
		System.out.println(String.format("Before Swapping %s \t %s", a,b));
		T t;
		t = b;
		b = a;
		a = t;
		System.out.println(String.format("After Swapping %s \t %s", a,b));
	}

}