package com.chhota.materialdesigndemo.model;

/**
 * Created by chhota89 on 14/8/16.
 */

public class DrawerItem {

    private String label;
    private int drawerIcon;

    public DrawerItem(String label, int drawerIcon) {
        this.label = label;
        this.drawerIcon = drawerIcon;
    }

    public int getDrawerIcon() {
        return drawerIcon;
    }

    public void setDrawerIcon(int drawerIcon) {
        this.drawerIcon = drawerIcon;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DrawerItem)) return false;

        DrawerItem that = (DrawerItem) o;

        if (getDrawerIcon() != that.getDrawerIcon()) return false;
        return getLabel() != null ? getLabel().equals(that.getLabel()) : that.getLabel() == null;

    }

    @Override
    public int hashCode() {
        int result = getLabel() != null ? getLabel().hashCode() : 0;
        result = 31 * result + getDrawerIcon();
        return result;
    }
}
