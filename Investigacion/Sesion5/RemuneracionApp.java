package remuneraciones;

public class RemuneracionApp {

	public static void main(String[] args) {
		Colaborador juanPerez	 = new Colaborador("Juan Perez", 500000);
		Colaborador leandroSoto  = new Colaborador("Leando Soto", 500000);
		
		//Llama una propiedad privada desde el getter de otra clase
		juanPerez.getNombre();
		
		//Si una propiedad es publica, puede tomarse directamente sin necesidad de un getter.
		juanPerez.sueldoBase += 500000;
		// equivalente a juanPerez.sueldoBase = juanPerez.sueldoBase + 500000;
		
		System.out.println("# Reumenraciones App");
		System.out.println("Sueldo Base Juan Perez = "+juanPerez.getSueldoBase());
		juanPerez.setSueldoBase(200000); //setea
		System.out.println("Nuevo sueldo base Juan Perez "+juanPerez.getSueldoBase());
		juanPerez.sueldoBase = 300000; // tambien setea, pero solo porque es public
		System.out.println("Aun mas nuevo sueldo base Juan Perez "+juanPerez.getSueldoBase());

	}
}
