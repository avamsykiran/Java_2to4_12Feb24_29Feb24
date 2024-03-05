package com.cts.javafundasdemo;

public class ThreadDemoApplication1 {

	public static void main(String[] args) {
		Thread th = Thread.currentThread();
		System.out.println("The current main method is running in a thread named: "+th.getName() );
	}

}
