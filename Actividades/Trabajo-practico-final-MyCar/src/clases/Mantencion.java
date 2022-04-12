package clases;

import java.time.LocalDate;

public class Mantencion {

	private String mantencionRealizada;
	private String observaciones;
	private int montoServicio;
	private LocalDate fechaMantencion;
	private Auto auto;
	
	public Mantencion() {
		
	}
	
	public Mantencion(String mantencionRealizada, String observaciones, int montoServicio, Auto auto, LocalDate fechaMantencion) {
		this.mantencionRealizada = mantencionRealizada;
		this.observaciones = observaciones;
		this.montoServicio = montoServicio;
		this.auto = auto;
		this.fechaMantencion = fechaMantencion;
	}

	public String getMantencionRealizada() {
		return mantencionRealizada;
	}

	public void setMantencionRealizada(String mantencionRealizada) {
		this.mantencionRealizada = mantencionRealizada;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getMontoServicio() {
		return montoServicio;
	}

	public void setMontoServicio(int montoServicio) {
		this.montoServicio = montoServicio;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public LocalDate getFechaMantencion() {
		return fechaMantencion;
	}

	public void setFechaMantencion(LocalDate fechaMantencion) {
		this.fechaMantencion = fechaMantencion;
	}
	
	
	
}
