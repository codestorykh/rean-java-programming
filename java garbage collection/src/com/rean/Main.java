package com.rean;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
	// write your code here
        Runtime runtime = Runtime.getRuntime();
        double avlMemory = runtime.freeMemory();
        System.out.println("AVL memory start app: " + avlMemory / 1024 + "k");
        List<Person> people = new ArrayList<>();
        for(int i =0; i <1000000; i ++){
            people.add(new Person("TEST GC"));
        }
        avlMemory = runtime.freeMemory();
        System.out.println("AVL after crate array: " + avlMemory /1024 + "k");
        Thread.sleep(2000);
        avlMemory = runtime.freeMemory();
        System.out.println("AVL after sleep 10000 ms: " + avlMemory / 1024 + "k");
        System.gc();
        avlMemory = runtime.freeMemory();
        System.out.println("AVL after call gc method: " + avlMemory / 1024 + "k");
    }

    public static class Person {
        public String firstName;
        public Person(String firstName) {
            this.firstName = firstName;
        }
    }
}
