package figuras;

public class Circulo extends Figura {

	private double diametro;
	
	public Circulo() {
		
	}

	public Circulo(double diametro) {
		super();
		this.diametro = diametro;
	}

	public double getRadio() {
		return diametro;
	}

	public void setRadio(double diametro) {
		this.diametro = diametro;
	}

	
	//Metodos heredados de la clase Figura
	//Solo se hereda el nombre y el tipo de dato retornado
	//Una vez aqui, puede ser tan diferente de los metodos de las clases hermanas como se quiera
	//pero el nombre siempre sera el mismo.
	
	
	public double radioCirculo() {
		return this.diametro / 2;
	}

	//Override significa que sobreescribirá los metodos de mismo nombre provenientes del padre.	
	@Override
	public double calcularArea() {
		return Math.PI * Math.pow((diametro/2), 2);
	}


	@Override
	public double calcularPerimetro() {
		return Math.PI * this.diametro;
	}
	
	
	
}
