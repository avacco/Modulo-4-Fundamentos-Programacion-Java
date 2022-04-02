import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PruebaIterator {

    public static void main(String[] args){
        List<String> nombres = new ArrayList<>( Arrays.asList("Gonzalo","Andres","Sebastian"));

        // Nuevos items se añaden al final de la lista
        nombres.add("Pedro");
        nombres.add(0,"Juan"); // Pondra este item en la posicion 0, corriendo todos los demas abajo

        // Reemplazo
        // En array tradicional
        String[] nombres2 = {"Gonzalo","Andres","Sebastian"};
        nombres2[0] = "Juan"; // A diferencia del ArrayList, este sobreescribira al item 0
        nombres.set(3,"Paola"); // En ArrayList se debe utilizar .set() para el mismo efecto

        System.out.println("Primer item nombres2: "+nombres2[0]);


        // Forma 1
        Iterator<String> iterador = nombres.iterator();

        while( iterador.hasNext()){
            System.out.printf("Nombre = '%s' %n", iterador.next() );
        }

        //Forma 2, no recomendada para eliminar datos de un array
        for(String nombre : nombres){
            System.out.printf("Nombre = '%s' %n", nombre );
        }

        // Equivalentes
        System.out.println( "Nombres: "+nombres );
        System.out.println( "Nombres: "+nombres.toString() );

        //Contains
        //No se puede acceder al item que desencadena el .contains()
        if(nombres.contains("Pedro")){
            System.out.println("Pedro está en el ArrayList\n");
        }
        
        //Se puede hacer algo parecido con .indexOf()
        int indicePedro = nombres.indexOf("Pedro");
        System.out.printf("El indice de Pedro es %d",indicePedro);



    }
}