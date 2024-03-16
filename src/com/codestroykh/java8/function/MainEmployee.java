package com.codestroykh.java8.function;

import java.util.Arrays;


public class MainEmployee {

	public static void main(String[] args) {
        
		Employee[] employees = {
				new Employee("David"),
	              new Employee("Naveen"),
	              new Employee("Alex"),
	              new Employee("Richard")
		};
		
		System.out.println("Before Sorting Names: "+Arrays.toString(employees));
        Arrays.sort(employees, Employee::nameCompare);
        System.out.println("After Sorting Names "+Arrays.toString(employees));
        
	}
}
