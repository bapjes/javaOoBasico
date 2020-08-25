package com.testAutomationCoach.eHerencia.animals;

public class Perro extends Canino{

	public Perro()
	{
		setTipo("perro");
	}

	@Override
	public void hacerRuido() {
		System.out.println("El perro hace guagua");
		super.hacerRuido();
	}

	@Override
	public void orinar() {
		super.orinar();
		System.out.println("Tiene que aprender donde orinar");
	}


}
