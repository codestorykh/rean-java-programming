package com.learningjava.string;

public class SplitDemo {

	public static void main(String[] args) {

		// This string has three words separated by commas.
		String value = "cat,dog,bird";

		// Split on a comma.
		String parts[] = value.split(",");

		// Display result parts.
		for (String part : parts) {
			System.out.println(part);
		}
		
		
		String line = "1, 2, 3";

        // Split on two-char sequence.
        String[] numbers = line.split(", ");

        // Display numbers.
        for (String number : numbers) {
            int values = Integer.parseInt(number);
            System.out.println(values + " * 20 = " + values * 20);
        }
	}
}
