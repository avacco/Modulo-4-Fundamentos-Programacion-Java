package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import punto_de_venta.*;

class VentaTest {

	@Test
	void test() {
		//CASO 1
		Producto p1 = new Producto("aaa","AAA",100);
		Producto p2 = new Producto("bbb","BBB",200);
		
		LineaDetalle ld1 = new LineaDetalle(1,p1);
		LineaDetalle ld2 = new LineaDetalle(2,p2);
		
		Venta venta = new Venta();
		
		venta.agregarLineaDetalle(ld1);
		venta.agregarLineaDetalle(ld2);
	
		assertEquals(500,venta.calcularTotal());
		
		//CASO 2
		LineaDetalle ld3 = new LineaDetalle(10,p1);
		
		Venta venta2 = new Venta();
		venta2.agregarLineaDetalle(ld3);
			
		assertEquals(1000,venta2.calcularTotal());
	}

}
