package prod;

import java.time.LocalDate;
import java.util.ArrayList;
import mdpago.MedioPago;


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
	
	public int calcularTotal() {
		int total = 0;	
		for (DetalleVenta detalleVenta : this.dv) {
			total = total + detalleVenta.calcularSubtotal();
		}
		return total;
	}
	
	public String getProductosComprados() {
		String productos = " Productos comprados: ";		
		for (DetalleVenta detalleVenta : this.dv) {
			productos = productos+ " | " +detalleVenta.getCantidad() +" "+ detalleVenta.getProducto().getNombre()+ " | ";
		}	
		return productos;
	}
	
}
