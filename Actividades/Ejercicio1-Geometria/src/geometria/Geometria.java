package geometria;
import java.util.Scanner;
/*
 * Desarrolle una aplicación interactiva por consola que le permita hacer los siguientes cálculos:
 *
 * Área de un rectángulo
 * Radio de un círculo a partir del diámetro
 * Perímetro del círculo
 * Área de un círculo
 */



public class Geometria {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean loop = true;
		String respuesta;
		double radio;
		double diametro;
		double base;
		double altura;
		
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
					System.out.println("Ingrese base en cm");
					base = scanner.nextFloat();
					System.out.println("Ingrese altura en cm");
					altura = scanner.nextFloat();
					System.out.println(respuesta = "El area del rectangulo es: "+Rectangulo.areaRectangulo(base,altura)+"cm2");
					break;
				case 2:
					System.out.println("Ingrese diametro del circulo");
					diametro = scanner.nextFloat();
					System.out.println(respuesta = "El radio del circulo es: "+CalcularRadioCirculo.radioCirculo(diametro)+"cm");
					break;
				case 3:
					System.out.println("Ingrese radio del circulo");
					radio = scanner.nextFloat();					
					System.out.println(respuesta = "El perimetro del circulo es: "+CalcularPerimetroCirculo.perimetroCirculo(Math.PI,radio)+"cm");
					break;
				case 4:
					System.out.println("Ingrese radio del circulo");
					radio = scanner.nextFloat();		
					System.out.println(respuesta = "El area del circulo es: "+CalcularAreaCirculo.areaCirculo(Math.PI,radio)+"cm2");
					break;
				case 0:
					System.out.println("Saliendo...");
					System.exit(0);
					break;					
				default:
					System.out.println("Opción escogida inválida.");
					break;
			}
			
		}while(loop);
			
		}
	



}