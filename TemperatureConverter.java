import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display welcome message and instructions
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Choose the conversion direction:");
        System.out.println("1: Celsius to Fahrenheit");
        System.out.println("2: Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        
        int choice = scanner.nextInt();
        double inputTemperature, convertedTemperature;

        // Process the user's choice
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            inputTemperature = scanner.nextDouble();
            convertedTemperature = celsiusToFahrenheit(inputTemperature);
            System.out.println(inputTemperature + " °C is equal to " + convertedTemperature + " °F.");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            inputTemperature = scanner.nextDouble();
            convertedTemperature = fahrenheitToCelsius(inputTemperature);
            System.out.println(inputTemperature + " °F is equal to " + convertedTemperature + " °C.");
        } else {
            System.out.println("Invalid choice! Please run the program again and enter 1 or 2.");
        }
        
        System.out.println("Thank you for using the Temperature Converter!");
        scanner.close();
    }
}