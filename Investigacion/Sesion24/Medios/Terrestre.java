package Medios;

public class Terrestre extends Transporte {

	protected int cantidadRuedas;

	public Terrestre(String tipoMotor, double capacidadCarga, int capacidadPasajeros, int cantidadRuedas) {
		super(tipoMotor, capacidadCarga, capacidadPasajeros); //Constructor con atributos heredados
		this.cantidadRuedas = cantidadRuedas; // Atributos propios
	}
	
	public int getCantidadRuedas() {
		return cantidadRuedas;
	}

	public void setCantidadRuedas(int cantidadRuedas) {
		this.cantidadRuedas = cantidadRuedas;
	}

}
