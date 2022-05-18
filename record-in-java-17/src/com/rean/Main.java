package com.rean;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        PersonClazz personClazz = new PersonClazz("Java", "Test", 18);
        PersonRecord personRecord = new PersonRecord("Java", "Record", 0);
        System.out.println(personClazz);
        //System.out.println(personRecord.sum(2, 4));
        System.out.println(personRecord);
       /* System.out.println("Record components:");
        Arrays.asList(PersonRecord.class.getRecordComponents())
                .forEach(System.out::println);*/
    }
}
