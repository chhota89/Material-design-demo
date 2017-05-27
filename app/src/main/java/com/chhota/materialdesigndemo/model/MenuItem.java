package com.chhota.materialdesigndemo.model;

/**
 * Created by chhota89 on 27/5/17.
 */

public class MenuItem {

    private String textDescription;
    private int imageIcon;


    public MenuItem(String textDescription, int imageIcon) {
        this.textDescription = textDescription;
        this.imageIcon = imageIcon;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public int getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(int imageIcon) {
        this.imageIcon = imageIcon;
    }
}
