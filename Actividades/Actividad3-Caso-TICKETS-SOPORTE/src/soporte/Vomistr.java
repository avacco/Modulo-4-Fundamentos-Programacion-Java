package soporte;

import java.util.ArrayList;
import java.util.Scanner;

public class Vomistr {
	
    static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Soporte> soporte = new ArrayList<Soporte>();
	
	//CONSTANTES
	private final static int OPCION_MENU_CREAR_TICKET = 1;
	private final static int OPCION_MENU_VER_TICKET = 2;
	
	
	public static void main(String[] args) {
		// INICIALIZA OBJETOS
		inicializar();

		// PROGRAMA PROPER
		System.out.println("Escriba su usuario");
		String usuario = scanner.nextLine();
		System.out.println("Escriba su contraseña");
		String pass = scanner.nextLine();
		login(usuario,pass); 
		
		

	}

	private static void login(String usuario, String pass) {
		// TODO: LOGIN PARA EJECUTIVO
			for (Soporte s: soporte) {
				if(usuario.equalsIgnoreCase(s.getUsuarioSoporte()) && pass.equals(s.getPassSoporte())) {
					menu();
				}
			}
	}

	private static void inicializar() {
		/* TODO INICIALIZA: 
		* CLIENTE DE EJEMPLO
		* ESPECIALISTAS
		* PRODUCTOS
		* SOPORTES
		* TICKET DE EJEMPLO
		*/
		
		//SOPORTE
		String rutSoporte = "19.253.890-4";
		String nombreSoporte = "Andres";
		String usuarioSoporte = "admin";
		String passSoporte = "pass";
		Soporte nuevoSoporte = new Soporte(rutSoporte,nombreSoporte,usuarioSoporte,passSoporte);
		soporte.add(nuevoSoporte);
	}

	private static void menu() {
		boolean menuActivo = true;
		do {
			System.out.println("NO IMPLEMENTADO");
			scanner.next();
		}while(menuActivo);
	}
	
	
}
