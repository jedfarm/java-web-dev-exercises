package org.launchcode.java.studios.restaurantmenu;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menu;
    private LocalDate lastUpdated;

    public Menu(ArrayList<MenuItem> menu){
        this.menu = menu;
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }



    public void addMenuItem(MenuItem item){
        this.menu.add(item);
        this.lastUpdated =  LocalDate.now();
    }


}
