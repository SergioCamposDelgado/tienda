package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class ProductoTest {

	protected Producto p;
	
	@BeforeEach
	void setUp() throws Exception {
		p = new Producto("Laptop" , 1200.00);
	}

	@Test
	@DisplayName ("Debe crear un producto con nombre y precio valido")
	void deberiaCrearUnProductValido() {
		
		String nameEsperado = "Laptop";
		
		double priceEsperado = 1200.00;
		
		assertNotNull(p);
		
		assertEquals(nameEsperado, p.getNombre());
		
		assertEquals(priceEsperado, p.getPrecio());
	}

	@Test
	@DisplayName ("Debe lanzar IllegalArgumentExcaption si el precio negativo")
	void deberiaCrearUnaExcepcion() {
		
		double precionegativo = -3.20;
		Exception exception_price = assertThrows(IllegalArgumentException.class, ()->new Producto("Laptop", precionegativo) );
		String mensajeEsperado_price = "El precio no puede ser negativo: " + precionegativo;
		
		assertEquals(mensajeEsperado_price, exception_price.getMessage());
		
	}
	
	
	@Test
	@DisplayName ("Debe ser valido el getNombre() con nombre valido")
	void testGetNombre() {
		String mensajeEsperado = "Laptop";
		String mensajeObtenido = p.getNombre();
		
		assertEquals(mensajeObtenido, mensajeEsperado);
	}
	
	@Test
	@DisplayName ("Debe ser valido el getPrecio() con precio valido")
	void testGetPrecio() {
		double precioObtenido = p.getPrecio();
		double precioEsperado = 1200.00;
		
		assertEquals(precioObtenido, precioEsperado);
	}
	
	@Test
	@DisplayName ("Debe ser valido el SetPrice() con precio valido")
	void testSetPrecio() {
		p.setPrecio(20.00);
		double precioObtenido = p.getPrecio();
		double precioEsperado = 20.00;
		
		assertEquals(precioObtenido, precioEsperado);
	}
	
	@Test
	@DisplayName ("Debe crear un excepcion de precio invalido")
	void testSetPrecioExcepcion() {
		double precioEsperado = 1200.00;
		
		double precionegativo = -20.0;
		Exception exception_price = assertThrows(IllegalArgumentException.class, ()->p.setPrecio(precionegativo) );
		String mensajeEsperado_price = "El precio no puede ser negativo: " +precionegativo;
		
		double precioObtenido = p.getPrecio();
		
		assertEquals(precioObtenido, precioEsperado);
		assertEquals(mensajeEsperado_price, exception_price.getMessage());
			
	}
	
	@Test
	@DisplayName ("Debe ser valido el SetName() con nombre valido")
	void testSetNombre() {
		
		p.setNombre("PC");
		String mensajeObtenido = p.getNombre();
		String mensajeEsperado = "PC";
		
		assertEquals(mensajeEsperado, mensajeObtenido);
			
	}
	
	
	/*Ví interesante incluir este test de un ejercicio ya visto en clase */
	
	@ParameterizedTest
	@CsvSource({"'Smartphone' , 699,99" , "'Tablet' , 229,40" ,"'Monitor' , 100.00" })
	@DisplayName ("Debe crear permitir crear productos con nombre y precio validos")
	void deberiaCrearProductoConVariosAtributosValidos (String name , double price) {
		Producto p = new Producto(name, price);
		assertNotNull(p);
		assertEquals(name, p.getNombre());
		assertEquals(price, p.getPrecio());
	}

}
