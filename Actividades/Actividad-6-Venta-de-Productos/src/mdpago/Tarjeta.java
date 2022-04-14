package mdpago;

/**
 * Clase para objetos Tarjeta, hereda de MedioPago y tiene dos atributos propios, nombreCuenta y numeroCuenta.
 * 
 * @author ANDRES
 *
 */

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
	
	@Override
	public String getNumeroCuenta() {
		return numeroCuenta;
	}


	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	@Override
	public String getNombreCuenta() {
		return nombreCuenta;
	}


	public void setNombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}

	
}
