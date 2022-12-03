package com.learningjava.java8.example;

import java.util.Arrays;
import java.util.Comparator;

public class LabmdaEx {

	public static void main(String[] args) {

		String[] players = { "Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer",
				"Andy Murray", "Tomas Berdych", "Juan Martin Del Potro", "Richard Gasquet", "John Isner" };

		Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
		Arrays.sort(players, sortByName);
		// or this
		Arrays.sort(players, (String s1, String s2) -> (s1.compareTo(s2)));

		System.out.print("\nShow the list of players after sorting by name:\n");
		Arrays.asList(players).forEach((player) -> System.out.println(player));

	}
}
