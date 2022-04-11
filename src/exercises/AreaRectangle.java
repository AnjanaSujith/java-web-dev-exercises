package exercises;
import java.util.Scanner;
public class AreaRectangle {
    public static void main(String[] args) {
        double length;
        double width;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle in cm: ");
        length = input.nextDouble();
        System.out.println("Enter the width of the rectangle in cm: ");
        width = input.nextDouble();
        double area = length * width;
        System.out.println("The Area of the ractangle is: " + area + " cm^2");
    }
}
