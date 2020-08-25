package com.testAutomationCoach.dEncapsulacion;

public class EjemploAutomovil {

	public static void main(String[] args) {
		Automovil a1 = new Automovil();
		System.out.println("El auto tiene " + a1.getGasolina() + " litros de gasolina");
		if (a1.getGasolina() > 0)
		{
			a1.encender();
			a1.acelerar();
			a1.frenar();
			a1.retroceder();
			a1.apagar();
			System.out.println("Al auto le quedó  " + a1.getGasolina() + " litros de gasolina");
		}
		else
		{
			System.out.println("El auto no tiene gasolina");

		}

		/*Automovil a2 = new Automovil("Chrysler", 250.0, "Automatico", 5, 4);
		a2.acelerar();
		a2.frenar();
		a2.retroceder();*/
	}

}
