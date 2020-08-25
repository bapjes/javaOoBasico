package com.testAutomationCoach.eHerencia.doctores;

public class ProfesionalDeSalud {

    String nombre;
    String profesion;

    public void tratarPaciente() {
        System.out.println("Checar los signos vitales");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.contains("#"))
        {
            System.out.println("El nombre no es valido");
        }
        else
            this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }


}
