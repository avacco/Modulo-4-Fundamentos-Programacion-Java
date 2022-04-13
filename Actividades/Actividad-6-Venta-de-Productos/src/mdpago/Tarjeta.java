package mdpago;

public class Tarjeta extends MedioPago{
	
	protected String nombreCuenta;
	protected String numeroCuenta;

	public Tarjeta() {
		
	}
	
	public Tarjeta(String nombreMedio, int monto, String nombreCuenta, String numeroCuenta) {
		super(nombreMedio, monto);
		this.nombreCuenta = nombreCuenta;
		this.numeroCuenta = numeroCuenta;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}


	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}


	public String getNombreCuenta() {
		return nombreCuenta;
	}


	public void setNombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}

	
}
