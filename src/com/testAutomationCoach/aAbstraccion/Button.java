package com.testAutomationCoach.aAbstraccion;

import java.util.ArrayList;

public class Button {
    String label;
    String color;


    public void setColor(String myColor) {
        this.color = myColor;
    }


    public void setLabel(String myLabel) {
        this.label = myLabel;
    }

    public String getColor() {
        return this.color;
    }

    public String getLabel() {
        return this.label;
    }

    public void click(String label) {
        System.out.println("Se hizo click en el boton " + label);
    }

    public void press() {}

    public void release() {}
}
