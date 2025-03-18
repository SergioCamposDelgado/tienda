package com.miempresa.entidad;

/**
 * La clase Producto representa un producto con un nombre y un precio.
 * Proporciona métodos para acceder y modificar estos atributos, así como
 * validaciones para asegurar que el precio no sea negativo.
 */
public class Producto {
    private String nombre;
    private double precio;

    /**
     * Constructor de la clase Producto.
     *
     * @param nombre Nombre del producto. No puede ser nulo ni vacío.
     * @param precio Precio del producto. Debe ser mayor o igual a 0.
     * @throws IllegalArgumentException Si el precio es negativo.
     */
    public Producto(String nombre, double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo: " + precio);
        }
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Devuelve el precio del producto.
     *
     * @return El precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Devuelve el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el producto.
     *
     * @param nombre Nuevo nombre del producto. No puede ser nulo ni vacío.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece un nuevo precio para el producto.
     *
     * @param precio Nuevo precio del producto. Debe ser mayor o igual a 0.
     * @throws IllegalArgumentException Si el precio es negativo.
     */
    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo: " + precio);
        }
        this.precio = precio;
    }
}