package cli;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MainColaFifo{

    public static void main(String[] args) {
        // COLA FIFO (FIRST IN, FIRST OUT)

        Queue<String> filaSupermercado = new LinkedList<>();
        filaSupermercado.add("Pedro");
        // offer() y add() hacen lo mismo
        // add() lanza una excepcion cuando hay un problema
        // offer() retorna un false cuando hay un problema
        filaSupermercado.offer("Juan");
        filaSupermercado.add("Sergio");
        filaSupermercado.add("Carolina");

        System.out.println(filaSupermercado);
        //equivalente a:
        //System.out.println(filaSupermercado.toString());

        // poll() remueve el primer elemento de la cola
        String persona = filaSupermercado.poll();
        System.out.printf("Atendiendo a %s ... %n", persona);
        System.out.println(filaSupermercado);

        System.out.println("================================ \n");

        // remove() hace lo mismo, pero tira una excepcion cuando hay un problema
        persona = filaSupermercado.remove();
        System.out.printf("Atendiendo a %s ... %n", persona);
        System.out.println(filaSupermercado);

        System.out.println("================================ \n");

        //vacia la cola
        filaSupermercado.remove();
        filaSupermercado.remove();
        
        // persona sera null
        persona = filaSupermercado.poll();
        System.out.printf("Atendiendo a %s ... %n", persona);
        
        //lanzara una excepcion NoSuchElementException
        try{
            persona = filaSupermercado.remove();
        } catch (NoSuchElementException nsee){
            System.out.println("No hay mas clientes en fila.");
        }

     }


}