import java.util.ArrayList;
import java.util.Scanner;
/*
 * Crear una aplicacion de consola que permita registrar y eliminar productos,
 * guardar y listar las ventas realizadas, y que genere un informe en formato
 * CSV con las ventas del dia
 * */
public class PuntoVenta {

	//arrays avanzados con ArrayList
	private static ArrayList<Producto> productos = new ArrayList<Producto>();
	
	 // importa java.util.Scanner para interacciones de consola con usuario
	static Scanner scanner = new Scanner(System.in);
	
	// constantes
	public final static int OPCION_MENU_REGISTRAR = 1;
	public final static int OPCION_MENU_ELIMINAR = 2;
	public final static int OPCION_MENU_LISTA = 3;
	public final static int OPCION_MENU_VENTAS = 4;
	public final static int OPCION_MENU_COMPRAR = 5;
	public final static int OPCION_MENU_PAGAR = 6;
	public final static int OPCION_MENU_SALIR = 7;
	
	public static void main(String[] args) {
		int opcionMenu;		
		// encierra el programa en un bucle
		do {
			opcionMenu = menu();
			
			//%s = String, %d = entero, %f = decimal, %n = salto de linea
			System.out.printf("Ha seleccionado la opcion %d \n \n", opcionMenu);
			
			switch(opcionMenu) {
				case OPCION_MENU_REGISTRAR:
					registrarProducto();
					break;
				case OPCION_MENU_ELIMINAR:
					eliminarProducto();
					break;
				case OPCION_MENU_LISTA:
					verListaProductos();
					break;
				case OPCION_MENU_VENTAS:
					verVentasProductos();
					break;
				case OPCION_MENU_COMPRAR:
					comprarProducto();
					break;
				case OPCION_MENU_PAGAR:
					pagarProductos();
					break;
				case OPCION_MENU_SALIR:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opcion escogida no valida. Vuelva a intentarlo");
					break;
			}
			
		} while(opcionMenu != OPCION_MENU_SALIR);
		// el bucle se repite mientras la opcion seleccionada no sea SALIR
		
	}
	
	
	private static void pagarProductos() {
		// TODO Auto-generated method stub
		
	}

	private static void comprarProducto() {
		// TODO Auto-generated method stub
		
	}

	private static void verVentasProductos() {
		for (Producto producto : productos) {
			System.out.printf("Codigo: %s Producto: %s Precio: %d %n", producto.getCodigo(), producto.getNombre(), producto.getPrecio());
		}
		System.out.println("Presione cualquier tecla para continuar");
		scanner.nextLine();
		scanner.nextLine();
		
	}

	private static void verListaProductos() {
		// TODO Auto-generated method stub
		
	}

	private static void eliminarProducto() {
		// TODO Auto-generated method stub
		
	}

	private static void registrarProducto() {
		
		System.out.println("Ingrese un codigo para su producto");
		String codigoProducto = scanner.nextLine();

		System.out.println("Ingrese un nombre para su producto");
		String nombreProducto = scanner.nextLine();
		
		System.out.println("Ingrese un precio para su producto");
		int precioProducto = scanner.nextInt();
		
		Producto nuevoProducto = new Producto(codigoProducto, nombreProducto, precioProducto);
		productos.add(nuevoProducto);
		
	}

	private static int menu() {
		System.out.println("Punto de venta XXXX:\n"); // "\n" para saltarse una linea
		System.out.println("1. Registrar producto");
		System.out.println("2. Eliminar producto");
		System.out.println("3. Ver lista de productos");
		System.out.println("4. Ver ventas realizadas");
		System.out.println("5. Agregar producto al carro");
		System.out.println("6. Pagar");
		System.out.println("7. Salir\n");
		
		System.out.println("Seleccione una opcion del 1 al 7");

		// toma un valor dado por el usuario y lo convierte a int 
		int opcionSeleccionada = scanner.nextInt(); 
		
		// luego lo retorna a main.
		return opcionSeleccionada;
	}

}
