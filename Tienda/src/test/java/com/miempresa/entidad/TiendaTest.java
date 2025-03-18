package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TiendaTest {

	protected Tienda t;
	@BeforeEach
	void setUp() throws Exception {
		t = new Tienda();
	}

	@DisplayName("Test de el constructor")
	@Test
	void testConstructor () {
		assertNotNull(t);
	}
	
	@DisplayName("Test del metodo agregarProducto()")
	@Test
	void testAgregarProducto () {
		Producto productoEsperado = new Producto ("Laptop", 20.0);
		t.agregarProducto(productoEsperado);
		
		Producto productoObtenido = t.obtenerProductos().get(0);
		assertNotNull(productoObtenido);
		assertEquals(productoEsperado.getNombre(), productoObtenido.getNombre());
		assertEquals(productoEsperado.getPrecio(), productoObtenido.getPrecio());
	}
	
	@DisplayName("Test del metodo obtenerProductos()")
	@Test
	void testObtenerProductos () {
		List<Producto> listaEsperada = new ArrayList<Producto>();
		Producto p = new Producto ("Laptop", 20.0);
		t.agregarProducto(p);
		listaEsperada.add(p);
		p = new Producto ("Movil", 30.0);
		t.agregarProducto(p);
		listaEsperada.add(p);
		
		List<Producto> listaObtenida = t.obtenerProductos();
		
		assertNotNull(listaObtenida);
		assertEquals(listaEsperada.size(), listaObtenida.size());
		
		for (int i = 0 ; i < listaEsperada.size() ; i++) {
			assertEquals((listaEsperada.get(i)).getNombre(), ( listaObtenida.get(i)).getNombre());
			assertEquals(( listaEsperada.get(i)).getPrecio(), ( listaObtenida.get(i)).getPrecio());
		}
		
	}
	
	@DisplayName("Test del metodo calcularPrecioTotal()")
	@Test
	void testCalcularPrecioTotal () {
		Producto p = new Producto ("Laptop", 20.0);
		t.agregarProducto(p);
		p = new Producto ("Movil", 30.0);
		t.agregarProducto(p);
		double precioEsperado = 50.0;
		double precioObtenido = t.calcularPrecioTotal();
		
		assertEquals(precioEsperado, precioObtenido);
	}
	
	

}
