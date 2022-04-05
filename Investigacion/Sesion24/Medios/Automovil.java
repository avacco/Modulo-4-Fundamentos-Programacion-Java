package Medios;

public class Automovil extends Terrestre {
	
	protected int puertas;
	
	public Automovil(String tipoMotor, double capacidadCarga, int capacidadPasajeros, int cantidadRuedas, int puertas, int avaluo) {
		super(tipoMotor, capacidadCarga, capacidadPasajeros, cantidadRuedas, avaluo);
		this.puertas = puertas;
	}

	
	
	public Automovil(double capacidadCarga, int avaluo) {
		super("gasolina", capacidadCarga, 2, 4, avaluo);
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
							 // buscara en clases superiores, en este caso, la clase Transporte.
	}
	
	@Override
	public String toString() {
		return String.format("Automovil avaluada %d con motor a %s",avaluo,tipoMotor);
	}

}
