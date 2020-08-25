package com.testAutomationCoach.eHerencia.animals;

public class Hipopotamo  extends Animal {

    public void hacerRuido() {
        System.out.println("nosesabe");
    }
    public void comer() {
        System.out.println("Como hierbas y en ocasiones carne");
    }
    public Hipopotamo()
    {
        setTipo("hipopotamo");
    }

}
