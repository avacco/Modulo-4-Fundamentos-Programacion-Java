package geometria;

public class Circulo {
	
	private double diametro;
	
	
	public Circulo(double diametro) {
		this.diametro = diametro;
	}


	public Circulo() {
	}


	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	

	public double radioCirculo() {
		return this.diametro / 2;
	}
	
	public double areaCirculo() {
		return Math.PI * Math.pow((diametro/2), 2);
	}
	
	public double perimetroCirculo() {
		return Math.PI * this.diametro;
	}
	

}
