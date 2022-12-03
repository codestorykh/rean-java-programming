package com.learningjava.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by t.daun on 10/5/2017.
 */
public class BookTest {

    public static void main(String [] args){

        ConcurrentLinkedDeque<Long> contractIds = new ConcurrentLinkedDeque<>(getContracts());

        System.out.println("Start");
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.execute(new BookDataProcess(i + 1, contractIds));
            System.out.print("Result in main: => " + i);
        }
        executorService.shutdown();
        try {
            System.out.println("Waiting for Thread completion");
            executorService.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static List<Long> getContracts(){
        List<Long> bookList = new ArrayList<Long>();
        for(int i = 0; i < 10; i++){
            bookList.add((long) i);
        }

        return bookList;
    }
}
