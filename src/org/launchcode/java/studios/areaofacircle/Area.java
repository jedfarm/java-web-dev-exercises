package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        try{
            radius = input.nextDouble();
            while (radius < 0) {
                System.out.println("Please, enter a positive number");
                System.out.println("Enter a radius: ");
                radius = input.nextDouble();
            }
            System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));

        } catch (Exception e) {
            System.out.println("Please, enter a valid number");
        }



    }
}
