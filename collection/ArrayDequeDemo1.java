package com.learningjava.collection;

import java.util.ArrayDeque;

public class ArrayDequeDemo1 {

	public static void main(String[] args) {
		
		ArrayDeque<String> arrayDeque = new ArrayDeque<>();
		
		arrayDeque.add("Dara Talano");
		arrayDeque.add("Marakosolo");
		arrayDeque.add("Kamboprolono");
		
		for(String str : arrayDeque) {
			System.out.println(str);
		}
	}
}
