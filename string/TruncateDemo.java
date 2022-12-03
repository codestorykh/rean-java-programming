package com.learningjava.string;

public class TruncateDemo {

	public static String truncate(String value, int length) {
		// Ensure String length is longer than requested size.
		if (value.length() > length) {
			return value.substring(0, length);
		} else {
			return value;
		}
	}

	public static void main(String[] args) {

		String test = "apple";
		// ... Truncate to 3 characters.
		String result1 = truncate(test, 3);
		System.out.println(result1);

		// ... Truncate to larger sizes: no exception occurs.
		String result2 = truncate(test, 10);
		System.out.println(result2);

		String result3 = truncate(test, 5);
		System.out.println(result3);
	}
}
