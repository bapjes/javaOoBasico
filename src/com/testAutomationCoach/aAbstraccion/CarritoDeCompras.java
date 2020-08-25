package com.testAutomationCoach.aAbstraccion;

public class CarritoDeCompras {
    Articulo[] carro = new Articulo[100];
    int numeroArticulos = 0;



    public void agregarArticulo(Articulo a)
    {
        carro[numeroArticulos] = a;
        numeroArticulos++;
    }

    public void muestraArticulos(int posicion)
    {
        System.out.println(carro[posicion].nombre);

    }


}
