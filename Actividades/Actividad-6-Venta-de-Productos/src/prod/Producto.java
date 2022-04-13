package prod;

public class Producto {
	private String codigo;
	private String nombre;
	private int precio;
	
	public Producto() {
		
	}
	
	public Producto(String codigo, String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;;
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
