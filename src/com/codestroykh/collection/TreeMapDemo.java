package com.codestroykh.collection;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		// Create TreeMap and add three entries to it.
		TreeMap<String, Integer> tree = new TreeMap<>();
		tree.put("cat", 6);
		tree.put("dog", 4);
		tree.put("bird", 10);

		// Look up a value from a key in the TreeMap.
		int value = tree.get("dog");
		System.out.println(value);
	}
}
