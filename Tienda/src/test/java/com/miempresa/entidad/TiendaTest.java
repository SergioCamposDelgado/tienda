package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TiendaTest {
	
	private Tienda tienda;
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;

	@BeforeEach
	void setUp() throws Exception {
		tienda = new Tienda();
		producto1 = new Producto("Portatil", 12000.50);
		producto2 = new Producto("Ratón", 25.00);
		producto3 = new Producto("Monitor", 200.50);
	}

	@Test
	@DisplayName("Debería agregar productos a la tienda")
	void testAgregarProducto() {
		Integer totalEsperado = 3;
		//Añado 3 elementos
		tienda.agregarProducto(producto1);
		tienda.agregarProducto(producto2);
		tienda.agregarProducto(producto3);
		
		assertEquals(totalEsperado, tienda.obtenerProductos().size(), "No se corresponde el total de productos agregados con el tamaño de la lista");

	}
	
	@Test
	@DisplayName("Debería devolver los valores correctos")
	void testValoresCorrectos() {
		tienda.agregarProducto(producto1);
		
		assertEquals("Portatil", tienda.obtenerProductos().get(0).getNombre());
		assertEquals( 12000.50, tienda.obtenerProductos().get(0).getPrecio());
	}
	
	@Test
	@DisplayName("Calcula el precio total de la lista de tienda")
	void testCalcularPrecioTotal() {
		double totalEsperado = 12226.00;
		
		//Añado 3 elementos
	    tienda.agregarProducto(producto1);
		tienda.agregarProducto(producto2);
		tienda.agregarProducto(producto3);
		
		assertEquals(totalEsperado, tienda.calcularPrecioTotal(), "El precio total no se corersponde");
	}

}
