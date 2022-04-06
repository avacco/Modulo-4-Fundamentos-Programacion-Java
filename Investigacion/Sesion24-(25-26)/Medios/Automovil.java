package Medios;

public class Automovil extends Terrestre {
	
	protected int puertas;
	protected String ppu;
	
	public Automovil(String tipoMotor, double capacidadCarga, int capacidadPasajeros, int cantidadRuedas, int puertas, int avaluo, String ppu) {
		super(tipoMotor, capacidadCarga, capacidadPasajeros, cantidadRuedas, avaluo);
		this.puertas = puertas;
		this.ppu = ppu;
	}

	
	
	public Automovil(double capacidadCarga, int avaluo, String ppu) {
		super("gasolina", capacidadCarga, 2, 4, avaluo);
		this.ppu = ppu;
	}


	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public String getPpu(){
        return ppu;
    }

    public void setPpu(String ppu){
        this.ppu = ppu;
    }

	@Override
	public void trasladarse() {
		super.trasladarse(); // Ejecutara el metodo trasladarse() del padre (Terrestre), si Terrestre no tiene este metodo,
							 // buscara en clases superiores, en este caso, la clase Transporte.
	}
	
	@Override
	public String toString() {
		return String.format("Automovil avaluado %d con motor a %s y patente %s",avaluo,tipoMotor,ppu);
	}

	// Retorna el hashcode de la ppu de esta clase en mayusculas
	@Override
	public int hashCode(){
		return ppu.toUpperCase().hashCode();
	}
	
	// Si el obj enviado no es una instancia de la clase Moto retorna false, terminando la ejecucion del resto del codigo
	@Override
	public boolean equals(Object obj){
		if (! (obj instanceof Automovil)){
			return false;
		}
		
		// Convierte el parametro obj a Automovil y lo asigna a la variable otroAuto
		Automovil otroAuto = (Automovil) obj;

		// Compara las placas patente de esta clase y el obj enviado
		return this.ppu.equalsIgnoreCase(otroAuto.getPpu());
	}

}
