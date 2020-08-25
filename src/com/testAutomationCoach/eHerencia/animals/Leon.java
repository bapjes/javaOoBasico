package com.testAutomationCoach.eHerencia.animals;

public class Leon  extends Felino {

    public void hacerRuido() {
        System.out.println("rugido de trueno!");
    }

    public Leon()
    {
        setTipo("leon");
    }

    @Override
    public void dormir() {
        super.dormir();
        System.out.println("El leon es flojo ");
    }
}
