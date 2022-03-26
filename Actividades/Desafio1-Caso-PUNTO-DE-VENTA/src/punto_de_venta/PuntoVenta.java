package punto_de_venta;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/*
 * Crear una aplicacion de consola que permita registrar y eliminar productos,
 * guardar y listar las ventas realizadas, y que genere un informe en formato
 * CSV con las ventas del dia
 * */
public class PuntoVenta {

	// formateador de fecha para localdatetime
	static DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	
	//arrays avanzados con ArrayList
	private static ArrayList<Producto> productos = new ArrayList<Producto>();
	private static ArrayList<Venta> ventas = new ArrayList<Venta>();
	
	 // importa java.util.Scanner para interacciones de consola con usuario
	static Scanner scanner = new Scanner(System.in);
	
	// constantes
	public final static int OPCION_MENU_REGISTRAR = 1;
	public final static int OPCION_MENU_ELIMINAR = 2;
	public final static int OPCION_MENU_LISTA = 3;
	public final static int OPCION_MENU_VENTAS = 4;
	public final static int OPCION_MENU_COMPRAR = 5;
	public final static int OPCION_MENU_REPORTE = 6;
	public final static int OPCION_MENU_SALIR = 7;
	
	public static void main(String[] args) {
		

		
		int opcionMenu;		
		
		// encierra el programa en un bucle
		do {
			// Muestra el menu y pide input al usuario en un metodo exterior
			opcionMenu = menu();
			
			//%s = String, %d = entero, %f = decimal, %n = salto de linea
			System.out.printf("Ha seleccionado la opcion %d \n \n", opcionMenu);
			
			// Segun la opcion elegida, hace una de estas acciones
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
					comprarProductos();
					break;
				case OPCION_MENU_REPORTE:
					generarReporte();
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
	


	private static void generarReporte() {
		
		// Define el nombre del archivo y su contenido con Strings
		String nombreArchivo = "REPORTE-VENTAS.csv";
		String contenidoArchivo = "REPORTE VENTAS\n==============\n";
		
		for (Venta venta : ventas) {
			contenidoArchivo += "Fecha: "+ formateador.format(venta.getFecha())+"\n";
			contenidoArchivo += venta.productosTotales()+"\n";
			contenidoArchivo += "Total: "+venta.calcularTotal()+"\n";
			contenidoArchivo += "-----------------------------------------------\n";
		}
		
		//Utiliza un try-catch para evitar que el programa se rompa.
		try {
			// Crea un objeto FileWriter, importado desde utilidades de java
			// Se encargará de crear el archivo a partir de los Strings definidos antes
			FileWriter writer = new FileWriter(nombreArchivo);
			writer.write(contenidoArchivo);
			writer.close();
			
			System.out.println("Archivo generado exitosamente");
			
		} catch(IOException ioe) {
			System.out.println("Fallo al escribir el archivo.");
		}
		
	}

	private static void comprarProductos() {
		Venta venta = new Venta();
		boolean seguirAgregandoProductos = true;
		
		do {
		// Muestra los productos disponibles.
		verListaProductos();
		// Pregunta al usuario el codigo de producto a comprar
		scanner.nextLine(); // ataja \n de verListaProductos()
		System.out.println("Escriba el codigo del producto que desea comprar: ");
		String codigo = scanner.nextLine();
		
		//Llama al metodo buscarProducto para definir el producto
		Producto producto = buscarProducto(codigo);
		
		// Luego pregunta la cantidad
		System.out.println("Escriba la cantidad que desea comprar: ");
		int cantidad = scanner.nextInt();
		
		//Crea una linea de detalle con el producto y la cantidad
		LineaDetalle lineaDetalle = new LineaDetalle(cantidad,producto);
		venta.agregarLineaDetalle(lineaDetalle);
		
		// Finalmente, pregunta si quiere agregar mas productos
		System.out.println("¿Desea agregar mas productos al carro? (si/no)");
		
		//equivalente a if(){}else{}
		seguirAgregandoProductos = scanner.next().equalsIgnoreCase("SI") ? true : false;
		}while (seguirAgregandoProductos == true);
		
		// Añade la venta al terminar de agregar los objetos al carro
		ventas.add(venta);
		
		
	}

	private static void verVentasProductos() {
		System.out.println("\n VENTAS");
		System.out.println("==============");
		
		for (Venta venta : ventas) {			
			System.out.printf(" Fecha: %s %n", formateador.format(venta.getFecha()));
			System.out.println(venta.productosTotales());
			System.out.printf(" Total: %s %n", venta.calcularTotal());
			System.out.println("--------------------------------------------------");
		}
		System.out.println("\n\n");			}

	private static void verListaProductos() {
		System.out.println("\n PRODUCTOS");
		System.out.println("==============");
		
		for (Producto producto : productos) {
			System.out.printf("Codigo: %s Producto: %s Precio: %d %n", producto.getCodigo(), producto.getNombre(), producto.getPrecio());
			System.out.println("--------------------------------------------------");
		}
		System.out.println("\n\n");

		
		
	}

	private static void eliminarProducto() {
		scanner.nextLine();
		System.out.println("Escriba el codigo del producto a eliminar: ");
		String codigo = scanner.nextLine();
		System.out.println(codigo);
		
		Producto producto = buscarProducto(codigo);
		if (producto != null) {
			productos.remove(producto);
			System.out.printf("Se ha eliminado el producto: %s %n%n", producto.getNombre());
		}else {
			System.out.printf("No se ha encontrado el producto %n%n");
		}
		
	}
	
	private static Producto buscarProducto(String codigo) {
		for (Producto p: productos) {
			if (p.getCodigo().equalsIgnoreCase(codigo)) {
				return p;
			}
		}
		return null;
	}
	

	private static void registrarProducto() {
		scanner.nextLine();
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
		System.out.println("5. Agregar productos al carro");
		System.out.println("6. Generar reporte");
		System.out.println("7. Salir \n");

		System.out.println("Seleccione una opcion del 1 al 7");

		// toma un valor dado por el usuario y lo convierte a int 
		int opcionSeleccionada = scanner.nextInt(); 
		
		// luego lo retorna a main.
		return opcionSeleccionada;
	}

}
