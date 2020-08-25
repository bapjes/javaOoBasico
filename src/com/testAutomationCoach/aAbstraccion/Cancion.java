package com.testAutomationCoach.aAbstraccion;

public class Cancion {
    //atributos: titulo, artista, duracion, letra, anio lanzamiento
    //metodos reproducir, editar, grabar, etc...

    String nombre;
    String Album;
    String duracion;
    String letra;
    int anio;
    String artista;
    String compositor;

    public void reproducir()
    {
        System.out.println("Reproduciendo");
    }

    public void editar()
    {
        System.out.println("Editando");
    }

    public void grabar()
    {
        System.out.println("Grabando");
    }
}


