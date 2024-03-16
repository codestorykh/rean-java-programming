package com.codestroykh.reserved_keywords;

public class StaticDemoMain {
    public static void main(String[] args) {
        //keyword is used to specify that a method or variable belongs to the class,
        // rather than to an instance of the class.
        StaticDemo staticDemo = new StaticDemo();
        System.out.println(staticDemo.staticMethod());

        // Method or variable belong to class, not to an instance of the class
        System.out.println(StaticDemo.staticMethod());
    }
}
