package com.learningjava.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatePerformance {

	static boolean hasDuplicates(ArrayList<String> list) {
		// See if duplicates exist (see above example).
		for (int i = 0; i < list.size(); i++) {
			for (int x = i + 1; x < list.size(); x++) {
				if (list.get(i) == list.get(x)) {
					return true;
				}
			}
		}
		return false;
	}

	static ArrayList<String> removeDuplicates(ArrayList<String> list) {
		// Remove Duplicates: place them in new list (see above example).
		ArrayList<String> result = new ArrayList<>();
		HashSet<String> set = new HashSet<>();
		for (String item : list) {
			if (!set.contains(item)) {
				result.add(item);
				set.add(item);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		ArrayList<String> elements = new ArrayList<>();
		elements.add("one");
		elements.add("two");
		elements.add("three");
		elements.add("four");

		long t1 = System.currentTimeMillis();

		// Version 1: test to see if duplicates exist.
		for (int i = 0; i < 10000000; i++) {
			if (hasDuplicates(elements)) {
				System.out.println(false);
			}
		}

		long t2 = System.currentTimeMillis();

		// Version 2: process list even if no duplicates.
		for (int i = 0; i < 10000000; i++) {

			ArrayList<String> copy = removeDuplicates(elements);
			if (copy == null) {
				System.out.println(false);
			}
		}

		long t3 = System.currentTimeMillis();

		// ... Benchmark results.
		System.out.println(t2 - t1);
		System.out.println(t3 - t2);
	}
}
