package soporte;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Vomistr {
	
	//Inicializa scanner
    static Scanner scanner = new Scanner(System.in);
    
    //Inicializa formateador de fecha
    static DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    
    //Inicializa ArrayList de lo que usaremos
	private static ArrayList<Soporte> soporte = new ArrayList<Soporte>();
	private static ArrayList<Producto> producto = new ArrayList<Producto>();
	private static ArrayList<Especialista> especialista = new ArrayList<Especialista>();
	private static ArrayList<Cliente> cliente = new ArrayList<Cliente>();
	private static ArrayList<Ticket> ticket = new ArrayList<Ticket>();
	
	//
	private static Soporte ejecutivoActual = null;
	
	
	//Inicializa constantes de menu
	private final static int OPCION_MENU_CREAR_TICKET = 1;
	private final static int OPCION_MENU_VER_TICKET = 2;
	private final static int OPCION_MENU_VER_PRODUCTOS = 3;
	private final static int OPCION_MENU_VER_CLIENTES = 4;
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
					ejecutivoActual = s;
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
		String nombreEspecialista = "Pedro Paredes";
		Especialista nuevoEspecialista = new Especialista(rutEspecialista,nombreEspecialista);
		especialista.add(nuevoEspecialista);
		
		String rutEspecialista2 = "14.929.321-7";
		String nombreEspecialista2 = "Juan Gillier";
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
		String nombreSoporte = "Andres Vargas";
		String usuarioSoporte = "admin";
		String passSoporte = "pass";
		Soporte nuevoSoporte = new Soporte(rutSoporte,nombreSoporte,usuarioSoporte,passSoporte);
		soporte.add(nuevoSoporte);
		
		String rutSoporte2 = "14.229.847-K";
		String nombreSoporte2 = "Jeannette Perez";
		String usuarioSoporte2 = "jean";
		String passSoporte2 = "123";
		Soporte nuevoSoporte2 = new Soporte(rutSoporte2,nombreSoporte2,usuarioSoporte2,passSoporte2);
		soporte.add(nuevoSoporte2);
		
		//CLIENTES EJEMPLO
		String rutCliente = "xx.xxx.xxx-x";
		String nombreCliente = "xxx";
		String telefonoCliente = "x xxxx xxxx";
		String correoCliente = "x@x.com";
		Producto productoCliente = producto.get(1);
		Cliente nuevoCliente= new Cliente(rutCliente,nombreCliente,telefonoCliente,correoCliente,productoCliente);
		cliente.add(nuevoCliente);
		
		String rutCliente2 = "yy.yyy.yyy-y";
		String nombreCliente2 = "yyy";
		String telefonoCliente2 = "y yyyy yyyy";
		String correoCliente2 = "y@y.com";
		Producto productoCliente2 = producto.get(0);
		Cliente nuevoCliente2= new Cliente(rutCliente2,nombreCliente2,telefonoCliente2,correoCliente2,productoCliente2);
		cliente.add(nuevoCliente2);
		
		//TICKETS EJEMPLO
		int numeroTicket = 0;
		LocalDateTime fechaTicket = LocalDateTime.now();
		String descripcionTicket = "Ticket de ejemplo";
		String estadoTicket = "Abierto";
		String solucionTicket = "En proceso";
		Cliente clienteTicket = cliente.get(0);
		Soporte soporteTicket = soporte.get(0);
		Especialista especialistaTicket = especialista.get(0);
		Ticket nuevoTicket = new Ticket(numeroTicket,fechaTicket,descripcionTicket,estadoTicket,solucionTicket,clienteTicket,soporteTicket,especialistaTicket);
		ticket.add(nuevoTicket);
		
		int numeroTicket2 = 1;
		LocalDateTime fechaTicket2 = LocalDateTime.now();
		String descripcionTicket2 = "Ticket de ejemplo 2";
		String estadoTicket2 = "Cerrado";
		String solucionTicket2 = "Ejemplo de solución";
		Cliente clienteTicket2 = cliente.get(1);
		Soporte soporteTicket2 = soporte.get(1);
		Especialista especialistaTicket2 = especialista.get(1);
		Ticket nuevoTicket2 = new Ticket(numeroTicket2,fechaTicket2,descripcionTicket2,estadoTicket2,solucionTicket2,clienteTicket2,soporteTicket2,especialistaTicket2);
		ticket.add(nuevoTicket2);
		
		
		
	}

	private static void menu() {
		// MENU
		// Desde aqui se controlará todo. 
		int opcion;
		do {
			System.out.println("Bienvenido al sistema.");
			System.out.println("====================");
			System.out.println("1. Crear ticket");
			System.out.println("2. Ver tickets");
			System.out.println("3. Ver lista de productos");
			System.out.println("4. Ver lista de clientes");
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
				case OPCION_MENU_VER_CLIENTES:
					verClientes();
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

	private static void verClientes() {
		// VER CLIENTES
		// Utiliza un ciclo for para mostrar en consola todos los clientes registrados
		System.out.println("CLIENTES");
		System.out.println("=======================");
		
		for (Cliente c : cliente) {
			System.out.printf(" RUT: %s %n Nombre: %s %n Telefono: %s %n Correo: %s %n Producto a su nombre: %s %n", c.getRut(), c.getNombre(), c.getTelefono(), c.getCorreoElectronico(), c.getProducto().getNombreProducto());
			System.out.println("----------------------------------------------------------");
		}
		System.out.println("\n\n");	
	}

	private static void verProductos() {
		// VER PRODUCTOS
		// Utiliza un ciclo for para mostrar en consola todos los productos disponibles
		System.out.println("PRODUCTOS DISPONIBLES");
		System.out.println("=======================");
		
		for (Producto p : producto) {
			System.out.printf(" Codigo: %s %n Producto: %s %n", p.getCodigoProducto(), p.getNombreProducto());
			System.out.println("----------------------------------------------------------");
		}
		System.out.println("\n\n");		
	}

	private static void verTicket() {
		// VER TICKETS
		// Utiliza un ciclo flor para mostrar en consola todos los tickets registrados
		System.out.println("TICKETS REGISTRADOS");
		System.out.println("=======================");
		
		for (Ticket t : ticket) {
			System.out.printf(" Numero ticket: %d %n Fecha y hora: %s %n Cliente: %s %n Producto afectado: %s %n Descripcion problema: %s %n Estado ticket: %s %n Solucion Problema: %s %n Atendedor: %s %n Especialista Derivado: %s %n", 
								t.getNumeroTicket(), formateador.format(t.getFecha()), t.getCliente().getNombre(), t.getCliente().getProducto().getNombreProducto(), t.getDescripcionProblema(), t.getEstado(), t.getSolucionProblema(), t.getSoporte().getNombreSoporte(), t.getEspecialista().getNombreEspecialista());
			System.out.println("----------------------------------------------------------");								
		}
		System.out.println("\n\n");	
		
	}

	private static void crearTicket() {
		// CREAR TICKET
		// Esta funcion creara un ticket utilizando varios datos sacados del usuario, otros preguntados directamente,
		// ademas crea un usuario si este no existe.
		
		// El numero del ticket sera igual al numero del ultimo ticket + 1
		int numeroTicket = ticket.get(ticket.size() - 1).getNumeroTicket() + 1;
		System.out.println("CREAR TICKET \n ==================\n El numero del ticket será: "+numeroTicket+"\n Ingrese la descripcion del problema:");
		scanner.nextLine();
		String descripcionTicket = scanner.nextLine();
		
		//Toma los datos del cliente
		System.out.println("Ingrese los datos del Cliente. \n RUT del cliente:");
		String rutCliente = scanner.nextLine();
		System.out.println("Nombre del cliente:");
		String nombreCliente = scanner.nextLine();
		System.out.println("Telefono del cliente:");
		String telefonoCliente = scanner.nextLine();
		System.out.println("Correo electronico del cliente:");
		String correoCliente = scanner.nextLine();
		Producto productoCliente = null; // Inicializa para futura asignacion
		
		// Pide el codigo de producto del cliente y llama el metodo buscarProducto() para emparejarlo
		do { 
			System.out.println("Ingrese el codigo de producto del cliente:");
			String codigoProductoCliente = scanner.nextLine();	
			productoCliente = buscarProducto(codigoProductoCliente);
		}while(productoCliente == null);
		
		 //Añade el nuevo cliente
		Cliente nuevoCliente = new Cliente(rutCliente,nombreCliente,telefonoCliente,correoCliente, productoCliente);
		cliente.add(nuevoCliente);
		
		// Ahora que se creo un nuevo cliente, toma el ultimo cliente generado para luego añadirselo al ticket
		Cliente clienteTicket = cliente.get(cliente.size() - 1); 
		
		//soporteTicket sera igual al ejecutivo actual (quien esta usando el programa)
		Soporte soporteTicket = ejecutivoActual;
		
		//Pide el rut del especialista derivado, luego llama la funcoin buscarEspecialista con el dato
		Especialista especialistaTicket = null; // Inicializa para futura asignacion
		do {
			System.out.println("Ingrese el RUT del especialista derivado");
			String rutEspecialista = scanner.nextLine();			
			especialistaTicket = buscarEspecialista(rutEspecialista);
		}while(especialistaTicket == null);
		
		// Estos datos se dan automaticamente
		String solucionTicket = "En proceso";
		String estadoTicket = "Abierto";
		LocalDateTime fechaTicket = LocalDateTime.now();
		Ticket nuevoTicket = new Ticket(numeroTicket,fechaTicket,descripcionTicket,estadoTicket,solucionTicket,clienteTicket,soporteTicket,especialistaTicket);
		ticket.add(nuevoTicket);
		
	}
	
	
	// ESTOS METODOS BUSCAN PRODUCTO Y ESPECIALISTA RESPECTIVAMENTE PARA SU USO AL CREAR TICKET
	private static Producto buscarProducto(String codigoProductoCliente){
		Producto productoCliente = null;
		for (Producto p : producto) {
			if(codigoProductoCliente.equalsIgnoreCase(p.getCodigoProducto())) {
				productoCliente = p;
				break;
			}
		}
		if (productoCliente != null) {
			return productoCliente;
		}else {
			System.out.println("Producto no encontrado. Vuelva a intentarlo");
			return null;
		}
	}
	
	private static Especialista buscarEspecialista(String rutEspecialista) {
		Especialista especialistaTicket = null; 
		for (Especialista e : especialista) {
			if(rutEspecialista.equalsIgnoreCase(e.getRutEspecialista())) {
				especialistaTicket = e;
				break;
			}
		}
		if(especialistaTicket != null) {
			return especialistaTicket;			
		}else {
			System.out.println("Especialista no encontrado. Vuelva a intentarlo");
			return null;
		}
	}
	
}
