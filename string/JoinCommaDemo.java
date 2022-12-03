package com.learningjava.string;

public class JoinCommaDemo {

	public static void main(String[] args) {

		String value1 = "dot";
		String value2 = "net";
		String value3 = "perls";

		// Join the three local variables' data.
		String joined = String.join(",", value1, value2, value3);
		System.out.println(joined);
	}
}
