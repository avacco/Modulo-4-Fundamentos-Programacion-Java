package soporte;

public class Soporte {

	private String rutSoporte;
	private String nombreSoporte;
	private String usuarioSoporte;
	private String passSoporte;
	
	public Soporte() {
		
	}

	public Soporte(String rutSoporte, String nombreSoporte, String usuarioSoporte, String passSoporte) {
		super();
		this.rutSoporte = rutSoporte;
		this.nombreSoporte = nombreSoporte;
		this.usuarioSoporte = usuarioSoporte;
		this.passSoporte = passSoporte;
	}

	public String getRutSoporte() {
		return rutSoporte;
	}

	public void setRutSoporte(String rutSoporte) {
		this.rutSoporte = rutSoporte;
	}

	public String getNombreSoporte() {
		return nombreSoporte;
	}

	public void setNombreSoporte(String nombreSoporte) {
		this.nombreSoporte = nombreSoporte;
	}

	public String getUsuarioSoporte() {
		return usuarioSoporte;
	}

	public void setUsuarioSoporte(String usuarioSoporte) {
		this.usuarioSoporte = usuarioSoporte;
	}

	public String getPassSoporte() {
		return passSoporte;
	}

	public void setPassSoporte(String passSoporte) {
		this.passSoporte = passSoporte;
	}
	
	
	
	
}
