package modelo;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * Desarrolle una aplicación interactiva por consola que le permita hacer los siguientes cálculos:
 *
 * Área de un rectángulo
 * Radio de un círculo a partir del diámetro
 * Perímetro del círculo
 * Área de un círculo
 */

import geometria.Circulo;
import geometria.Rectangulo;



public class Geometria {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean loop = true;
		int opcion;
		do {
			System.out.println("GEOMETRIA.");
			System.out.println("=============");
			System.out.println("1. Calcular area de un rectangulo");
			System.out.println("2. Calcular perimetro de un rectangulo");
			System.out.println("3. Calcular radio de un circulo");
			System.out.println("4. Calcular perimetro de un circulo");
			System.out.println("5. Calcular area de un circulo");
			System.out.println("6. Calcular area de un triangulo");
			System.out.println("7. Calcular perimetro de un triangulo");
			System.out.println("0. Salir");
			System.out.println("-------------");
			System.out.println("Escoja una opcion");
			
			try {
				opcion = scanner.nextInt();
				
				switch(opcion) {
				case 1:
					areaRectangulo();
					break;
				case 2:
					perimetroRectangulo();
					break;
				case 3:
					radioCirculo();
					break;
				case 4:
					perimetroCirculo();
					break;
				case 5:
					areaCirculo();
					break;
				case 6:
					areaTriangulo();
					break;
				case 7:
					perimetroTriangulo();
					break;
				case 0:
					System.out.println("Saliendo...");
					System.exit(0);
					break;					
				default:
					System.out.println("Opción escogida inválida.");
					break;
				}
			
			} catch(InputMismatchException e) {
				System.out.println("Ingrese solo numeros");
				scanner.nextLine();
			}


			
		}while(loop);
			
		}

	private static void perimetroTriangulo() {
		System.out.println("No implementado.");		
	}

	private static void areaTriangulo() {
		System.out.println("No implementado.");
		
	}

	private static void areaCirculo() {
		try {
			System.out.println("Ingrese diametro del circulo");
			double diametro = scanner.nextDouble();		
			Circulo circulo = new Circulo(diametro);
			double area = circulo.calcularArea();
			System.out.println("El area del circulo es: "+area);
		} catch (InputMismatchException e) {
			System.out.println("Ingrese numeros");
		}
	}

	private static void perimetroCirculo() {
		try {
			System.out.println("Ingrese diametro del circulo");
			double diametro = scanner.nextDouble();		
			Circulo circulo = new Circulo(diametro);
			double perimetro = circulo.calcularPerimetro();
			System.out.println("El perimetro del circulo es: "+perimetro);
		} catch (InputMismatchException e) {
			System.out.println("Ingrese numeros con o sin coma");
		}	
	}

	private static void radioCirculo() {
		try {
				
			System.out.println("Ingrese radio del circulo");
			double diametro = scanner.nextDouble() * 2;
			Circulo circulo = new Circulo(diametro);
			double radio = circulo.radioCirculo();
			System.out.println("El radio del circulo es: "+radio);		
		} catch (InputMismatchException e) {
			System.out.println("Ingrese numeros con o sin coma");
		}
	}

	private static void areaRectangulo() {
		try {
			System.out.println("Ingrese base en cm");
			double base = scanner.nextDouble();
			System.out.println("Ingrese altura en cm");
			double altura = scanner.nextFloat();
			Rectangulo rectangulo = new Rectangulo(base, altura);
			double area = rectangulo.calcularArea();
			System.out.println("El area del rectangulo es: "+area);
		} catch (InputMismatchException e) {
			System.out.println("Ingrese numeros con o sin coma");
		}
	}
	
	private static void perimetroRectangulo() {
		try {
			System.out.println("Ingrese base en cm");
			double base = scanner.nextDouble();
			System.out.println("Ingrese altura en cm");
			double altura = scanner.nextFloat();
			Rectangulo rectangulo = new Rectangulo(base, altura);
			double perimetro = rectangulo.calcularArea();
			System.out.println("El perimetro del rectangulo es: "+perimetro);
		} catch (InputMismatchException e) {
			System.out.println("Ingrese numeros con o sin coma");
		}
	}
	
	
	



}