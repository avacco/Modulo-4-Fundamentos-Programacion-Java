package clases;

import java.util.ArrayList;

public class Cliente {
	
	private String nombres;
	private String apellidos;
	private String rut;
	private String correo;
	private String fono;
	private ArrayList<Auto> autos = new ArrayList<>();
	
	public Cliente() {
		
	}
	
	public Cliente(String nombres, String apellidos, String rut, String correo, String fono) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.rut = rut;
		this.correo = correo;
		this.fono = fono;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFono() {
		return fono;
	}

	public void setFono(String fono) {
		this.fono = fono;
	}

	public ArrayList<Auto> getAutos() {
		return autos;
	}

	public void setAutos(ArrayList<Auto> autos) {
		this.autos = autos;
	}
	
	public String autosCliente() {
		// Declara un String autosCliente que ira sumando los autos del cliente
		String autosCliente = "";
		for (Auto auto : this.autos) {
			autosCliente += "| PPU: "+auto.getPpu()+" |\n"
						  + "| Marca: "+auto.getMarca()+" |\n"
						  + "| Modelo: "+auto.getModelo()+" |\n"
						  + "| Año: "+auto.getFecha()+" |\n"
						  + "___________________________\n";
		}
		return autosCliente;
	}
	public void addAuto(Auto auto) {
		this.autos.add(auto);
	}
}
