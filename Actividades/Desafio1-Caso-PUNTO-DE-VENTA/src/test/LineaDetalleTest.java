package test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import punto_de_venta.*;

class LineaDetalleTest {

	@Test
	void test() {
		//CASO 1
		
		Producto p1 = new Producto();
		p1.setPrecio(100);
		Producto p2 = new Producto();
		p2.setPrecio(500);
		
		
		LineaDetalle ld = new LineaDetalle();
		ld.setCantidad(2);
		ld.setProducto(p1);
		assertEquals(200,ld.calcularSubtotal());
		
		//CASO 2
		LineaDetalle ld2 = new LineaDetalle();
		ld2.setCantidad(1);
		ld2.setProducto(p2);
		assertEquals(500,ld2.calcularSubtotal());
		
	}

}
