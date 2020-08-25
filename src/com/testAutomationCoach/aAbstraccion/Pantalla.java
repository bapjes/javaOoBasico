package com.testAutomationCoach.aAbstraccion;

import java.util.ArrayList;

public class Pantalla {

    ArrayList<Button> buttons = new ArrayList<Button>();
    ArrayList<Image> images = new ArrayList<Image>();

    public void addImages(Image image)
    {
        images.add(image);
    }



    public void addButtons(Button button)
    {
        buttons.add(button);
    }

    public int totalButtons()
    {
        return buttons.size();
    }

    public void showButtons()
    {
        for (Button g: buttons)
        {
            System.out.println("The color is : " + g.getColor());
            System.out.println("The label is : " + g.getLabel());
            System.out.println(g);
        }
    }
}
