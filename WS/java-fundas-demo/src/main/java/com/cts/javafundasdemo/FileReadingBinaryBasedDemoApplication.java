package com.cts.javafundasdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.util.Set;

import com.cts.javafundasdemo.models.Employee;

//Reading an object from a bianary stream is called DESERIALIZATION

public class FileReadingBinaryBasedDemoApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("FileName: ");
		String fileName = scan.nextLine();

		try(
				ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(fileName))
				){
			
			@SuppressWarnings("unchecked")
			Set<Employee> emps = (Set<Employee>) objIn.readObject();
			System.out.println("The employees read are: ");
			emps.stream().forEach(System.out::println);
			
		}catch(IOException | ClassNotFoundException exp) {
			System.out.println(exp.getMessage());
		}

		scan.close();
	}

}
