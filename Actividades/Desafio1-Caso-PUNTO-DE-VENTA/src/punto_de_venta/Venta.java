package punto_de_venta;

import java.util.ArrayList;
import java.util.Calendar;

public class Venta {

	private Calendar fecha = Calendar.getInstance();
	private ArrayList<LineaDetalle> lineasDetalle = new ArrayList<>();
	
	
	public Venta() {
		
	}
	public Venta(Calendar fecha, ArrayList<LineaDetalle> lineasDetalle) {
		this.fecha = fecha;
		this.lineasDetalle = lineasDetalle;
	}
	
	
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
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
	}
	
	
	
}
