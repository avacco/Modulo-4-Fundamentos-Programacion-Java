package mdpago;

public class Efectivo extends MedioPago{

	public Efectivo() {
	
	}
	
	public Efectivo(String nombreMedio, int monto) {
		super("Efectivo", monto);
		
	}

	
	//TODO: Este metodo no utilizará estas funciones. ¿Como me deshago de ellas?
	@Override
	public String getNombreCuenta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNumeroCuenta() {
		// TODO Auto-generated method stub
		return null;
	}

}
