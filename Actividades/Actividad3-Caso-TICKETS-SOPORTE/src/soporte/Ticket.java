package soporte;

import java.util.Calendar;

public class Ticket {

	private int numeroTicket;
	private Calendar fecha;
	private String descripcionProblema;
	private String estado;
	private String solucionProblema;
	
	
	
	public Ticket() {
	}

	public Ticket(int numeroTicket, Calendar fecha, String descripcionProblema, String estado, String solucionProblema) {
		this.numeroTicket = numeroTicket;
		this.fecha = fecha;
		this.descripcionProblema = descripcionProblema;
		this.estado = estado;
		this.solucionProblema = solucionProblema;
	}

	public int getNumeroTicket() {
		return numeroTicket;
	}

	public void setNumeroTicket(int numeroTicket) {
		this.numeroTicket = numeroTicket;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public String getDescripcionProblema() {
		return descripcionProblema;
	}

	public void setDescripcionProblema(String descripcionProblema) {
		this.descripcionProblema = descripcionProblema;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getSolucionProblema() {
		return solucionProblema;
	}

	public void setSolucionProblema(String solucionProblema) {
		this.solucionProblema = solucionProblema;
	}
	
	
	
	
	
}
