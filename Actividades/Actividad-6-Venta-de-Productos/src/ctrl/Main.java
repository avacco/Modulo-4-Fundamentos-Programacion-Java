package ctrl;

import java.time.LocalDate;
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
			stringProductos += "Codigo: "+producto.getCodigo()+"\n"
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
			scanner.nextLine();
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
					int total =  venta.calcularTotal();
					
					scanner.nextLine();
					System.out.println("¿Agregar mas productos? (si/no)");
					String decision = scanner.nextLine();
					
					if (decision.equalsIgnoreCase("no")) {
						
						System.out.printf("El total a pagar es: %d %n%n"
										+ "Elija metodo de pago (1-2): %n"
										+ "1. Efectivo%n"
										+ "2. Tarjeta%n",
										total);
						int metodoOpcion = scanner.nextInt();
						
						switch(metodoOpcion) {
							case 1:
								venta.setMedioPago(new Efectivo("Efectivo",total));
								break;
							case 2:
								scanner.nextLine();
								System.out.println("Ingrese nombre de cuenta");
								String nombreCuenta = scanner.nextLine();
								System.out.println("Ingrese numero de cuenta");
								String numeroCuenta = scanner.nextLine();
								venta.setMedioPago(new Tarjeta("Tarjeta",total,nombreCuenta,numeroCuenta));
								break;
							default:
								System.out.println("Metodo de pago invalido. Intentelo de nuevo");
								throw new Exception("METODO PAGO INVALIDO");
						}
						
						loop = false;
					}
				
				}while(loop);
				venta.setFechaVenta(LocalDate.now());
				ventas.add(venta);
				System.out.println("Venta realizada.");
				
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
		System.out.printf("VENTAS DEL DIA:%n"
						+ "==============%n%n"
						+ "1. Ventas con efectivo %n"
						+ "2. Ventas con tarjeta %n"
						+ "Elija una opcion%n");
		int opcion = scanner.nextInt();
		
		switch(opcion) {
			case 1:
				for(Venta venta : ventas) {
					if(venta.getMedioPago().getNombreMedio().equals("Efectivo")) {
						System.out.printf("============================================== %n"
										+ "Fecha venta: %s%n"
										+ "Medio pago: %s%n"
										+ "Productos comprados: %s%n"
										+ "Total: %d%n"
										+ "=============================================== %n",
										venta.getFechaVenta(),
										venta.getMedioPago().getNombreMedio(),
										venta.getProductosComprados(),
										venta.getMedioPago().getMonto());
						
					}
				}
				break;
			case 2:
				for(Venta venta : ventas) {
					if(venta.getMedioPago().getNombreMedio().equals("Tarjeta")) {
						System.out.printf("============================================= %n"
										+ "Fecha venta: %s%n"
										+ "Medio pago: %s%n"
										+ "Nombre cuenta: %s%n"
										+ "Numero cuenta: %s%n"
										+ "Productos comprados: %s%n"
										+ "Total: %d%n"
										+ "=============================================== %n",
										venta.getFechaVenta(),
										venta.getMedioPago().getNombreMedio(),
										venta.getMedioPago().getNombreCuenta(), // Sinceramente, no tengo idea que hice aqui
										venta.getMedioPago().getNumeroCuenta(), // Pero funciona, asi que no me quejo.
										venta.getProductosComprados(),
										venta.getMedioPago().getMonto());
					}
				}
				break;
		}
	}

}
