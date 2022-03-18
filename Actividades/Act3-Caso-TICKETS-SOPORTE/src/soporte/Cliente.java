package soporte;

public class Cliente {

	private String rut;
	private String nombre;
	private String telefono;
	private String correoElectronico;
	
	public Cliente() {
		
	}
	
	public Cliente(String rut, String nombre, String telefono, String correoElectronico) {
		this.rut = rut;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
	}



	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	
	
}
