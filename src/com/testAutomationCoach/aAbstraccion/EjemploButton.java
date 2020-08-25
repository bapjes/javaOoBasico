package com.testAutomationCoach.aAbstraccion;

public class EjemploButton {

    public static void main(String[] args) {
        Button buttonOk = new Button();
        Button buttonCancel = new Button();

        buttonOk.setColor("green");
        buttonOk.setLabel("OK");

        buttonCancel.setColor("red");
        buttonCancel.setLabel("Cancel");

        //Creo el objeto pantalla y agrego los botones creados
        Pantalla login = new Pantalla();
        login.addButtons(buttonOk);
        login.addButtons(buttonCancel);

        System.out.println("Total of buttons : " +  login.totalButtons());
        login.showButtons();

        //Destruyo los objetos
        buttonOk = null;
        buttonCancel = null;
        login = null;

    }
}
