package Medios;

public class Automovil extends Terrestre {
	
	protected int puertas;
	
	public Automovil(String tipoMotor, double capacidadCarga, int capacidadPasajeros, int cantidadRuedas, int puertas) {
		super(tipoMotor, capacidadCarga, capacidadPasajeros, cantidadRuedas);
		this.puertas = puertas;
	}

	
	
	public Automovil(double capacidadCarga) {
		super("gasolina", capacidadCarga, 2, 4);
	}



	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public void trasladarse() {
		super.trasladarse(); // Ejecutara el metodo trasladarse() del padre (Terrestre), si Terrestre no tiene este metodo,
							 // buscará en clases superiores, en este caso, la clase Transporte.
	}
	

}
