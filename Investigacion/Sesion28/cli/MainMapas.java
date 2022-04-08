package cli;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainMapas{

    public static void main(String[] args) {

        Map<String, List<String>> paisesSegunContinente = new HashMap<>();

        // put(clave,valor)
        paisesSegunContinente.put("America", Arrays.asList("Chile","Colombia","Peru","Venezuela"));
        paisesSegunContinente.put("Europa", Arrays.asList("España","Portugal","Alemania","Francia"));
        paisesSegunContinente.put("Africa", Arrays.asList("Egipto","Sudafrica","Nigeria","Tanzania"));

        // Anidamiento de forEach
        paisesSegunContinente.forEach((continente,paises)->{
           paises.forEach(pais->System.out.printf("%s pertenece al continente %s %n",pais,continente)); 
        });

    }

    public static void mapasConTreeMap(){
        Map<String, String> traducciones = new TreeMap<>();
        
        // put(clave,valor)
        // Inserta de manera ordenada en orden alfabetico los valores. Simbolos van despues de la Z
        traducciones.put("Hola","Hello");
        traducciones.put("Chao","Bye");
        traducciones.put("Buenos dias","Good morning");
        traducciones.put("¿Como estás?","How are you?");

        traducciones.forEach((clave,valor)-> System.out.printf("Español: %s | Ingles: %s %n",clave,valor));
    }

    public static void mapasConLinkedHashMap(){
        Map<String, String> traducciones = new LinkedHashMap<>();
        
        // put(clave,valor)
        // Inserta de manera ordenada segun se fueron agregando los valores
        traducciones.put("Hola","Hello");
        traducciones.put("Chao","Bye");
        traducciones.put("Buenos dias","Good morning");
        traducciones.put("¿Como estás?","How are you?");

        traducciones.forEach((clave,valor)-> System.out.printf("Español: %s | Ingles: %s %n",clave,valor));

    }

    public static void mapasConHashMap(){
        Map<String, String> traducciones = new HashMap<>();
        
        // put(clave,valor)
        // Inserta de manera desordenada los valores
        traducciones.put("Hola","Hello");
        traducciones.put("Chao","Bye");
        traducciones.put("Buenos dias","Good morning");
        traducciones.put("¿Como estás?","How are you?");

        //get() toma la clave y retorna el valor.
        String buenosDiasEnIngles = traducciones.get("Buenos dias");
        System.out.printf("Buenos dias en ingles se dice %s %n",buenosDiasEnIngles);
    }
}