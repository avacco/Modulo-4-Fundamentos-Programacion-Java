package Medios;

public abstract class Transporte implements Comparable<Transporte> {
	protected String tipoMotor;
	protected double capacidadCarga;
	protected int capacidadPasajeros;
	protected int avaluo;
	
	public void trasladarse() {
		System.out.println("Transporte: Trasladandose...");
	}

	public Transporte(String tipoMotor, double capacidadCarga, int capacidadPasajeros, int avaluo) {
		super();
		this.tipoMotor = tipoMotor;
		this.capacidadCarga = capacidadCarga;
		this.capacidadPasajeros = capacidadPasajeros;
		this.avaluo = avaluo;
	}

	// Trae el metodo compareTo de Comparable
	// Ordena los transportes de mayor a menor respecto a su valor
	@Override
	public int compareTo(Transporte otroTransporte) {
		if (this.avaluo > otroTransporte.getAvaluo()){
			return -1;
		}else if (this.avaluo < otroTransporte.getAvaluo()){
			return 1;
		}else{
			return 0;
		}
			
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

	public int getAvaluo() {
		return avaluo;
	}

	public void setAvaluo(int avaluo) {
		this.avaluo = avaluo;
	}
	
	

}
