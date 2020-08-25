package com.testAutomationCoach.dEncapsulacion;

import libs.Input;

public class Automovil {
	//Atributos
	
	private String marca;
	private double velocidadActual;
	private double maximaVelocidad;
	private String tipoDeTransmision;
	private int numDePuertas;
	private int numDeLlantas;

	//nuevas propiedades
	private double litrosGasolina;
	private double temperatura;
	private double revolucionesporMinuto;

		Automovil() {
		this.marca = "Ford";
		this.velocidadActual = 0.0;
		this.maximaVelocidad = 200.0;
		this.tipoDeTransmision = "Manual";
		this.numDePuertas = 2;
		this.numDeLlantas = 4;
		this.litrosGasolina = 40;
		this.temperatura = 20;
		this.revolucionesporMinuto = 0;
	}
	
	Automovil(String marca, double maximaVel, String tipoTransmision, int numPuertas, int numLlantas) {
		this.marca = marca;
		this.velocidadActual = 0.0;
		this.maximaVelocidad = maximaVel;
		this.tipoDeTransmision = tipoTransmision;
		this.numDePuertas = numPuertas;
		this.numDeLlantas = numLlantas;
		this.litrosGasolina = 40;
		this.temperatura = 20;
		this.revolucionesporMinuto = 0;
	}
	//comportamiento

	public void encender()
	{
		System.out.println("Encender: Girar la llave hacia adelante");
		this.revolucionesporMinuto = 800;  // 800 - 1000 por minuto
		this.litrosGasolina -= 0.50;
	}


	public void acelerar() {
		Input.print("Acelerar : run run\n");
		this.velocidadActual += 5.0;
		this.litrosGasolina -= 0.5;
	}
	
	public void frenar() {
		Input.print("Frenar : Screeeeech!\n");
		this.velocidadActual = 0;
		this.litrosGasolina -= 0.5;
	}
	
	public void retroceder() {
		Input.print("Retroceder : piii piii piii piii\n");
		this.velocidadActual -= -5;
		this.litrosGasolina -= 0.5;
	}
	
	public double getVelocidad() {
		return velocidadActual;
		
	}

	public double getGasolina()
	{
		return this.litrosGasolina;
	}

	public void apagar()
	{
		System.out.println("Apagar : Girar llave hacia atras ");
		this.revolucionesporMinuto = 0;
		this.velocidadActual = 0;
	}
}
