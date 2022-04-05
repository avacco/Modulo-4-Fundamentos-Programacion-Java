package cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import Medios.Automovil;
import Medios.Terrestre;
import Medios.Transporte;
import sortear.OrdenTransporteByCapacidadCargaDesc;
import Medios.*;

public class Main {

	public static void main(String[] args) {
				
		// Polimorfismo
		Collection<String> lenguajes = Arrays.asList("Java","Go","PHP","JS","Ruby");
		lenguajes.forEach(System.out::println); // Por cada elemento en la Coleccion "lenguajes", escribe un print con los elementos de la Coleccion.
		
		// LAMBDA
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
				new Automovil(1000, 7900000),
				new Automovil(2000, 11900000),
				new Automovil(1000, 6900000)
				);
		double capacidadCargaEmpresa2 = transportesTerrestres.stream().mapToDouble((auto) -> auto.getCapacidadCarga()).sum();
		System.out.printf("La capacidad de carga de la empresa es %.2f kg %n", capacidadCargaEmpresa2);

		System.out.println("=============================================================");

		List<Transporte> activos = new ArrayList<>();
		activos.add(new Automovil(1000, 7900000));
		activos.add(new Automovil(2000, 11900000));
		activos.add(new Bicicleta("NA", 80, 1, 2, 200000));
		activos.add(new Bicicleta("NA", 80, 1, 2, 150000));		
		
		// Ordena la lista activos de manera natural
		//Collections.sort(activos);
		//activos.forEach(System.out::println);
	
		// Hace lo mismo, pero evita los duplicados
		//Set<Transporte> activosOrdenados = new TreeSet<>(activos);
		//activosOrdenados.forEach(System.out::println);

		// Lo mismo
		//Set<Transporte> activosOrdenados = new TreeSet<>();
		//for(Transporte transporte : activos){
		//	activosOrdenados.add(transporte);
		//}
		//activosOrdenados.forEach(System.out::println);

		// Lo mismo otra vez, pero llamando a un metodo de una interfaz
		Collections.sort(activos, new OrdenTransporteByCapacidadCargaDesc());
		activos.forEach(System.out::println);
	}

}
