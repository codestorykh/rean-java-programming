package com.learningjava.java8.example;

import java.util.Arrays;
import java.util.List;


public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] atp = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer", "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro", "Richard Gasquet", "John Isner"};
        List<String> players =  Arrays.asList(atp);

        // Old looping
        for (String player : players) {
            System.out.print(player + "; ");
        }

        System.out.println("");

        // Using lambda expression and functional operations
        players.forEach((player) -> System.out.print(player + "; "));

        System.out.println("");

        // Using double colon operator in Java 8
        players.forEach(System.out::println);

        System.out.println("");

        // Using anonymous innerclass
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        }).start();

        // Using lambda expression
        new Thread(() -> System.out.println("Hello world !")).start();

        // Using anonymous innerclass
        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        };

        // Using lambda expression
        Runnable race2 = () -> System.out.println("Hello world !");

        // Run em!
        race1.run();
        race2.run();
    }

}
