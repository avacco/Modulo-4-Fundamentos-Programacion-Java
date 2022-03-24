package punto_de_venta;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;

public class Venta {

	private LocalDateTime fecha;
	private ArrayList<LineaDetalle> lineasDetalle = new ArrayList<>();
	
	
	public Venta() {
		
	}
	public Venta(LocalDateTime fecha, ArrayList<LineaDetalle> lineasDetalle) {
		this.fecha = fecha;
		this.lineasDetalle = lineasDetalle;
	}
	
	
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public ArrayList<LineaDetalle> getLineasDetalle() {
		return lineasDetalle;
	}
	public void setLineasDetalle(ArrayList<LineaDetalle> lineasDetalle) {
		this.lineasDetalle = lineasDetalle;
	}
	
	public void agregarLineaDetalle(LineaDetalle lineaDetalle) {
		this.lineasDetalle.add(lineaDetalle);
		this.fecha = LocalDateTime.now();
	}

	
	
}
