package Medios;

public class Bicicleta extends Terrestre{

	public Bicicleta(String tipoMotor, double capacidadCarga, int capacidadPasajeros, int cantidadRuedas) {
		super(tipoMotor, capacidadCarga, capacidadPasajeros, cantidadRuedas);
		this.tipoMotor = "No tiene"; // Una bicicleta no tiene motor. Esto no deberia pasar, pero si sucede por algun error de diseño,
									 // se puede descartar cualquier parametro entrante en "tipoMotor" a traves de una definicion.
	}
	
	@Override
	public void trasladarse() {
		System.out.println("Bicicleta: Pedaleando...");
	}

}
