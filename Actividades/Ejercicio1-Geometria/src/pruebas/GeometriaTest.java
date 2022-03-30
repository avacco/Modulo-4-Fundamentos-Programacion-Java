package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import geometria.Circulo;
import geometria.Rectangulo;

class GeometriaTest {

@Test
	
	void testRadio() {
		
		double diametro = 30;
		double radio = 0;
		
		Circulo circulo = new Circulo(diametro);
		radio = circulo.radioCirculo();
		assertEquals(radio, 15);
	}

	@Test
	
	void testAreaRectangulo() {
		
		double base = 10;
		double altura = 15;
		
		Rectangulo rectangulo = new Rectangulo(base, altura);
		double area = rectangulo.calcularArea();
		assertEquals(area, 150);					
	}

	@Test
	
	void testPerimetroCirculo() {
		
		double diametro = 15;
		
		Circulo circulo = new Circulo(diametro);
		double perimetro = circulo.calcularPerimetro();
		assertEquals(perimetro, 47.12388980384689);
	}
	
	@Test
	
	void testAreaCirculo() {
		
		double diametro = 20;
		
		Circulo circulo = new Circulo(diametro);
		double area = circulo.calcularArea();
		assertEquals(area, 314.1592653589793);		
	}

}
