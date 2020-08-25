package com.testAutomationCoach.eHerencia.doctores;

public class Doctor extends ProfesionalDeSalud{

    private String especialidad;

    public void tratarPaciente() // se esta sobreescribiendo de la clase profesionaldesalud
    {
        super.tratarPaciente();
        System.out.println("Dale paracetamol");
    }

    public void prescribirMedicina() {}

    public String getEspecialidad() {
        return null;
    }
}
