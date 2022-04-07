package cli;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MainColaLifo{

    public static void main(String[] args) {
        
        // Interfaz Deque (Double Ended QUEue)
        // EJEMPLO LIFO (LAST IN, FIRST OUT)
        Deque<String> productos = new LinkedList<>();
        productos.addAll(Arrays.asList("maquina1","maquina2","maquina3","maquina4"));
    
        // Para remover el ultimo elemento añadido a la cola, utilizar
        // pollLast() o removeLast(), la unica diferencia entre ambos
        // es que pollLast() retornara un null en caso de error, y
        // removeLast() tirara una excepcion.
        productos.pollLast();

        System.out.println(productos);
        String maquina = productos.pollLast();
        System.out.printf("Sacando la %s para el cliente...%n",maquina);
        System.out.println(productos);

        System.out.println("========================\n");

        // peekLast() retornara el ultimo objeto de la lista, pero no lo modificara
        // de ninguna manera
        maquina = productos.peekLast();
        System.out.printf("Mirando la %s %n",maquina);
        System.out.println(productos);


    }
}