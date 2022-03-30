package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import geometria.Rectangulo;

class RectanguloTest {

	@Test
	void testAreaRectangulo() {
		int area1 = (int) (new Rectangulo(10,5)).calcularArea();
		assertEquals(area1,50);
		
		int area2 = (int) (new Rectangulo(5,5)).calcularArea();
		assertEquals(area2,25);
	}

	@Test
	//Modo alternativo usando setters
	void testAreaRectangulo2() {
		Rectangulo rectangulo = new Rectangulo();
		rectangulo.setBase(5);
		rectangulo.setAltura(5);
		int area = (int) rectangulo.calcularArea();
		assertEquals(area,25);
		
	}

}
