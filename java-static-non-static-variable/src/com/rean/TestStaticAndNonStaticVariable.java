package com.rean;

public class TestStaticAndNonStaticVariable {

    private static int a; // global variable && static variable
    private final int b; // global variable && non static variable

    public TestStaticAndNonStaticVariable(int input) {
        a = input;
        b = input;
    }

    public static void main(String[] args) {
        System.out.println();
        //local variable
        int sum = 2 + 5;
        System.out.println("Sum two value = " + sum);

        TestStaticAndNonStaticVariable test = new TestStaticAndNonStaticVariable(5);
        System.out.println("A = " + test.a + " and B = " + test.b);

        TestStaticAndNonStaticVariable test1 = new TestStaticAndNonStaticVariable(4);
        System.out.println("A = " + test1.a + " and B = " + test1.b);
        System.out.println("A = " + test.a + " and B = " + test.b);
    }
}
