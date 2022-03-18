package soporte;

import java.util.ArrayList;
import java.util.Scanner;

public class Vomistr {
	
	//Inicializa scanner
    static Scanner scanner = new Scanner(System.in);
    
    //Inicializa ArrayList de lo que usaremos
	private static ArrayList<Soporte> soporte = new ArrayList<Soporte>();
	private static ArrayList<Producto> producto = new ArrayList<Producto>();
	private static ArrayList<Especialista> especialista = new ArrayList<Especialista>();
	private static ArrayList<Ticket> ticket = new ArrayList<Ticket>();
	
	
	//Inicializa constantes de menu
	private final static int OPCION_MENU_CREAR_TICKET = 1;
	private final static int OPCION_MENU_VER_TICKET = 2;
	private final static int OPCION_MENU_VER_PRODUCTOS = 3;
	private final static int OPCION_MENU_SALIR = 0;
	
	
	public static void main(String[] args) {
		// INICIALIZA OBJETOS
		inicializar();

		// PROGRAMA PROPER
		login(); 
		
		

	}

	private static void login() {
		// LOGIN
		// Atrapa el metodo en un bucle
		// Pide el usuario y contraseña del ejecutivo. Si estan registrados, y las credenciales son correctas, pasa al menu
		// De lo contrario, vuelve a pedir las credenciales hasta que estas sean correctas o se escriba SALIR
		
		boolean loop = true;
		do {
			System.out.println("Bienvenido al sistema. Si desea salir, escriba SALIR en cualquier momento");
			System.out.println("Escriba su usuario");
			String usuario = scanner.nextLine();
			System.out.println("Escriba su contraseña");
			String pass = scanner.nextLine();
			
			if(pass.equalsIgnoreCase("SALIR") || usuario.equalsIgnoreCase("SALIR") ) {
				System.out.println("Saliendo...");
				break;
			}
			
			boolean ok = procesarLogin(usuario,pass);
			
			if(ok) {
				menu();
			}else {
				System.out.println("Credenciales inválidas, intente de nuevo");
			}
		}while(loop == true);
	}

	private static boolean procesarLogin(String usuario, String pass) {
		// PROCESA LAS CREDENCIALES DE LOGIN PARA EJECUTIVO
		// Busca en los objetos Soporte si existe uno con las credenciales correctas
		// Si las encuentra, retorna true para que el booleano que controla el acceso al menu permita avanzar
			for (Soporte s: soporte) {
				if(usuario.equalsIgnoreCase(s.getUsuarioSoporte()) && pass.equals(s.getPassSoporte())) {
					return true;
				}
			}
		return false;
	}

	private static void inicializar() {
		/* INICIALIZA: 
		* ESPECIALISTAS
		* PRODUCTOS
		* SOPORTES
		* CLIENTE DE EJEMPLO
		* TICKET DE EJEMPLO
		*/
		
		//ESPECIALISTAS
		String rutEspecialista = "16.655.728-3";
		String nombreEspecialista = "Pedro";
		Especialista nuevoEspecialista = new Especialista(rutEspecialista,nombreEspecialista);
		especialista.add(nuevoEspecialista);
		
		String rutEspecialista2 = "14.929.321-7";
		String nombreEspecialista2 = "Pedro";
		Especialista nuevoEspecialista2 = new Especialista(rutEspecialista2,nombreEspecialista2);
		especialista.add(nuevoEspecialista2);
		
		//PRODUCTOS
		String codigoProducto = "fibra300";
		String nombreProducto = "Internet Fibra Optica 300 Megas";
		Producto nuevoProducto = new Producto(codigoProducto,nombreProducto);
		producto.add(nuevoProducto);

		String codigoProducto2 = "fibra600";
		String nombreProducto2 = "Internet Fibra Optica 600 Megas";
		Producto nuevoProducto2 = new Producto(codigoProducto2,nombreProducto2);
		producto.add(nuevoProducto2);

		String codigoProducto3 = "fibra900";
		String nombreProducto3 = "Internet Fibra Optica 900 Megas";
		Producto nuevoProducto3 = new Producto(codigoProducto3,nombreProducto3);
		producto.add(nuevoProducto3);

		String codigoProducto4 = "movil80g";
		String nombreProducto4 = "Internet Movil 80 GB";
		Producto nuevoProducto4 = new Producto(codigoProducto4,nombreProducto4);
		producto.add(nuevoProducto4);

		String codigoProducto5 = "movil150g";
		String nombreProducto5 = "Internet Movil 150 GB";
		Producto nuevoProducto5 = new Producto(codigoProducto5,nombreProducto5);
		producto.add(nuevoProducto5);

		String codigoProducto6 = "movil200g";
		String nombreProducto6 = "Internet Movil 200 GB";
		Producto nuevoProducto6 = new Producto(codigoProducto6,nombreProducto6);
		producto.add(nuevoProducto6);

		//SOPORTES
		String rutSoporte = "19.253.890-4";
		String nombreSoporte = "Andres";
		String usuarioSoporte = "admin";
		String passSoporte = "pass";
		Soporte nuevoSoporte = new Soporte(rutSoporte,nombreSoporte,usuarioSoporte,passSoporte);
		soporte.add(nuevoSoporte);
		
		String rutSoporte2 = "14.229.847-K";
		String nombreSoporte2 = "Jeannette";
		String usuarioSoporte2 = "jean";
		String passSoporte2 = "123";
		Soporte nuevoSoporte2 = new Soporte(rutSoporte2,nombreSoporte2,usuarioSoporte2,passSoporte2);
		soporte.add(nuevoSoporte2);
		
		
		
		
	}

	private static void menu() {
		// MENU
		// Desde aqui se controlará todo. 
		int opcion;
		do {
			System.out.println("Bienvenido al sistema.");
			System.out.println("====================");
			System.out.println("1. Crear ticket");
			System.out.println("2. Ver ticket");
			System.out.println("3. Ver lista de productos");
			System.out.println("0. Cerrar sesion\n\n");
			System.out.println("Escoja una opcion");

			
			// Toma un int del usuario, si esta entre las opciones, hara lo que corresponda, sino, volvera a pedir.
			opcion = scanner.nextInt();

			switch(opcion) {
				case OPCION_MENU_CREAR_TICKET:
					crearTicket();
					break;
				case OPCION_MENU_VER_TICKET:
					verTicket();
					break;
				case OPCION_MENU_VER_PRODUCTOS:
					verProductos();
					break;
				case OPCION_MENU_SALIR:
					System.out.println("Se ha cerrado su sesión.\n\n");
					break;
				default:
					System.out.println("Opción escogida inválida. Intente de nuevo\n\n");
					break;

			}
			
			
		}while(opcion != OPCION_MENU_SALIR);
		scanner.nextLine(); // evita un error donde se consume un nextLine() porque a java le pintó
	}

	private static void verProductos() {
		System.out.println("PRODUCTOS DISPONIBLES");
		System.out.println("=======================");
		
		for (Producto p : producto) {
			System.out.printf("Codigo: %s || Producto: %s %n", p.getCodigoProducto(), p.getNombreProducto());
			System.out.println("----------------------------------------------------------");
		}
		System.out.println("\n\n");		
	}

	private static void verTicket() {
		System.out.println("NO IMPLEMENTADO AUN");
		
	}

	private static void crearTicket() {
		System.out.println("NO IMPLEMENTADO AUN");
		
	}
	
	
}
