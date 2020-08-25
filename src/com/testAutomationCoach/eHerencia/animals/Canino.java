package com.testAutomationCoach.eHerencia.animals;

public class Canino extends Animal {

    public void socializar()
    {
        System.out.println("Comportamiento : Desarrollo social en manada corren por su presa");
    }

    @Override
    public void comer() {
        super.comer();
        System.out.println("Alimentacion : Se alimentan tanto de fuentes animales como vegetales.");

    }


}
