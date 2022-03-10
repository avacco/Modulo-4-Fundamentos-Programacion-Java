/*
 * Frases [option]
 * [options] puede ser "todos", para mostrar todas las frases
 * Si no se entrega el argumento [option], muestra una frase aleatoria
 */


public class Frases {
	
	public static String[] frases = {
			"Este es el destino que escogiste",
			"Vive y muere bajo la cuchilla",
			"Cuanto mas cambian las cosas, mas se mantienen igual",
			"El reloj corre",
	};

	public static void main(String[] args) {
		if(args.length == 0) {
			mostrarFraseAleatoria();
		}else {
			mostrarTodasLasFrases();
		}

	}

	private static void mostrarFraseAleatoria() {		
		double numeroAleatorio = Math.random() * frases.length;
		int numeroAleatorioEntero = (int) numeroAleatorio; // convierte numeroAleatorio a entero
		System.out.println(frases[numeroAleatorioEntero]);
		
		
	}

	private static void mostrarTodasLasFrases() {
		// ciclo for basico
		for (int i = 0; i < frases.length; i++) {
			System.out.println(frases[i]);
		}
		
	}

}
