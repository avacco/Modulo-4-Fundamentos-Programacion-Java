package docenteEmpleado;

public class Docente extends Empleado{

	private int horasTrabajadas;
	
	public Docente(String nombre, String rut, int sueldo, int horasTrabajadas) {
		super(nombre, rut, sueldo);
		this.setHorasTrabajadas(horasTrabajadas);
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

    private void sop(String t) {
        System.out.println(t);
    }

	//Utiliza este metodo publico para acceder a un metodo privado.
    public void mostrarLiquidacion(){

    	//No puede accederse a atributos privados de una herencia, debe usarse un getter.
        sop( "Nombre:" +this.getNombre() );
        sop( "RUT:" +this.getRut() );
        //Pero si se puede acceder a atributos protected
        sop( "Sueldo:" + this.sueldo );
        
    }
    
    
}
