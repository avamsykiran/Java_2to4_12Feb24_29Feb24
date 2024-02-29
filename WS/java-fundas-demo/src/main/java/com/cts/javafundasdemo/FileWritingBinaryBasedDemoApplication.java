package com.cts.javafundasdemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.cts.javafundasdemo.models.Employee;

//Writing an object inot a bianry stream is called SERIALIZATION

public class FileWritingBinaryBasedDemoApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("FileName: ");
		String fileName = scan.nextLine();

		Set<Employee> emps = new TreeSet<>();

		emps.add(new Employee(1, "Vamsy", 45000));
		emps.add(new Employee(10, "Bharwa", 46000));
		emps.add(new Employee(9, "Karthik", 75000));
		emps.add(new Employee(7, "Aruna", 95000));
		emps.add(new Employee(6, "Drona", 58000));
		emps.add(new Employee(8, "Chaitanya", 41000));
		emps.add(new Employee(5, "Zareena", 25000));
		emps.add(new Employee(3, "Farookh", 35000));
		emps.add(new Employee(4, "Edward", 85000));
		emps.add(new Employee(2, "Viswa", 50000));
		

		try(
				ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(fileName))
				){
			
			objOut.writeObject(emps);
			System.out.println("File Saved!");
			
		}catch(IOException exp) {
			System.out.println(exp.getMessage());
		}

		scan.close();
	}

}
