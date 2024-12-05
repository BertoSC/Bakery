package org.example;


public class MainBakery {
    private static final int CLIENTS = 100;
    public static void main(String[] args) {
        TakeNumber tk = new TakeNumber();

        Baker bak= new Baker(tk);
        System.out.println("BAKERY STARTS");
        Thread thBaker = new Thread(bak);
        thBaker.start();

        for (int i=1; i<=100; i++){
            Client c = new Client(tk, i);
            Thread client = new Thread(c);
            client.start();
        }

        try {
            thBaker.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}