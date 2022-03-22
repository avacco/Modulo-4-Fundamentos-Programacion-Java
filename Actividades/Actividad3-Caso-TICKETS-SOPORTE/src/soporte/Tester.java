package soporte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tester {

	
	@Test	
	// Prueba de Login
	void testLogin() {		
		Consola.inicializar();
		
		boolean test = Consola.procesarLogin("admin", "pass");
		assertEquals(true, test);
		
		boolean testfail = Consola.procesarLogin("estodeberia", "fallar");
		assertEquals(false,testfail);
		
	}

	
	@Test 
	//BUSQUEDAS
	// Busqueda de Especialista
	void testEspecialista() {
		Especialista especialistaEsperado = new Especialista();
		Cliente clienteEsperado = new Cliente();
		Producto productoEsperado = new Producto();
		Ticket ticketEsperado = new Ticket();

		
		Consola.inicializar();
		especialistaEsperado = Consola.buscarEspecialista("16.655.728-3");	
		assertEquals("Pedro Paredes", especialistaEsperado.getNombreEspecialista());

	// Busqueda de Cliente

		clienteEsperado = Consola.buscarCliente("xx.xxx.xxx-x");	
		assertEquals("xxx", clienteEsperado.getNombre());		
	

	// Busqueda de Producto

		productoEsperado = Consola.buscarProducto("movil150g");	
		assertEquals("Internet Movil 150 GB", productoEsperado.getNombreProducto());		

	// Busqueda de Ticket

		ticketEsperado = Consola.buscarTicket(0);	
		assertEquals("Abierto", ticketEsperado.getEstado());		
	}
	

}
