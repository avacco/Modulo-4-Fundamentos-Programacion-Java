package cli;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainColaPrioritaria {
    public static void main(String[] args) {
        // COLAS PRIORITARIAS

        // Crea productos leche con nombre y fecha de vencimiento
        Producto leche1 = new Producto("Leche 1lt",LocalDate.of(2022, 05, 12));
        Producto leche2 = new Producto("Leche 1lt",LocalDate.of(2022, 04, 07));
        Producto leche3 = new Producto("Leche 1lt",LocalDate.of(2022, 04, 24));
        Producto leche4 = new Producto("Leche 1lt",LocalDate.of(2022, 06, 05));
        Producto leche5 = new Producto("Leche 1lt",LocalDate.of(2022, 05, 17));
        
        // Ordena los productos de acuerdo a su fecha de vencimiento
        Queue<Producto> inventario = new PriorityQueue<>(Comparator.comparing(Producto::getVencimiento));
        
        // Añade las leches al inventario, se ordenan solas con el procedimiento anterior... en teoria
        inventario.addAll(Arrays.asList(leche1,leche2,leche3,leche4,leche5));
        
        // Las imprime por consola
        // Al parecer, aun se mostrara la lista desordenada
        inventario.forEach(leche -> System.out.printf("%s Vence: %td-%tm-%tY %n",leche.getNombre(),leche.getVencimiento(),leche.getVencimiento(),leche.getVencimiento()));
    
        System.out.println("=======================================================\n");
        // Remueve el producto mas proximo a vencer
        // Por algun motivo, esto activa la funcion de reorganizacion
        inventario.remove();

        // Ahora si mostrara ordenada la lista
        inventario.forEach(lecheX -> System.out.printf("%s Vence: %td-%tm-%tY %n",lecheX.getNombre(),lecheX.getVencimiento(),lecheX.getVencimiento(),lecheX.getVencimiento()));
    

    }
}

class Producto{

    protected String nombre;
    protected LocalDate vencimiento;

    public Producto(String nombre, LocalDate vencimiento){
        this.nombre = nombre;
        this.vencimiento = vencimiento;
    }

    public String getNombre(){return nombre;}
    public LocalDate getVencimiento(){return vencimiento;}
}