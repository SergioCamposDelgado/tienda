package com.miempresa.entidad;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Tienda representa una tienda que contiene una lista de productos.
 * Proporciona métodos para agregar productos, obtener la lista de productos
 * y calcular el precio total de todos los productos en la tienda.
 */
public class Tienda {
    private List<Producto> productos;

  
    public Tienda() {
        this.productos = new ArrayList<>();
    }


    public void agregarProducto(Producto p) {
        productos.add(p);
    }


    public List<Producto> obtenerProductos() {
        return new ArrayList<>(productos);
    }


    public double calcularPrecioTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }
}