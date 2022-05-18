package com.rean;

import java.io.Serializable;

public record PersonRecord(String firstName, String lastName, int age) implements Serializable {

    private final static String DEMO = "DEMO";


    double sum(double a, double b) {
        return a + b;
    }

    public PersonRecord {
        StringBuilder builder = new StringBuilder();
        if(age >= 18) {
            builder.append("Age above 18");
        }
        if(age < 18) {
            builder.append("Age below 18");
        }
        if(0 == age) {
            throw new IllegalArgumentException(builder.toString());
        }
    }
}
