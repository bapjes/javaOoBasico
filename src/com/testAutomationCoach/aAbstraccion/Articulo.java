package com.testAutomationCoach.aAbstraccion;

//articulo de amazon
public class Articulo {
    String nombre;
    String descripcion;
    double precio;
    double estrellas;
    String procedencia;

    public void seleccionarCantidad(int cantidad)
    {
        System.out.println("Seleccionaste " + cantidad);
    }

    public void agregarCarrito()
    {
        System.out.println("Se agrego el producto al carrito : " + nombre);
    }


}
