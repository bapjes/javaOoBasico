package com.testAutomationCoach.eHerencia.animals;

public class EjemploPerroGato {


    public static void main(String[] args) {
        Perro cooker = new Perro();

        cooker.getTipo();
        cooker.socializar();
        cooker.comer();
        cooker.hacerRuido();
        cooker.orinar();

        Gato siames = new Gato();
        System.out.println("\n");
        siames.getTipo();
        siames.socializar();
        siames.comer();
        siames.hacerRuido();
        siames.orinar();

        cooker = null;
        siames = null;

    }
}
