package com.codestroykh.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

		System.err.println(names);
		
		Collections.sort(names, new Comparator <String>() {
			@Override
			public int compare(String a, String b) {
				
				return b.compareTo(a);
			}
		});
		
		System.err.println(names);
	}
}
