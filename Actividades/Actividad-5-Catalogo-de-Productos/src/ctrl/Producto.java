package ctrl;

public class Producto {

	private String categoria;
	private int precio;
	private String nombre;
	private String descripcion;
	
	public Producto() {
		
	}
	
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
