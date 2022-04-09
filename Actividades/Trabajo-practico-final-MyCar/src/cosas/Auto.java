package cosas;

import java.time.LocalDate;

public class Auto extends Fecha {
	private String ppu;
	private String marca;
	private String modelo;
	private LocalDate fecha;
	
	// AUTO solo pertenece a 1 CLIENTE
	private Cliente poseedor;
	
	public Auto(){
		super();
	}
	
	public Auto(String ppu, String marca, String modelo, LocalDate fecha, Cliente poseedor) {
		super();
		this.fecha = fecha;
		this.ppu = ppu;
		this.marca = marca;
		this.modelo = modelo;
		this.setPoseedor(poseedor);
	}

	public String getPpu() {
		return ppu;
	}

	public void setPpu(String ppu) {
		this.ppu = ppu;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Cliente getPoseedor() {
		return poseedor;
	}

	public void setPoseedor(Cliente poseedor) {
		this.poseedor = poseedor;
	}

	
	
}