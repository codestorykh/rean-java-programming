package com.learningjava.string;

public class JoinMergeDemo {

	public static void main(String[] args) {

		String[] array = { "A", "B", "C" };
		// Join with an empty delimiter.
		String merged = String.join("", array);
		System.out.println(merged);
	}
}
