package figuras;

public class Rectangulo extends Figura{

	private double base;
	private double altura;

	public Rectangulo() {
	}
	
	

	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}



	//Metodos heredados de la clase Figura
	//Solo se hereda el nombre y el tipo de dato retornado
	//Una vez aqui, puede ser tan diferente de los metodos de las clases hermanas como se quiera
	//pero el nombre siempre sera el mismo.
	
	
	//Override significa que sobreescribirá los metodos de mismo nombre provenientes del padre.
	@Override
	public double calcularArea() {
		return this.base * this.altura;
	}

	@Override
	public double calcularPerimetro() {
		return (this.base * 2) + (this.altura * 2);
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
