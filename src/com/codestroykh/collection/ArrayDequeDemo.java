package com.codestroykh.collection;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
		arrayDeque.push(50);
		arrayDeque.push(100000);
		arrayDeque.push(1000);
		
		// Peek to get the top item, but do not remove it.
		int peekResult = arrayDeque.peek();
		System.out.println(peekResult);
		
		// Call pop on the Deque.
        int popResult = arrayDeque.pop();
       // System.out.println(popResult);
		
     // Pop again.
        popResult = arrayDeque.pop();
        System.out.println(popResult);
        
	}
}
