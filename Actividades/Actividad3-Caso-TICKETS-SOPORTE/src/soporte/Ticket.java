package soporte;

import java.time.LocalDateTime;

public class Ticket {

	private int numeroTicket;
	private LocalDateTime fecha;
	private String descripcionProblema;
	private String estado;
	private String solucionProblema;
	private Cliente cliente = new Cliente();
	private Soporte soporte = new Soporte();
	private Especialista especialista = new Especialista();
	
	
	public Ticket() {
	}

	public Ticket(int numeroTicket, LocalDateTime fecha, String descripcionProblema, String estado, String solucionProblema, Cliente cliente, Soporte soporte, Especialista especialista) {
		this.numeroTicket = numeroTicket;
		this.fecha = fecha;
		this.descripcionProblema = descripcionProblema;
		this.estado = estado;
		this.solucionProblema = solucionProblema;
		this.cliente = cliente;
		this.soporte = soporte;
		this.especialista = especialista;
	}

	public int getNumeroTicket() {
		return numeroTicket;
	}

	public void setNumeroTicket(int numeroTicket) {
		this.numeroTicket = numeroTicket;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Soporte getSoporte() {
		return soporte;
	}

	public void setSoporte(Soporte soporte) {
		this.soporte = soporte;
	}
	
	public Especialista getEspecialista() {
		return especialista;
	}

	public void setEspecialista(Especialista especialista) {
		this.especialista = especialista;
	}
	
	
	
	
	
}
