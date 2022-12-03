package com.learningjava.function;

public class DrawTreeChristmas {

	public static void printTree() {
		int a = 6;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int top = 3;
		int middle = top / 3 + top / 3;
		int bottom = top / 3;

		for (int cnt = 1; cnt <= bottom; cnt++) {
			// int height = 10;
			printTree();
		}

	/*	for (int cnt = 1; cnt <= middle; cnt++) {
			printTree();
		}*/
	}

}
