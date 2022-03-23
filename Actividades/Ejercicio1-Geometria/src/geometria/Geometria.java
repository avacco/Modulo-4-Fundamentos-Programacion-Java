package geometria;
import java.util.Scanner;
/*
 * Desarrolle una aplicaci�n interactiva por consola que le permita hacer los siguientes c�lculos:
 *
 * �rea de un rect�ngulo
 * Radio de un c�rculo a partir del di�metro
 * Per�metro del c�rculo
 * �rea de un c�rculo
 */



public class Geometria {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean loop = true;
		
		do {
			System.out.println("GEOMETRIA.");
			System.out.println("=============");
			System.out.println("1. Calcular area de un rectangulo");
			System.out.println("2. Calcular radio de un circulo");
			System.out.println("3. Calcular perimetro de un circulo");
			System.out.println("4. Calcular area de un circulo");
			System.out.println("0. Salir");
			System.out.println("");
			System.out.println("Escoja una opcion");
			
			int opcion = scanner.nextInt();

			switch(opcion) {
				case 1:
					areaRectangulo();
					break;
				case 2:
					radioCirculo();
					break;
				case 3:
					perimetroCirculo();
					break;
				case 4:
					areaCirculo();
					break;
				case 0:
					System.out.println("Saliendo...");
					System.exit(0);
					break;					
				default:
					System.out.println("Opci�n escogida inv�lida.");
					break;
			}
			
		}while(loop);
			
		}

	private static void areaCirculo() {
		System.out.println("Ingrese diametro del circulo");
		double diametro = scanner.nextDouble();		
		Circulo circulo = new Circulo(diametro);
		double area = circulo.areaCirculo();
		System.out.println("El area del circulo es: "+area);
		
	}

	private static void perimetroCirculo() {
		System.out.println("Ingrese diametro del circulo");
		double diametro = scanner.nextDouble();		
		Circulo circulo = new Circulo(diametro);
		double perimetro = circulo.perimetroCirculo();
		System.out.println("El perimetro del circulo es: "+perimetro);
		
		
	}

	private static void radioCirculo() {
		System.out.println("Ingrese diametro del circulo");
		double diametro = scanner.nextDouble();
		Circulo circulo = new Circulo(diametro);
		double radio = circulo.radioCirculo();
		System.out.println("El radio del circulo es: "+radio);		
	}

	private static void areaRectangulo() {
		System.out.println("Ingrese base en cm");
		double base = scanner.nextDouble();
		System.out.println("Ingrese altura en cm");
		double altura = scanner.nextFloat();
		Rectangulo rectangulo = new Rectangulo(base, altura);
		double area = rectangulo.areaRectangulo();
		System.out.println("El area del rectangulo es: "+area);
	}
	
	
	



}