package ctrl;

/**
 * Clase para objeto Producto
 * 
 * @author ANDRES
 *
 */

public class Producto {

	private String categoria;
	private int precio;
	private String nombre;
	private String descripcion;
	
	/**
	 * Constructor vacio para crear instancias sin atributos.
	 */
	
	public Producto() {
		
	}
	
	/**
	 * Constructor comun con atributos
	 * @param categoria del producto para agrupar con otros productos de su misma categoria
	 * @param precio del producto para calculos de valor
	 * @param nombre del producto 
	 * @param descripcion para el producto que la distinga de otras de su mismo tipo
	 */
	
	public Producto(String categoria, int precio, String nombre, String descripcion) {
		this.categoria = categoria;
		this.precio = precio;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
