package com.codestroykh.collection;

import java.util.HashMap;
import java.util.TreeMap;

public class PerformanceHashMapTreeMap {

	public static void main(String[] args) throws Exception {

		HashMap<Integer, Integer> hash = new HashMap<>();
		TreeMap<Integer, Integer> tree = new TreeMap<>();

		// Add values to our collections.
		for (int v = 0; v < 1000; v += 100) {
			hash.put(v, v);
			tree.put(v, v);
		}
		// Ensure methods are compiled.
		if (hash.containsKey(999) || tree.containsKey(999)) {
			throw new Exception();
		}

		long t1 = System.currentTimeMillis();

		// Version 1: do lookups in HashMap.
		for (int i = 0; i < 10000000; i++) {
			if (!hash.containsKey(500) || !hash.containsKey(900) || hash.containsKey(999)) {
				throw new Exception();
			}
		}

		long t2 = System.currentTimeMillis();

		// Version 2: do lookups in TreeMap.
		for (int i = 0; i < 10000000; i++) {
			if (!tree.containsKey(500) || !tree.containsKey(900) || tree.containsKey(999)) {
				throw new Exception();
			}
		}

		long t3 = System.currentTimeMillis();

		// ... Benchmark times.
		System.out.println(t2 - t1);
		System.out.println(t3 - t2);
	}

}
