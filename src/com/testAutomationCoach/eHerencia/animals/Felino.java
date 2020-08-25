package com.testAutomationCoach.eHerencia.animals;

public class Felino extends Animal {

  public void socializar()
  {
      System.out.println("Comportamiento : Acecha a su presa se acercan sigilosamnete y luego atacan");
  }

    @Override
    public void comer() {
        super.comer();
        System.out.println("Alimentacion : Solo come carne");
    }



}
