package Calculadora;
public class Calculadora {

	public static void main(String [] args) {
		// si args no tiene 3 elementos muestra la ayuda al usuario
		if (args.length != 3) {
			System.out.println("Por favor entregue 3 argumentos. Ejemplo: Calculadora 1 suma 2");
			return; // termina la ejecucion
		}
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[2]);
		int resultado = 0;
		String operacion = args[1];
		switch(operacion) {
			case "suma":
				resultado = sumar(n1,n2);
				break;
			case "resta":
				resultado = restar(n1,n2);
				break;
			case "multiplica":
				resultado = multiplicar(n1,n2);
				break;	
			case "divide":
				resultado = dividir(n1,n2);
				break;
		}

		System.out.println("El resultado es "+ resultado);
	}
	
	public static int sumar(int numero1, int numero2){
		return numero1 + numero2;
	}
	
	public static int restar(int numero1, int numero2){
		return numero1 - numero2;
	}
	
	public static int multiplicar(int numero1, int numero2){
		return numero1 * numero2;
	}
	
	public static int dividir(int numero1, int numero2){
		return numero1 / numero2;
	}
	
}
