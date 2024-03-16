package com.codestroykh.collection;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {

		TreeMap<Integer, Integer> tree = new TreeMap<>();
		// These calls place values in the TreeMap.
		tree.putIfAbsent(10, 100);
		tree.putIfAbsent(20, 200);
		// These have no effect because keys already exist.
		tree.putIfAbsent(10, -10);
		tree.putIfAbsent(20, -10);

		// Get keys (or default values) in the tree.
		int result1 = tree.getOrDefault(10, 0);
		int result2 = tree.getOrDefault(100, 0);
		System.out.println(result1);
		System.out.println(result2);

		for (Entry<Integer, Integer> entry : tree.entrySet()) {
			System.out.println(entry);
		}
	}

}
