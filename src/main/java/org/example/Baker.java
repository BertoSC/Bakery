package org.example;

import java.util.Random;

public class Baker implements Runnable {
    private TakeNumber tomarNumero;

    public Baker(TakeNumber tomarNumero) {
        this.tomarNumero = tomarNumero;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Random random = new Random();
                int tiempoServicio = random.nextInt(1001);
                Thread.sleep(tiempoServicio);
                tomarNumero.servirCliente();  // El empleado comienza a servir a los clientes
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}