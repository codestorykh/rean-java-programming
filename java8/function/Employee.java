package com.learningjava.java8.function;

public class Employee {

	String name;

	Employee(String name) {
		this.name = name;
	}

	public static int nameCompare(Employee a1, Employee a2) {
		return a1.name.compareTo(a2.name);
	}

	public String toString() {
		return name;
	}
}
