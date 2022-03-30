package docenteEmpleado;

public class Empleado {

	private String nombre;
	private String rut;
	protected int sueldo;
	
	public Empleado(String nombre, String rut, int sueldo) {
		this.nombre = nombre;
		this.rut = rut;
		this.sueldo = sueldo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public void coso() {
		System.out.println("coso");
	}
	
}
