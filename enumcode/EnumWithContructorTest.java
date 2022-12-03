package com.learningjava.enumcode;

public class EnumWithContructorTest {

	public static void main(String args[]) {

		for (EnumWithConstructor dept : EnumWithConstructor.values()) {
			System.out.println("Department name: " + dept + " Department Code: " + dept.getDeptCode());
			System.out.println("Department name: " + dept + " Department Code: " + dept.getDeptID());
		}

	}
}
