package clases;

public class Auto {
	private String ppu;
	private String marca;
	private String modelo;
	private boolean mantenido;
	private int fecha;
	private Cliente poseedor;
	
	public Auto(){
	}
	
	public Auto(String ppu, String marca, String modelo, int fecha, Cliente poseedor, boolean mantenido) {
		super();
		this.fecha = fecha;
		this.ppu = ppu;
		this.marca = marca;
		this.modelo = modelo;
		this.poseedor = poseedor;
		this.setMantenido(mantenido);
		
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

	public int getFecha() {
		return fecha;
	}
	
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public Cliente getPoseedor() {
		return poseedor;
	}

	public void setPoseedor(Cliente poseedor) {
		this.poseedor = poseedor;
	}

	public boolean isMantenido() {
		return mantenido;
	}

	public void setMantenido(boolean mantenido) {
		this.mantenido = mantenido;
	}

	
	
}
