package com.learningjava.equalhashcode;

import java.util.HashSet;

public class EqualsNHashCode {

	public static void main(String args[]) {

		HashSet<Employee> empHashSet = new HashSet<>();
		empHashSet.add(new Employee("David", 32));
		empHashSet.add(new Employee("John", 45));
		empHashSet.forEach(System.out::println);
		boolean isRemoved = empHashSet.remove(new Employee("David", 32));
		System.out.println("David is removed: " + isRemoved);
		empHashSet.forEach(System.out::println);
	}
}
