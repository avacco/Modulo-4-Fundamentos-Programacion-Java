package prod;

import java.time.LocalDate;
import java.util.ArrayList;
import mdpago.MedioPago;

/**
 * En esta clase se guardan el detalle de venta, la fecha de la venta y el medio de pago utilizado.
 * Tambien hay metodos que retornan un string con la lista de productos almacenados en el detalle de venta, y otro que retorna el valor total de los productos vendidos.
 * @author ANDRES
 *
 */

public class Venta {

	MedioPago medioPago;
	LocalDate fechaVenta;
	private ArrayList<DetalleVenta> dv = new ArrayList<>();
	
	public Venta() {
		
	}
	
	public Venta(MedioPago medioPago, LocalDate fechaVenta, ArrayList<DetalleVenta> dv) {
		this.medioPago = medioPago;
		this.fechaVenta = fechaVenta;
		this.dv = dv;
	}

	public MedioPago getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(MedioPago medioPago) {
		this.medioPago = medioPago;
	}
	
	public ArrayList<DetalleVenta> getDv() {
		return dv;
	}

	public void setDv(ArrayList<DetalleVenta> dv) {
		this.dv = dv;
	}

	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public void agregarDetalleVenta(DetalleVenta detalleVenta) {
		this.dv.add(detalleVenta);
	}
	
	/**
	 * Calcula el total de la venta sumando el subtotal de todos los detalles de venta en la clase.
	 * @return total de la venta.
	 */
	
	public int calcularTotal() {
		int total = 0;	
		for (DetalleVenta detalleVenta : this.dv) {
			total = total + detalleVenta.calcularSubtotal();
		}
		return total;
	}
	
	/**
	 * Toma la cantidad y nombre de cada producto comprado en los detalles de venta y los junta en un string.
	 * @return productos en forma de string
	 */
	
	public String getProductosComprados() {
		String productos = " Productos comprados: ";		
		for (DetalleVenta detalleVenta : this.dv) {
			productos = productos+ " | " +detalleVenta.getCantidad() +" "+ detalleVenta.getProducto().getNombre()+ " | ";
		}	
		return productos;
	}
	
}
