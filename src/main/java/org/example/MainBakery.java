package org.example;


public class MainBakery {
    private static final int CLIENTS = 100;
    public static void main(String[] args) {
        TakeNumber tk = new TakeNumber();

        Baker bak= new Baker(tk);
        System.out.println("BAKERY STARTS");
        Thread thBaker = new Thread(bak);
        thBaker.start();

        for (int i=0; i<100; i++){
            Client c = new Client(tk);
            Thread client = new Thread(c);
            client.start();
        }

    }
}