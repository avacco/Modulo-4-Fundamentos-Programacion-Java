package main;

import java.util.ArrayList;
import java.util.List;

import docenteEmpleado.Docente;
import figuras.Circulo;
import figuras.Figura;
import figuras.Rectangulo;

public class Main {

	public static void main(String[] args) {

		// HERENCIA
		
		Docente andres = new Docente("Andres","19.253.890-4",600000,8);
		andres.mostrarLiquidacion();
		andres.coso();
		
		System.out.println("==============================================================");
		
		//Puede ser instanciada
		Circulo c = new Circulo();
		
		//No puede ser instanciada por ser abstracta
		//Figura f = new Figura();

		
		// POLIMORFISMO
		Circulo c1 = new Circulo(65);
		Rectangulo r1 = new Rectangulo(10,10);
		
		Figura f1 = new Circulo(90);		// Lo mismo que Circulo f1 = new Circulo(90);
		Figura f2 = new Rectangulo(15,20);  // Lo mismo que rectangulo f2 = new Rectangulo(15,20);
		
		List<Figura> listadoFiguras = new ArrayList<>();
		listadoFiguras.add(c1); // Añade un circulo al array
		listadoFiguras.add(r1); // Añade un rectangulo al array
		listadoFiguras.add(f1); // Añade un circulo al array
		listadoFiguras.add(f2); // Añade un rectangulo al array
		
		for (Figura f : listadoFiguras) {
			double perimetro = f.calcularPerimetro();
			System.out.printf("perimetro = %.2f %n", perimetro);
		}
		
	}

}
