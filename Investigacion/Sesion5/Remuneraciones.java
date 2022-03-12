package remuneraciones;

public class Remuneraciones {

	public static void main(String[] args) {
		// si se ejecuta el programa sin argumentos
		if(args.length < 6) {
			mostrarAyuda();
		}else {
			calcularRemuneraciones(args);
		}

	}
	
	private static int calcularMontoSalud(int montoImponible, String salud) {
		// TODO: Calcular el tajo de los servicios de salud al monto imponible
/*		switch (salud) {
			case "masvida": {
				return (int) (montoImponible * 0.1144);
			}
			case "banmedica": {
				return (int) (montoImponible * 0.1144);
			}
			case "fonasa": {
				return (int) (montoImponible * 0.1116);
			}
			case "colmena": {
				return (int) (montoImponible * 0.1145);
			}
			case "vidaTres": {
				return (int) (montoImponible * 0.1058);
			}
			case "cruzBlanca": {
				return (int) (montoImponible * 0.1069);
			}
			case "provida": {
				return (int) (montoImponible * 0.1069);
			}
		}
*/		return 0;
	}
	
	private static int calcularMontoAFP(int montoImponible, String afp) {
		switch (afp) {
			case "capital": {
				return (int) (montoImponible * 0.1144);
			}
			case "cuprum": {
				return (int) (montoImponible * 0.1144);
			}
			case "planvital": {
				return (int) (montoImponible * 0.1116);
			}
			case "provida": {
				return (int) (montoImponible * 0.1145);
			}
			case "modelo": {
				return (int) (montoImponible * 0.1058);
			}
			case "uno": {
				return (int) (montoImponible * 0.1069);
			}
		}
		return 0;
	}
	
	private static int calcularMontoImponible(int sueldoBase) {
		return sueldoBase;
	}
	
	private static int calcularMontoNoImponible(int colacion, int movilizacion) {
		return colacion + movilizacion;	
	}

	private static void calcularRemuneraciones(String[] args) {
		// conversiones de datos		
		int sueldoBase 		= Integer.parseInt(args[0]);
		int colacion 		= Integer.parseInt(args[1]);
		int movilizacion	= Integer.parseInt(args[2]);
		String afp 			= args[3];
		String salud 		= args[4];
		char tipoContrato 	= args[5].charAt(0); // char at 0 extrae la primera letra
		
		int montoImponible 	= calcularMontoImponible(sueldoBase);
		int montoNoImponible= calcularMontoNoImponible(colacion, movilizacion);
		int montoAFP 		= calcularMontoAFP(montoImponible,afp);
		int montoSalud		= calcularMontoSalud(montoImponible, salud);

		System.out.printf("Monto Imponible: %d\n", montoImponible);
		System.out.printf("Monto No Imponible: %d\n", montoNoImponible);
		System.out.printf("AFP: %s\n", afp);
		System.out.printf("Monto AFP: %d\n", montoAFP);
		System.out.printf("Tipo Contrato: %s\n", tipoContrato);
		System.out.printf("Sistema Salud: %s\n", salud);
		System.out.printf("Monto Salud: %d\n", montoSalud);
	}

	private static void mostrarAyuda() {
		System.out.println("Remuneraciones [sueldo-base] [colacion] [movilizacion] [afp] [salud] [tipo-contrato]");
		System.out.println("Ejemplo 1000000 20000 30000 habitat fonasa I");
		
	}

}
