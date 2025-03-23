/*Derick Waugh
 * 3/23/2025
 * Mod 1 - Inrto and Elementary Programming
 */
import java.util.Scanner;

public class WaterTempCalc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //A little overview of what this program does
        System.out.println("This simple calculation will show how how enery is needed to heat water from one temperature to a higher temperature.");
        System.out.println("Water will be measured in kilograms and temperature is measured in Celsius");
        System.out.println("You will enter the data for water weight (kg), initial/starting temperature (Celsius) and final temperature (Celsius)");

        //A reference section for hopfully easier understanding
        System.out.println("For reference:");
        System.out.println("A US gallon of water weighs 3.785kg");
        System.out.println("Average tap water temperature is 10-15 Celsius");
        System.out.println("Boiling point temperature for water is 100 Celsius");

        //Questionaire
        System.out.print("Please enter the amount of water in kilograms: ");
        double waterMass = scanner.nextDouble();

        System.out.print("Enter the initial temperature of the water in Celsius: ");
        double initialTemperature = scanner.nextDouble();

        System.out.print("Enter the final temperature of the water in Celsius: ");
        double finalTemperature = scanner.nextDouble();

        // energy calculator for energy to heat the water
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        //result
        System.out.printf("The energy needed to heat the water is: %.2f Joules of energy", energy);
    }
}
