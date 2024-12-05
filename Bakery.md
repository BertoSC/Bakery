## DU2 - Exercise 14 - Bakery tickets - wait() and notify()

A clerk in a bakery serves customers in the order they took their tickets. Customers take tickets in a random order.

The program must simulate that 100 clients want to be served by the clerk. When the clerk finishes serving the clients, the simulation must end.

The clerk takes a random time of no more than 1000ms to serve a customer.

Each client waits a random time between 20000 and 40000 milliseconds to take a number after entering the bakery.

You have to use four classes in this project: Bakery (main), TakeANumber (shared resource), Clerk and Customer.

The messages to be displayed during execution are:

Starting clerk and customer threads (simulation begins)

Clerk waiting (there are no clients to serve)

Customer #numClient takes ticket #numTicket

Clerk serving ticket #numTicket

--

## DU2 - Ejercicio 14 - Tickets de panadería - wait() y notify()

El dependiente de una panadería sirve a los clientes en el orden en que cogieron sus tickets. Los clientes cogen los tickets en un orden aleatorio.

El programa debe simular que 100 clientes quieren ser atendidos por el dependiente. Cuando el dependiente termine de servir a los clientes, la simulación debe terminar.

El dependiente tarda un tiempo aleatorio no superior a 1000ms en servir a un cliente.

Cada cliente espera un tiempo aleatorio entre 20000 y 40000 milisegundos para tomar un número después de entrar en la panadería.

Tienes que usar cuatro clases en este proyecto: Panadería (principal), TomarNúmero (recurso compartido), Empleado y Cliente.

Los mensajes a mostrar durante la ejecución son:

Iniciando hilos de dependiente y cliente (comienza la simulación)

Empleado esperando (no hay clientes para servir)

Cliente #numCliente toma ticket #numTicket

Empleado sirviendo ticket #numTicket
