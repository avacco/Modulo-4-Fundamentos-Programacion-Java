package cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import sortear.OrdenTransporteByCapacidadCargaDesc;
import Medios.*;

public class Main {

	public static void main(String[] args) {
		//////////////////////////////// LOCALE ////////////////////////////////
		//Define el idioma instanciando Locale y dandole un valor apropiado (https://www.oracle.com/java/technologies/javase/java8locales.html)
		Locale.setDefault(new Locale("en","US"));
				
		//////////////////////////////// POLIMORFISMO ////////////////////////////////
		Collection<String> lenguajes = Arrays.asList("Java","Go","PHP","JS","Ruby");
		lenguajes.forEach(System.out::println); // Por cada elemento en la Coleccion "lenguajes", escribe un print con los elementos de la Coleccion.
		
		//////////////////////////////// LAMBDA ////////////////////////////////
		// Forma 1: parametro -> valorRetorno
		// Forma 2: (parametro) -> valorRetorno
		// Forma 3: (parametro1, parametro2) -> valorRetorno
		// Forma 4: parametro -> {expresion1; return expresion2;}
		// Filtra elementos de la Coleccion "lenguajes", toma solo los que empiezan con la letra J,
		// los guarda en la variable "lenguaje" y los muestra por consola
		lenguajes.stream().filter(lenguaje -> lenguaje.startsWith("J")).forEach(System.out::println);
		
		
		// Si se quiere guardar la lista de elementos filtrados a una lista
		List<String> lenguajesComienzanJ = lenguajes
			.stream()
			.filter(lenguaje -> lenguaje.startsWith("J") )
			.toList()
		;
		
		System.out.println(lenguajesComienzanJ);
		
		//////////////////////////////// COLLECTION ////////////////////////////////
		// Las clases de Collection solo soportan objetos, no datos primitivos
		// Aqui se crea un array con capacidades de carga, se declara una variable de acumulado y una de capacidad total,
		// luego se utiliza stream().reduce() para reducir el tama�o del array sumando todas las capacidades del mismo array.
		// Finalmente, se muestra por consola la capacidad total.
		//NOTA: Esto no modifica el array de ningnua manera.
		List<Integer> capacidadesCarga = Arrays.asList(10,20,30);
		int acumulado = 0;
		int capacidadCargaEmpresa = capacidadesCarga.stream().reduce(acumulado, (acum, capacidadCarga) -> acum + capacidadCarga); 
		System.out.printf("La capacidad de carga de la Empresa es %d %n", capacidadCargaEmpresa);
		System.out.println(capacidadesCarga);
		
		List<Terrestre> transportesTerrestres = Arrays.asList(
				new Automovil(1000, 7900000,"SSXC35"),
				new Automovil(2000, 11900000,"HHMN10"),
				new Automovil(1000, 6900000,"GGLU17")
				);
		double capacidadCargaEmpresa2 = transportesTerrestres.stream().mapToDouble((auto) -> auto.getCapacidadCarga()).sum();
		System.out.printf("La capacidad de carga de la empresa es %.2f kg %n", capacidadCargaEmpresa2);

		System.out.println("=============================================================");

		List<Transporte> activos = new ArrayList<>();
		activos.add(new Automovil(1000, 7900000,"CAXH87"));
		activos.add(new Automovil(2000, 11900000,"VKLX46"));
		activos.add(new Bicicleta("NA", 80, 1, 2, 200000));
		activos.add(new Bicicleta("NA", 80, 1, 2, 150000));		
		
		//////////////////////////////// SORT ////////////////////////////////
		// Ordena la lista activos de manera natural
		//Collections.sort(activos);
		//activos.forEach(System.out::println);
	
		// Hace lo mismo, pero evita los duplicados
		//Set<Transporte> activosOrdenados = new TreeSet<>(activos);
		//activosOrdenados.forEach(System.out::println);

		// Lo mismo
		/*
		Set<Transporte> activosOrdenados = new TreeSet<>();
		for(Transporte transporte : activos){
			activosOrdenados.add(transporte);
		}
		activosOrdenados.forEach(System.out::println);
		*/
		// Lo mismo otra vez, pero llamando a un metodo de una interfaz
		Collections.sort(activos, new OrdenTransporteByCapacidadCargaDesc());
		activos.forEach(System.out::println);

		//////////////////////////////// SEPARADORES POR PUNTO O COMA ////////////////////////////////
		// La forma de separar va a depender del Locale utilizado. En esta clase fue definida como en-US
		// Y por lo tanto sera separado por coma en el formato estadounidense
		for (Transporte t : activos){
			System.out.printf("Avaluo %d %n",t.getAvaluo()); // Dara valor sin puntos ni comas separadoras
			System.out.printf("Avaluo %,d %n",t.getAvaluo()); // Dara valor con puntos separadores

		}

		System.out.println("=======================================================0");

		//////////////////////////////// HASH CODES ////////////////////////////////
		Automovil auto1 = new Automovil(1000,5000000, "ABCD17");
		Automovil auto2 = new Automovil(1500,9000000, "ABCD17"); //No añadira duplicados de patente
		Automovil auto3 = new Automovil(1200,8000000, "EXEA62");
		Automovil auto4 = new Automovil(1700,6000000, "COSO92");

		Moto moto1 = new Moto(500, 2000000, "xp151");
		Moto moto2 = new Moto(250, 1200000, "jf122");
		Moto moto3 = new Moto(700, 3100000, "nm718");
		Moto moto4 = new Moto(600, 2500000, "an528");
	
		Set<Transporte> activosAutoMoto = new HashSet<>();
		activosAutoMoto.add(auto1);
		activosAutoMoto.add(auto2);
		activosAutoMoto.add(auto3);
		activosAutoMoto.add(auto4);

		activosAutoMoto.add(moto1);
		activosAutoMoto.add(moto2);
		activosAutoMoto.add(moto3);
		activosAutoMoto.add(moto4);

		activosAutoMoto.forEach(System.out::println);

		System.out.println("=============================================================");
		//////////////////////////////// HASH CODES IGUALES E INNER CLASSES ////////////////////////////////
		// Se puede dar el caso en que dos HashCodes sean iguales, pero distintos a la vez
		Profesor profesor1 = new Profesor(1,"Juan P.");
		Profesor profesor2 = new Profesor(2,"Ramon Q.");
		Profesor profesor3 = new Profesor(3,"Jorge R.");

		Alumno alumno1 = new Alumno(1,"Raquel A.");
		Alumno alumno2 = new Alumno(2,"Carolina B.");
		Alumno alumno3 = new Alumno(3,"Marcos C.");

		System.out.printf("%n profesor1 hashcode() = %d  ",profesor1.hashCode());
		System.out.printf("%n alumno1 hashcode() = %d  ",alumno1.hashCode());
		System.out.printf("%n profesor1 es igual a alumno1 = %b %n  ",profesor1.equals(alumno1));

		System.out.printf("%n profesor2 hashcode() = %d  ",profesor2.hashCode());
		System.out.printf("%n alumno2 hashcode() = %d  ",alumno2.hashCode());
		System.out.printf("%n profesor2 es igual a alumno2 = %b %n  ",profesor2.equals(alumno2));

		System.out.printf("%n profesor3 hashcode() = %d  ",profesor3.hashCode());
		System.out.printf("%n alumno3 hashcode() = %d  ",alumno3.hashCode());
		System.out.printf("%n profesor3 es igual a alumno3 = %b %n",profesor3.equals(alumno3));
	
		Set<Persona> personas = new HashSet<>();
		personas.add(profesor1);
		personas.add(profesor2);
		personas.add(profesor3);

		personas.add(alumno1);
		personas.add(alumno2);
		personas.add(alumno3);

		personas.forEach(p -> System.out.printf("ID %d Nombre: %s %n",p.getId(),p.getNombre()));
	
		System.out.println("=================================================================");
		//////////////////////////////// CONJUNTOS ////////////////////////////////

		Set<Integer> conjunto1 = new HashSet(Arrays.asList(1,2,3,4,5));
		Set<Integer> conjunto2 = new HashSet(Arrays.asList(6,7,8,9,10));
		Set<Integer> conjuntoPares = new HashSet(Arrays.asList(2,4,6,8,10));
		/*
		System.out.println(conjunto1);
		conjunto1.addAll(conjunto2); // Une los conjuntos
		System.out.println(conjunto1); // Con los conjuntos unidos, muestra el resultado
		*/
		/*
		System.out.println( conjunto1 );
		conjunto1.retainAll(conjuntoPares); // Intersecciona valores del conjunto1 con los del conjuntoPares
		System.out.println(conjunto1); // Muestra solo los valores interseccionados
		*/
		System.out.println( conjunto1 );
		conjunto1.removeAll(conjuntoPares); // Remueve los valores del conjunto1 que coincidan con los del conjuntoPares
		System.out.println(conjunto1); // Muestra los valores que quedaron
		System.out.println("=====================================================================");

		//////////////////////////////// ORDEN ////////////////////////////////
		Automovil auto5 = new Automovil(1000,5000000, "KJD27");
		Automovil auto6 = new Automovil(1500,9000000, "VCXD97"); 
		Automovil auto7 = new Automovil(1200,8000000, "VXZA63");
		Automovil auto8 = new Automovil(1700,6000000, "CASS12");

		Moto moto5 = new Moto(500, 2000000, "KM871");
		Moto moto6 = new Moto(250, 1200000, "QK462");
		Moto moto7 = new Moto(700, 3100000, "YV578");
		Moto moto8 = new Moto(600, 2500000, "OI908");

		List<Terrestre> activos2 = new ArrayList<>(
			Arrays.asList(auto5,auto6,auto7,auto8,moto5,moto6,moto7,moto8)
		);

		activos2.forEach(System.out::println);
		System.out.println("");
		// Orden en 1 linea, ordenando de acuerdo al avaluo, obtenido de un getter, utilizando polimorfismo de objetos que heredan de Terrestre
		Collections.sort(activos2,Comparator.comparing(Terrestre::getAvaluo)); 
		activos2.forEach(System.out::println);

	}

}

//Inner classes que solo pueden ser utilizadas desde esta clase
class Persona {
	protected int id;
	protected String nombre;

	public Persona(int id, String nombre){
		this.id = id;
		this.nombre = nombre;
	}
	public int getId(){return id;}
	public String getNombre(){return nombre;}

	@Override
	public int hashCode(){
		return Integer.valueOf(id).hashCode();
	}
}

class Alumno extends Persona {
	public Alumno(int id, String nombre){super(id,nombre);}
	@Override
	public boolean equals(Object obj){
		if (!(obj instanceof Alumno)) return false;
		Alumno otroAlumno = (Alumno) obj;
		return this.id == otroAlumno.getId();
	}
}

class Profesor extends Persona {
	public Profesor(int id,String nombre){super(id,nombre);}
	@Override
	public boolean equals(Object obj){
		if (!(obj instanceof Profesor)) return false;
		Profesor otroProfesor = (Profesor) obj;
		return this.id == otroProfesor.getId();
	}
}
