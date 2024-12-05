package org.example;

import javax.sound.sampled.Clip;
import java.util.Random;

public class Client implements Runnable {
    private final static int MIN_WAIT=20000;
    private final static int MAX_WAIT=40001;
    TakeNumber tk;
    int clientNumber=0;

    public Client(TakeNumber tk){
        this.tk=tk;
    }

    public synchronized void setNumber(int n) {
        this.clientNumber = n;
    }

    public synchronized int getClientNumber() {
        return clientNumber;
    }

    @Override
    public void run() {
        Random rm = new Random();
        int waiting = rm.nextInt(MIN_WAIT, MAX_WAIT);
        try {
            Thread.sleep(waiting);
            tk.yourNumber(this);
            tk.order(this);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
