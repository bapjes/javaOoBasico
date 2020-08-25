package com.testAutomationCoach.eHerencia.animals;

import com.testAutomationCoach.libs.Coordenadas;

import java.io.File;

public class Animal {
	protected File picture;
	protected char comida; //Carne o Vegetales o ambos
	protected int nivelHambre; //1-100
	protected String habitat; //selva, bosque, desierto, etc.
	protected Coordenadas location;
	protected String tipo;

	public void hacerRuido(){}
	public void comer() {}
	public void dormir() {}
	public void recorrerTerreno() {}
	public void orinar(){}



	public void setTipo(String animal)
	{
		this.tipo = animal;
	}

	public void getTipo()
	{
		System.out.println("El animal es un : " + this.tipo);
	}


/*	public static class Canino extends Animal {
		public void recorrerTerreno() {}
	}

	public static class Felino extends Animal {

		public void recorrerTerreno() {}
	}*/
}
