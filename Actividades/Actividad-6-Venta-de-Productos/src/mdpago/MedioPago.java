package mdpago;

public abstract class MedioPago {

	protected String nombreMedio;
	protected int monto;
	
	public MedioPago() {
		
	}
	
	public MedioPago(String nombreMedio, int monto) {
		this.nombreMedio = nombreMedio;
		this.monto = monto;
	}



	public String getNombreMedio() {
		return nombreMedio;
	}



	public void setNombreMedio(String nombreMedio) {
		this.nombreMedio = nombreMedio;
	}



	public int getMonto() {
		return monto;
	}



	public void setMonto(int monto) {
		this.monto = monto;
	}

	//TODO: Practicar mas con estas cosas
	public abstract String getNombreCuenta();
	public abstract String getNumeroCuenta();

}
