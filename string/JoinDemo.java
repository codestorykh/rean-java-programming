package com.learningjava.string;

public class JoinDemo {

	public static void main(String[] args) {
		// Create String array of three elements.
		String[] values = { "bird", "cat", "wildebeest" };

		// Join the elements together.
		String result = String.join("...", values);
		System.out.println(result);
	}
}
