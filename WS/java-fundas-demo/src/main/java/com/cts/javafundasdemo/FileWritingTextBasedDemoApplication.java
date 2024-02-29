package com.cts.javafundasdemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileWritingTextBasedDemoApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("FileName: ");
		String fileName = scan.nextLine();
		
		Path filePath = Paths.get(fileName);
		
		try {
			List<String> lines = Files.readAllLines(filePath);
			System.out.println("The file content is : \n");
			lines.stream().forEach(System.out::println);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		scan.close();
	}

}
