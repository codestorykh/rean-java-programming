package com.learningjava.thread;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created by t.daun on 10/5/2017.
 */
public class BookDataProcess implements Runnable {

    private int thread = 0;
    private ConcurrentLinkedDeque<Long> contractIds;

    public BookDataProcess(int thread, ConcurrentLinkedDeque<Long> contractIds) {
        this.thread = thread;
        this.contractIds = contractIds;
    }

    @Override
    public void run() {
        System.out.println("Start thread = " + thread);
        Long cotraId = null;
        int processed = 0;
        while ((cotraId = contractIds.poll()) != null) {
            System.out.println("Thread " + thread + " = " + contractIds.size());
            System.err.print("\n CotraID " + cotraId + "\n");
            System.err.print("\n contractIds " + contractIds + "\n");
            /*Contract contract = CONT_SRV.getById(Contract.class, cotraId);
            CON_OTH_SRV.calculateOtherDataContract(contract);*/
            processed++;
            if (processed % 100 == 0) {
               /* CON_OTH_SRV.flush();
                CON_OTH_SRV.clear();*/
               System.err.print("Proccess End Closs");
            }
        }
        System.out.println("End thread = " + thread);
    }
}
