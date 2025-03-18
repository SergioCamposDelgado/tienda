package com.miempresa;

import com.miempresa.entidad.Producto;
import com.miempresa.entidad.Tienda;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Crear una instancia de Tienda
        Tienda tienda = new Tienda();

        // Agregar productos a la tienda
        tienda.agregarProducto(new Producto("Laptop", 1200.50));
        tienda.agregarProducto(new Producto("Teclado", 50.99));
        tienda.agregarProducto(new Producto("Mouse", 25.49));

        // Mostrar los productos en la tienda
        System.out.println("📦 Productos en la tienda:");
        for (Producto p : tienda.obtenerProductos()) {
            System.out.println("- " + p.getNombre() + ": $" + p.getPrecio());
        }

        // Calcular y mostrar el precio total
        System.out.println("\n💰 Precio total: $" + tienda.calcularPrecioTotal());
    }
}
