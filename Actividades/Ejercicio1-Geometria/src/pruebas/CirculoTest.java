package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import geometria.Circulo;

class CirculoTest {

	@Test
	void testCalculoRadio() {
		/* 
		 * CALCULO DE RADIO DE CIRCULO
		 * METODO: Circulo.radioCirculo()
		 * INPUT: Caso1: Diametro 100 | Caso2: Diametro 50 | Caso3: Diametro 20 | CasoFail: Diametro 20
		 * CALCULO ESPERADO: Caso1: Radio de 50 | Caso2: Radio de 25 | Caso3: Radio de 10 | CasoFail: Error
		 */
		
		// Caso1
		Circulo circulo1 = new Circulo(100);
		double radio1 = circulo1.radioCirculo();
		assertEquals(50.0,radio1);
		
		// Caso2
		Circulo circulo2 = new Circulo(50);
		double radio2 = circulo2.radioCirculo();
		assertEquals(25.0,radio2);

		// Caso3
		Circulo circulo3 = new Circulo(20);
		double radio3 = circulo3.radioCirculo();
		assertEquals(10.0,radio3);
		
		//CasoFail
		Circulo circuloFail = new Circulo();
		circulo3.setDiametro(20);
		double radioFail = circuloFail.radioCirculo();
		assertEquals(1.0,radioFail);
		
	}
	
	@Test
	void testCalculoPerimetro() {
		/* 
		 * CALCULO DE PERIMETRO DE CIRCULO
		 * METODO: Circulo.perimetroCirculo()
		 * INPUT: Caso1: Diametro 65
		 * CALCULO ESPERADO: Caso1: Perimetro de 240 
		 */
		
		//Caso1
		Circulo circulo1 = new Circulo(65);
		double perimetro1 = circulo1.perimetroCirculo();
		perimetro1 = Math.round(perimetro1);
		assertEquals(204.0,perimetro1);

	}
	
	@Test
	void testCalculoArea() {
		/* 
		 * CALCULO DE AREA DE CIRCULO
		 * METODO: Circulo.areaCirculo()
		 * INPUT: Caso1: Diametro 65
		 * CALCULO ESPERADO: Caso1: Perimetro de 240 
		 */
		
		//Caso1
		Circulo circulo1 = new Circulo(75);
		double area1 = circulo1.areaCirculo();
		area1 = Math.round(area1);
		assertEquals(4418.0,area1);

	}

}
