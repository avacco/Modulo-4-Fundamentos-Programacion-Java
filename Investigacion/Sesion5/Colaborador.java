package remuneraciones;

public class Colaborador {
	
	//Propiedades
	private String nombre;
	public int sueldoBase;
	private String afp;
	
	// Constructor
	public Colaborador(String nombre,int sueldoBase) {
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
	}
	
	public int calcularMontoAFP() {
		//validar la afp
		String[] afpsValidas = conseguirListaAfps();
		// ... codigo que hace la validacion
		// ...
		switch(afp) {
			case "capital": {
				return (int) (sueldoBase * 0.1144);
			}
			case "cuprum": {
				return (int) (sueldoBase * 0.1144);
			}
			case "planvital": {
				return (int) (sueldoBase * 0.1116);
			}
			case "provida": {
				return (int) (sueldoBase * 0.1145);
			}
			case "modelo": {
				return (int) (sueldoBase * 0.1058);
			}
			case "uno": {
				return (int) (sueldoBase * 0.1069);
			}
			default:
				return 0;
		}
	}
		private String[] conseguirListaAfps() {
			return new String[]{
				"modelo",
				"cuprum",
				"habitat"
				//etc
			};
		}
		
		//Getters
		// Con estos se puede acceder a propiedades privadas
		public String getNombre() {
			return nombre;
		}
		public int getSueldoBase() {
			return sueldoBase;
		}
		public String getAfp() {
			return afp;
		}
		//Setters
		// Con estos se puede setear valores nuevos en las variables correspondientes
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public void setSueldoBase(int sueldoBase) {
			this.sueldoBase = sueldoBase;
		}
		public void setAfp(String afp) {
			this.afp = afp;
		}

		
}

