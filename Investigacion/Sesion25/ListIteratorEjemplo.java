
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

public class ListIteratorEjemplo {
     public static void main(String[] args) {
        List<String> lenguajes = Arrays.asList("PHP","Java","JS","Ruby","CB");
        
        Iterator<String> iteradorNormal = lenguajes.iterator();
        ListIterator<String> iteradorLista = lenguajes.listIterator();   
    
        while(iteradorNormal.hasNext() ){
            String lenguaje = iteradorNormal.next();
            System.out.println("Lenguaje = "+lenguaje);
        }

        System.out.println("=========================");

        while(iteradorLista.hasNext()){
            String legnuajeAnterior = "";
            if(iteradorLista.hasPrevious()){
                legnuajeAnterior = String.format("| lenguaje anterior = %s", iteradorLista.previous());
                if(iteradorLista.hasNext()){
                    iteradorLista.next();
                }
            }

            String lenguaje = String.format("Lenguaje = %s", iteradorLista.next());
            System.out.printf("%s | %s %n",lenguaje, legnuajeAnterior);
    
        }   
     }
}