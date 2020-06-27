package org.launchcode.java.studios.restaurantmenu;

import java.util.Arrays;

public class MenuItem {
    private String name;
    private float price;
    private String description;
    private String category;
    private boolean isNew;


    public MenuItem(String name, float price, String description, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.setCategory(category); // Check this out
        this.isNew = isNew;
        
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public float getPrice() {
        return price;
    }

    public void setCategory(String category) {
        String[] categories = {"appetizer","main course","dessert"};
        // Find if the category entered matches one of the 3 possibilities.
        if(Arrays.stream(categories).anyMatch(category.toLowerCase()::equals)){
            this.category = category;
        } else {
            this.category = "unknown";
        }

    }
    public String getCategory() {
        return category;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean getNew() {
        return isNew;
    }

    public void printMenuItem(){
        if (this.getCategory().equals("unknown")){
            System.out.println("Unknown category, please go fixing this Menu Item");
        } else {
            System.out.println("********** " + this.getCategory() + " **********");
            System.out.println("Item: " + this.name + ", Price: $" + this.price + ", New: " + this.isNew);
            System.out.println("Description: " + this.description);
        }
    }
}
