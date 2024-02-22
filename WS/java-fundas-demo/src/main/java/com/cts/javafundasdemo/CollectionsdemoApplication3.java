package com.cts.javafundasdemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class CollectionsdemoApplication3 {

	public static void main(String[] args) {

		Map<Integer,String> digitNames = new LinkedHashMap<>();
		
		digitNames.put(0,"ZERO");
		digitNames.put(1,"ONE");
		digitNames.put(2,"TWO");
		digitNames.put(3,"THREE");
		digitNames.put(4,"FOUR");
		digitNames.put(5,"FIVE");
		digitNames.put(6,"SIX");
		digitNames.put(7,"SEVEN");
		digitNames.put(8,"EIGHT");
		digitNames.put(9,"NINE");
		
		for(Integer key : digitNames.keySet()) {
			System.out.println(key + "\t" + digitNames.get(key));
		}
	}

}
