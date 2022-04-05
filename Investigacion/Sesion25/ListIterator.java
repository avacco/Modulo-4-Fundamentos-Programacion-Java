
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

public class ListIterator {
     public static void main(String[] args) {
        List<String> lenguajes = Arrays.asList("PHP","Java","JS","Ruby","CB");
        
        Iterator<String> iteradorNormal = lenguajes.iterator();
        ListIterator<String> iteradorLista = lenguajes.listIterator();   
    
        while(IteradorNormal.hasNext() ){
            String lenguaje = iteradorNormal.next();
            System.out.println("Lenguaje = "+lenguaje);
        }

        System.out.println("=========================");

        while(iteradorLista.hasNext()){
            String lenguaje = iteradorLista.next();
            System.out.println("Lenguaje = "+lenguaje);
            String lenguajeAnterior = iteradorLista.previous();
            System.out.println(" | Lenguaje anterior = "+lenguajeAnterior);
            iteradorLista.next(); // Previene un loop infinito
        }
    }   
    
    
}