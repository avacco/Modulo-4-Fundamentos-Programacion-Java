package prod;

/**
 * En un DetalleVenta se guardan los productos y la cantidad de estos para las Ventas
 * @author ANDRES
 *
 */

public class DetalleVenta {

	private int cantidad;
	private Producto producto;
	
	public DetalleVenta() {

	}

	public DetalleVenta(int cantidad, Producto producto) {
		this.cantidad = cantidad;
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	/**
	 * Metodo para calculo del valor del producto y su cantidad asociada
	 * @return subtotal para continuar el calculo en Venta
	 */
	
	public int calcularSubtotal() {
		return cantidad * producto.getPrecio();
	}
	
}
