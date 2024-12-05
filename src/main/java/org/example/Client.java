package org.example;

import java.util.Random;

public class Client implements Runnable {
    private TakeNumber tomarNumero;
    private int clientNumber;
    private int numeroTicket;

    public Client(TakeNumber tomarNumero, int i) {
        this.tomarNumero = tomarNumero;
        this.clientNumber=i;

    }

    public synchronized int getClientNumber() {
        return clientNumber;
    }



    public synchronized void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public synchronized int getNumeroTicket() {
        return numeroTicket;
    }

    @Override
    public void run() {
        try {
            Random random = new Random();
            int tiempoEspera = random.nextInt(2000, 4001);
            Thread.sleep(tiempoEspera);
            tomarNumero.tomarTicket(this);
            tomarNumero.tomarPan(this);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}