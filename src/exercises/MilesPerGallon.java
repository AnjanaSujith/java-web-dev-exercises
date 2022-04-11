package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the miles driven: ");
        double miles = input.nextDouble();
        System.out.println("Enter the amount of gas consumed in gallons: ");
        double gallons = input.nextDouble();
        double milesPerGallon = miles/gallons;
        System.out.println("The miles per gallon is : "+ milesPerGallon);

    }
}
