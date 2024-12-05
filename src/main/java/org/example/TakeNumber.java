package org.example;

import java.util.Random;

public class TakeNumber {
    private int numeroTicket = 0;

    public synchronized int getAtendidos() {
        return atendidos;
    }

    private int atendidos =0;


    public synchronized void tomarTicket(Client cliente) throws InterruptedException {
        numeroTicket++;
        cliente.setNumeroTicket(numeroTicket);
        System.out.println("Cliente"+ Thread.currentThread().getName()+ "toma ticket #" + numeroTicket);

    }

    public synchronized void tomarPan(Client client) throws InterruptedException {
        while (!(client.getNumeroTicket()==atendidos+1)){
            wait();
        }
        System.out.println(client.getNumeroTicket()+ "ha recogido el pan con ticket "+client.getNumeroTicket());
        notifyAll();
    }

    public synchronized void servirCliente() throws InterruptedException {
            while (numeroTicket==0 || atendidos>numeroTicket) {
                System.out.println("Empleado esperando (no hay clientes para servir)");
                wait();
            }
            atendidos++;
            notifyAll();

    }
}