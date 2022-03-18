package soporte;

public class Producto {

	private String codigoProducto;
	private String nombreProducto;
	
	public Producto() {
		
	}
	
	public Producto(String codigoProducto, String nombreProducto) {
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	
	
}
