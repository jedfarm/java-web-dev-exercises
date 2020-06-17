package excercises;
import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the width of the rectangle in cm: ");
        double width = input.nextDouble();
        System.out.println("Please, enter the height of the rectangle in cm: ");
        double height = input.nextDouble();
        System.out.println("The area of the rectangle is: " + width * height + " cm2");
    }
}
