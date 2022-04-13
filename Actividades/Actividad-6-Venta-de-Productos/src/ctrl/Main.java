package ctrl;

import java.util.ArrayList;
import java.util.Scanner;

import mdpago.*;
import prod.*;

/**
 * 
 * @author ANDRES
 *
 */

public class Main {
	
	static ArrayList<Venta> ventas = new ArrayList<>();
	static ArrayList<Producto> productos = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	private static final int SALIR = 0;
	private static final int CREAR_PRODUCTOS = 1;
	private static final int VER_PRODUCTOS = 2;
	private static final int CREAR_VENTAS = 3;
	private static final int VENTAS_DEL_DIA = 4;
	
	
	public static void main(String[] args) {

		menu();
		
	}

	private static void menu() {
		int opcion = 1;

			do {
				
				System.out.printf("%n"
						+ "1. Crear producto %n"
						+ "2. Ver productos %n"
						+ "3. Crear venta %n"
						+ "4. Ventas del dia %n"
						+ "0. Salir %n %n"
						+ "Elija una opcion (0-3) %n");
				
				try {
					opcion = scanner.nextInt();
					switch(opcion){
						case CREAR_PRODUCTOS:
							crearProductos();
							break;
						case VER_PRODUCTOS:
							verProductos();
							break;
						case CREAR_VENTAS:
							crearVentas();
							break;
						case VENTAS_DEL_DIA:
							ventasDelDia();
							break;
						case SALIR:
							System.out.println("Saliendo...");
							break;
						default:
							System.out.println("Eleccion invalida. Intentelo de nuevo.");
							break;
					}
				}catch(Exception e) {
					System.out.println("Eleccion invalida. Intentelo de nuevo.");
					scanner.nextLine();
				}
				
			}while(opcion != SALIR);
		
	}

	private static void verProductos() {
		String stringProductos = "";
		for(Producto producto : productos) {
			stringProductos = "Codigo: "+producto.getCodigo()+"\n"
							+ "Nombre: "+producto.getNombre()+"\n"
							+ "Precio: "+producto.getPrecio()+"\n"
							+ "===========================\n";
		}
		if(!stringProductos.isBlank()) {
			System.out.println(stringProductos);
		}else {
			System.out.println("No hay productos registrados");
		}
		
	}

	private static void crearProductos() {
		scanner.nextLine();
		
		try {
			System.out.println("Ingrese codigo de producto");
			String codigo = scanner.nextLine();
			
			System.out.println("Ingrese nombre del producto");
			String nombre = scanner.nextLine();
			
			System.out.println("Ingrese precio del producto");
			int precio = scanner.nextInt();
			
			Producto producto = new Producto(codigo,nombre,precio);
			productos.add(producto);
			System.out.println("Se añadio el producto "+producto.getNombre());
		}catch(Exception e){
			System.out.println("Ingreso invalido. Intentelo de nuevo.");
			scanner.nextLine();
		}
		
	}

	private static void crearVentas() {
			boolean loop = true;
			verProductos();
			Venta venta = new Venta();
			try {
				do {
					System.out.println("Ingrese codigo del producto a vender");
					String codigo = scanner.nextLine();
					
					Producto producto = buscarProducto(codigo);
					
					// Fuerza un error si producto es nulo
					if (producto == null) {
						System.out.println("Producto no encontrado.");
						throw new Exception("");
					}
					
					System.out.println("Ingrese la cantidad de productos a vender: ");
					int cantidad = scanner.nextInt();
					
					DetalleVenta dv = new DetalleVenta(cantidad,producto);
					venta.agregarDetalleVenta(dv);
					
					System.out.println("¿Agregar mas productos? (si/no)");
					String decision = scanner.nextLine();
					
					if (decision.equalsIgnoreCase("no")) {
						loop = false;
					}
				
				}while(loop);
				
				ventas.add(venta);
			}catch(Exception e) {
			}
	}

	private static Producto buscarProducto(String codigo) {
		for(Producto producto : productos) {
			if(producto.getCodigo().equalsIgnoreCase(codigo)) {
				return producto;
			}
		}
		return null;
	}

	private static void ventasDelDia() {
		System.out.println("NO IMPLEMENTADO");
	}

}
