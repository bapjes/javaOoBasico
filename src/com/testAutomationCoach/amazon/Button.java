package com.testAutomationCoach.amazon;

public class Button extends WebElement {
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

    public void press() {}

    public void release() {}
}
