package Medios;

public class Moto extends Terrestre{

    protected String ppu;


    public Moto(String tipoMotor, double capacidadCarga, int capacidadPasajeros, int cantidadRuedas, int puertas, int avaluo, String ppu){
        super(tipoMotor, capacidadCarga, capacidadPasajeros, cantidadRuedas, avaluo);
        this.ppu = ppu;
    }

	public Moto(double capacidadCarga, int avaluo, String ppu) {
		super("gasolina", capacidadCarga, 2, 4, avaluo);
		this.ppu = ppu;
	}

    public String getPpu(){
        return ppu;
    }

    public void setPpu(String ppu){
        this.ppu = ppu;
    }

    // Retorna el hashcode de la ppu de esta clase en mayusculas
    @Override
    public int hashCode(){
        return ppu.toUpperCase().hashCode();
    }

    // Si el obj enviado no es una instancia de la clase Moto retorna false, terminando la ejecucion del resto del codigo
    @Override
    public boolean equals(Object obj){
        if (! (obj instanceof Moto)){
            return false;
        }
        
        // Convierte el parametro obj a Moto y lo asigna a la variable otraMoto
        Moto otraMoto = (Moto) obj;

        // Compara las placas patente de esta clase y el obj enviado
        return this.ppu.equalsIgnoreCase(otraMoto.getPpu());
    }

	@Override
	public String toString() {
		return String.format("Moto avaluada %d con numero patente %s",avaluo, ppu);
	}

}