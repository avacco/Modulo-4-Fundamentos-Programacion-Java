package consola;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;

import cosas.*;

public class Main {
	
	//Scanner estatico para uso a lo largo del codigo
	static Scanner scanner = new Scanner(System.in);
	
	// ArrayList de los objetos que utilizaremos
	private static ArrayList<Auto> autos = new ArrayList<>();
	private static ArrayList<Mantencion> mantenciones = new ArrayList<>();
	
	//Inicializa constantes de menu
	private final static int OPCION_MENU_AGREGAR_CLIENTE = 1;
	private final static int OPCION_MENU_ELIMINAR_CLIENTE = 2;
	private final static int OPCION_MENU_LISTA_MANTENCIONES = 3;
	private final static int OPCION_MENU_RECAUDACIONES = 4;
	private final static int OPCION_MENU_AGREGAR_MANTENCION = 5;
	private final static int OPCION_MENU_SALIR = 0;
	
	
	public static void main(String[] args) {
	// Nada mas ejecutarse el programa, pasa al menu
		menu();

	}

	private static void menu() {
		// Declara variable opcion para uso y asignacion en menu
		int opcion;
		
		// Encierra el menu en un ciclo while hasta que el usuario presione SALIR
		do {
			System.out.println("Bienvenido al sistema.");
			System.out.println("====================");
			System.out.println("1. Agregar cliente/auto/mantencion");
			System.out.println("2. Eliminar cliente");
			System.out.println("3. Lista de mantenciones");
			System.out.println("4. Recaudaciones del dia");
			System.out.println("5. Agregar mantencion de auto");
			System.out.println("0. Salir\n");
			
			System.out.println("Escoja una opcion");

			
			// Toma un int del usuario, si esta entre las opciones, hara lo que corresponda, sino, volvera a pedir.
			opcion = scanner.nextInt();

			switch(opcion) {
				case OPCION_MENU_AGREGAR_CLIENTE:
					agregarCliente();
					break;
				case OPCION_MENU_ELIMINAR_CLIENTE:
					eliminarCliente();
					break;
				case OPCION_MENU_LISTA_MANTENCIONES:
					listarMantenciones();
					break;
				case OPCION_MENU_RECAUDACIONES:
					verRecaudaciones();
					break;
				case OPCION_MENU_AGREGAR_MANTENCION:
					agregarMantencion();
					break;
				default:
					System.out.println("Opción escogida inválida. Intente de nuevo\n\n");
					break;

			}	
		}while(opcion != OPCION_MENU_SALIR);
		
	}

	private static void agregarMantencion() {
		
		// MUESTRA AUTOS REGISTRADOS Y SUS DATOS
		System.out.println("AUTOS REGISTRADOS");
		for (Auto auto : autos){
			System.out.println("=======================================");
			System.out.println("PPU AUTO: "+auto.getPpu());
			System.out.println("MARCA AUTO: "+auto.getMarca());
			System.out.println("MODELO AUTO: "+auto.getModelo());
			System.out.println("FABRICACION AUTO: "+auto.getFecha());
			System.out.println("DUEÑO AUTO: "+auto.getPoseedor().getNombres()+" "+auto.getPoseedor().getApellidos());
			System.out.println("=======================================\n");
		}
		
		scanner.nextLine(); // Ataja el mismo error de siempre
		
		// Pide la PPU del auto al que se le hizo mantencion
		System.out.println("Escriba PPU del auto al que se ha hecho mantencion");
		String ppuMantencion = scanner.nextLine();
		
		// Declara un Auto como nulo para futura asignacion
		Auto autoMantencion = null;
		
		// BUSCA EL AUTO SEGUN PPU EN ARRAYLIST autos, CUANDO LO ENCUENTRA, LO ASIGNA A VARIABLE ANTES DECLARADA (autoMantencion)
		for(Auto auto : autos) {
			if(ppuMantencion.equalsIgnoreCase(auto.getPpu())) {
				autoMantencion = auto;
			}
		}
		
		// Pide el resto de datos para la creacion de un objeto Mantencion
		System.out.println("Escriba el tipo de mantencion realizado");
		String tipoMantencion = scanner.nextLine();
		
		System.out.println("Escriba observaciones realizadas");
		String observacionesMantencion = scanner.nextLine();
		
		System.out.println("Escriba monto cobrado");
		int montoMantencion = scanner.nextInt(); 
		

		//CREA EL OBJETO MANTENCION Y LO AGREGA A ARRALIST MANTENCIONES
		Mantencion mantencion = new Mantencion(tipoMantencion,observacionesMantencion,montoMantencion,autoMantencion);
		mantenciones.add(mantencion);
		
	}

	//TODO
	private static void verRecaudaciones() {
		System.out.println("111111");
		
	}

	private static void listarMantenciones() {
		
		System.out.println("Listado de mantenciones realizadas: \n===================================================");
		
		// Por cada mantencion realizada, muestra los datos en la consola
		for(Mantencion mantencion : mantenciones) {
			System.out.println("PPU AUTO MANTENIDO: "+mantencion.getAuto().getPpu());
			System.out.println("DUEÑO DE AUTO MANTENIDO: "+mantencion.getAuto().getPoseedor().getNombres()+" "+mantencion.getAuto().getPoseedor().getApellidos());
			System.out.println("TIPO MANTENCION: "+mantencion.getMantencionRealizada());
			System.out.println("OBSERVACIONES: "+mantencion.getObservaciones());
			System.out.println("MONTO: "+mantencion.getMontoServicio());
			System.out.println("===================================================\n");
		}		
	}

	//TODO
	private static void eliminarCliente() {
		System.out.println("333333");
		
	}

	private static void agregarCliente() {
		scanner.nextLine(); //ATAJA ERRORES
		
		//PIDE DATOS CLIENTE
		System.out.println("Ingrese nombres del cliente");
		String nombresCliente = scanner.nextLine();
		
		System.out.println("Ingrese apellidos del cliente");
		String apellidosCliente = scanner.nextLine();
		
		System.out.println("Ingrese RUT del cliente");
		String rutCliente = scanner.nextLine();
		
		System.out.println("Ingrese correo del cliente");
		String correoCliente = scanner.nextLine();

		System.out.println("Ingrese telefono del cliente");
		String fonoCliente = scanner.nextLine();
		
		//CREACION CLIENTE CON DATOS PEDIDOS
		Cliente cliente = new Cliente(nombresCliente,apellidosCliente,rutCliente,correoCliente,fonoCliente);
		
		
		//DATOS AUTO
		// Se repite las veces que sea necesaria, segun la cantidad de autos del cliente
		boolean agregarAutos = true;
		
		do {
			System.out.println("Ingrese PPU del auto");
			String ppuAuto = scanner.nextLine();
			
			System.out.println("Ingrese marca del auto");
			String marcaAuto = scanner.nextLine();
			
			System.out.println("Ingrese modelo del auto");
			String modeloAuto = scanner.nextLine();
			
			System.out.println("Ingrese año de fabricacion del auto");
			int yearAuto = scanner.nextInt();
						
			Auto auto = new Auto(ppuAuto,marcaAuto,modeloAuto,LocalDate.of(yearAuto, 01, 01),cliente);
			autos.add(auto); // AÑADE AL ARRAY PARA USO FUTURO
			
			scanner.nextLine(); // ATAJA ERRORES
			
			System.out.println("¿Desea seguir añadiendo autos? (si/no)");
			String decision = scanner.nextLine();
			
			if(decision.equalsIgnoreCase("NO")) {
				agregarAutos = false;
				break;
			}	
		}while(agregarAutos);	
	}

}
