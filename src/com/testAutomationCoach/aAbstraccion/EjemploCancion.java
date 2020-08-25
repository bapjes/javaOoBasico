package com.testAutomationCoach.aAbstraccion;

public class EjemploCancion {
    public static void main(String[] args) {
        Cancion blowingInTheWind = new Cancion();
        blowingInTheWind.artista = "Bob Dylan";
        blowingInTheWind.anio = 1963;
        blowingInTheWind.duracion = "1:80";
        blowingInTheWind.letra = "The answer my frined is blowing in the wind ...";
        blowingInTheWind.editar();
        blowingInTheWind.grabar();
        blowingInTheWind.reproducir();
    }
}
