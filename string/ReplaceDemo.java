package com.learningjava.string;

public class ReplaceDemo {
	public static void main(String[] args) {

		String value = "Java";

		// Replace letter with underscore.
		String result = value.replace('a', '_');
		System.out.println(result);

		String pets = "cat cat cat";

		// Use metacharacter to ensure the replacement is at the end.
		String results = pets.replaceFirst("cat$", "dog");
		System.out.println(results);
	}
}
