package com.learningjava.function;

public class DemoFullChristmas {

	public static void main(String[] args) {

		int top = 3;
		int middle = top / 2 + top / 2;
		int bottom = top / 3;

		for (int cnt = 1; cnt <= bottom; cnt++) {
			// int height = 10;
			printTree(0);
		}

		for (int cnt = 1; cnt <= middle; cnt++) {
			printTree(1);
		}
	}

	public static void printTree(int n) {
		int a = 6;
		for (int i = 1; i <= a; i++) {
			if (n == 1) {
				if (i == 1) {
					for (int kk = 0; kk < 5; kk++)
						System.out.print(" ");
					for (int kk = 5; kk < 10; kk++)
						System.out.print("*");

					for (int j = 1; j <= 5; j++) {

						System.out.print("*");
					}
				} else {
					for (int kk = 0; kk < 10 - i; kk++)
						System.out.print(" ");
					for (int kk = 10 - i; kk < 10; kk++)
						System.out.print("*");

					for (int j = 1; j <= i; j++) {

						System.out.print("*");
					}
				}

			} else {
				for (int kk = 0; kk < 10 - i; kk++)
					System.out.print(" ");
				for (int kk = 10 - i; kk < 10; kk++)
					System.out.print("*");

				for (int j = 1; j <= i; j++) {

					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
