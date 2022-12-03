package com.learningjava.java8.basicsyntax;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
	      names.add("IT");
	      names.add("HR");
	      names.add("LEGLE");
	      names.add("MAKETING");
	      names.add("ACCOUNTIN");
			
	      names.forEach(System.out::println);
	}
}
