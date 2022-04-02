package Medios;

public abstract class Transporte {
	protected String tipoMotor;
	protected double capacidadCarga;
	protected int capacidadPasajeros;
	
	public void trasladarse() {
		System.out.println("Transporte: Trasladandose...");
	}

	public Transporte(String tipoMotor, double capacidadCarga, int capacidadPasajeros) {
		super();
		this.tipoMotor = tipoMotor;
		this.capacidadCarga = capacidadCarga;
		this.capacidadPasajeros = capacidadPasajeros;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}

	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}
	
	

}
