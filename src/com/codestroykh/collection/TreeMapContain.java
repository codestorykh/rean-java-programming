package com.codestroykh.collection;

import java.util.TreeMap;

public class TreeMapContain {

	public static void main(String[] args) {

		TreeMap<String, String> tree = new TreeMap<>();
		tree.put("red", "apple");

		// Test the containsKey and containsValue methods.
		if (tree.containsKey("red")) {
			System.out.println(true);
		}
		if (tree.containsValue("apple")) {
			System.out.println(true);
		}
	}
}
