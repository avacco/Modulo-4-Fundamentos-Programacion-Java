package cosas;

public class Mantencion {

	private String mantencionRealizada;
	private String observaciones;
	private int montoServicio;
	
	private Auto auto;
	
	public Mantencion() {
		
	}
	
	public Mantencion(String mantencionRealizada, String observaciones, int montoServicio, Auto auto) {
		this.mantencionRealizada = mantencionRealizada;
		this.observaciones = observaciones;
		this.montoServicio = montoServicio;
		this.setAuto(auto);
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
	
	
	
}
