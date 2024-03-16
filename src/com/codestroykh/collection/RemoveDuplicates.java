package com.codestroykh.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {

	static ArrayList<String> removeDuplicates(ArrayList<String> list) {

		// Store unique items in result.
		ArrayList<String> result = new ArrayList<>();

		// Record encountered Strings in HashSet.
		HashSet<String> set = new HashSet<>();

		// Loop over argument list.
		for (String item : list) {

			// If String is not in set, add it to the list and the set.
			if (!set.contains(item)) {
				result.add(item);
				set.add(item);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("dog");
		list.add("cat");
		list.add("dog");
		list.add("dog");
		list.add("cat");
		list.add("bird");

		// Remove duplicates from ArrayList of Strings.
		ArrayList<String> unique = removeDuplicates(list);
		for (String element : unique) {
			System.out.println(element);
		}
	}
}
