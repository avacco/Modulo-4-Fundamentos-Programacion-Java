package ctrl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Producto> productos = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	private static final int MENU_AGREGAR_PRODUCTO = 1;
	private static final int MENU_VER_PRODUCTO = 2;
	private static final int MENU_SALIR = 0;
	
	
	
	public static void main(String[] args) {
		menu();

	}


	private static void menu() {
		int opcion = 1;
		do {
			
			System.out.println("1. Agregar producto");
			System.out.println("2. Ver lista de productos");
			System.out.println("0. Salir");
			System.out.println("Elija una opcion (0-3)");
			
			opcion = scanner.nextInt();
			
			switch(opcion) {
				case MENU_AGREGAR_PRODUCTO:
					agregarProductos();
					break;
				case MENU_VER_PRODUCTO:
					verProductos();
					break;
				case MENU_SALIR:
					break;
			}
			
		}while(opcion != MENU_SALIR);
		
	}

	private static void agregarProductos() {
		scanner.nextLine();
		
		System.out.println("Ingrese nombre del producto");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese categoria del producto");
		String categoria = scanner.nextLine();
		System.out.println("Ingrese precio del producto");
		int precio= scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingrese descripcion del producto");
		String descripcion = scanner.nextLine();
		
		Producto producto = new Producto(categoria,precio,nombre,descripcion);
		productos.add(producto);
		
		System.out.printf("Se añadio el producto '%s' de la categoria '%s' con un precio de '%d' . Su descripcion es '%s' %n.",
				producto.getNombre(),
				producto.getCategoria(),
				producto.getPrecio(),
				producto.getDescripcion());
	}

	private static void verProductos() {
		System.out.println("Lista de productos");
		System.out.println("==========================");
		for(Producto producto : productos) {
			System.out.printf(" Nombre producto: %s %n Categoria producto: %s %n Descripcion producto: %s %n Precio producto: %d %n",
					producto.getNombre(),
					producto.getCategoria(),
					producto.getDescripcion(),
					producto.getPrecio());
		}
		
	}

}
