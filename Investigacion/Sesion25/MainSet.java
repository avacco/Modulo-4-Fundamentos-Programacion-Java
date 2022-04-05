import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;

public class MainSet{
    public static void main(String[] args) {
        List<String> listadoLenguajes = new ArrayList<>( Arrays.asList("Java","PHP","Ruby","JS","Java","C++","C#"));

        // Set eliminará automaticamente entradas repetidas ingresadas a HashSet<>(elementos)
        //Set<String> listadoLenguajesSinDuplicados = new HashSet<>(listadoLenguajes);
        //listadoLenguajesSinDuplicados.forEach(System.out::println);

        // Por cada String lenguaje en listadoLenguajes, el booleano resultadoInsercion
        // sera true al añadirse un lenguaje a listadoLenguajesSinDuplicados, y si este
        // es true, se mandara un mensaje diciendo que se insertó correctamente el lenguaje al array
        // de lo contrario, si es duplicado, mandara un mensaje avisando que ya se habia insertado el lenguaje
        Set<String> listadoLenguajesSinDuplicados = new HashSet<>();
        for( String lenguaje : listadoLenguajes){
            boolean resultadoInsercion = listadoLenguajesSinDuplicados.add(lenguaje);
        
            if (resultadoInsercion){
                System.out.println("Se inserto correctamente el lenguaje "+lenguaje);
            }else{
                System.out.println("Ya se habia insertado el lenguaje "+lenguaje);
            }
        }

        System.out.println("================================");
        // TreeSet<>(elementos) ordena los elementos que se les de
        Set<String> lenguajesOrdenados = new TreeSet<>(listadoLenguajes);
        lenguajesOrdenados.forEach(System.out::println);


        System.out.println("================================");
        // Los metodos sort de Collections y Arrays pueden hacer el trabajo tambien
        // Aqui Collections a traves de sort ordenará los strings de la Z a la A
        // Cambiar los return de -1 a 1 y viceversa para revertir el efecto.
         Collections.sort(listadoLenguajes, new Comparator<String>() {
             
            @Override
            public int compare(String lenguaje1, String lenguaje2){
                if(lenguaje1.compareTo(lenguaje2) > 0){
                    return -1;
                }else if (lenguaje1.compareTo(lenguaje2) < 0){
                    return 1;
                }else{
                    return 0;
                }
             }
         });

         listadoLenguajes.forEach(System.out::println);

        // Arrays.sort(null, null);

    }
}