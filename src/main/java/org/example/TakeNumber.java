package org.example;

import java.util.Random;

public class TakeNumber {
    int machineNumber=0;
    Boolean serving=false;
    Boolean waiting;
    int turn=1;
        public synchronized int yourNumber(Client c) {
        machineNumber++;
        System.out.println("Customer "+Thread.currentThread().getName()+ " takes ticket: "+machineNumber);
        return machineNumber;
    }

    public synchronized void bake() throws InterruptedException {
        while(machineNumber==0){
            System.out.println("The baker is waiting for clients");
            wait();
        }

        System.out.println("The baker serves: "+turn);
        notifyAll();
    }

    public synchronized void order(Client c) throws InterruptedException {
        while(turn!=c.getClientNumber()){
            wait();
        }
        System.out.println("Takes order");
         notifyAll();
    }
}
