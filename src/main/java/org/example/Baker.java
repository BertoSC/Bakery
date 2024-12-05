package org.example;

import java.util.Random;

public class Baker implements Runnable{
    TakeNumber tk;
    private int numberServed;
    private final static int MIN_WAIT=0;
    private final static int MAX_WAIT=1001;

    public Baker(TakeNumber tk){
        this.tk = tk;
    }

    public int getNumberServed() {
        return numberServed;
    }

    public void setNumberServed(int numberServed) {
        this.numberServed = numberServed;
    }

    @Override
    public void run() {
        try {
            System.out.println("Baker starts cooking");
            tk.bake();
            Random rm = new Random();
            int coocking = rm.nextInt(MIN_WAIT, MAX_WAIT);
            try {
                Thread.sleep(coocking);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
