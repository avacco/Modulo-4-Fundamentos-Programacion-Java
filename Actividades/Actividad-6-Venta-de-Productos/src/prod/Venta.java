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
	
	public Venta(MedioPago medioPago, LocalDate fechaVenta) {
		this.medioPago = medioPago;
		this.fechaVenta = fechaVenta;
	}

	public MedioPago getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(MedioPago medioPago) {
		this.medioPago = medioPago;
	}
	
	public void agregarDetalleVenta(DetalleVenta detalleVenta) {
		this.dv.add(detalleVenta);
	}
	
	
	
}
