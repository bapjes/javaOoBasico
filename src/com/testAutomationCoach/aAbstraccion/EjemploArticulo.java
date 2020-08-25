package com.testAutomationCoach.aAbstraccion;

public class EjemploArticulo {
    public static void main(String[] args) {
        Articulo zapatos = new Articulo();

        zapatos.nombre = "Hispanitas";
        zapatos.precio = 2500;

        Articulo laptop = new Articulo();
        laptop.nombre = "Dell";
        laptop.precio = 18500;

        Articulo perro = new Articulo();
        perro.nombre = "Cooker";
        perro.precio = 2000;

        CarritoDeCompras carro = new CarritoDeCompras();
        carro.agregarArticulo(laptop);
        carro.agregarArticulo(zapatos);
        carro.agregarArticulo(perro);

        int longitud = carro.numeroArticulos;
        int contador;
        for (contador=0; contador<longitud; contador++)
        {
            carro.muestraArticulos(contador);
        }

        // se destruye un objeto
        zapatos = null;
        perro = null;
        laptop = null;

       }
}
