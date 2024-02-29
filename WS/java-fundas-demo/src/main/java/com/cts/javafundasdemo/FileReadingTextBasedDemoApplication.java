package com.cts.javafundasdemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReadingTextBasedDemoApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("FileName: ");
		String fileName = scan.nextLine();
		
		System.out.println("Enter the content to be Send into the file (type *** to stop): ");
		
		String line = scan.nextLine();
		
		List<String> lines = new ArrayList<>();
		
		while(!"***".equals(line)) {
			lines.add(line);
			line = scan.nextLine();
		}
		
		Path filePath = Paths.get(fileName);
		
		try {
			Files.write(filePath, lines);
			System.out.println("File saved!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		scan.close();
	}

}
