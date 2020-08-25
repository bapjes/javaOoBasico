package com.testAutomationCoach.eHerencia.animals;

public class Gato extends Felino {

    public Gato()
    {
        setTipo("gato");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El gato hace miau");
        super.hacerRuido();
    }




    @Override
    public void orinar()
    {
        System.out.println("Solo necesita una caja con arena donde orinar");
    }
}
