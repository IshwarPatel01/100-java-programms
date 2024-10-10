import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to choose the conversion type
        System.out.print("Type 'C' to convert Celsius to Fahrenheit, or 'F' to convert Fahrenheit to Celsius: ");
        String choice = scanner.nextLine().trim().toUpperCase();

        // Validate the choice
        if (!choice.equals("C") && !choice.equals("F")) {
            System.out.println("Invalid choice! Please enter 'C' for Celsius or 'F' for Fahrenheit.");
            scanner.close();
            return;
        }

        // Ask for temperature and validate input
        System.out.print("Enter the temperature value: ");
        String tempInput = scanner.nextLine();
        double temperature;

        try {
            temperature = Double.parseDouble(tempInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid temperature! Please enter a valid number.");
            scanner.close();
            return;
        }

        // Perform conversion based on the user's choice
        double result;
        if (choice.equals("C")) {
            result = celsiusToFahrenheit(temperature);
            System.out.printf("%.2f°C is equal to %.2f°F%n", temperature, result);
        } else {
            result = fahrenheitToCelsius(temperature);
            System.out.printf("%.2f°F is equal to %.2f°C%n", temperature, result);
        }

        // Close the scanner
        scanner.close();
    }
}



//import java.util.Scanner;
//
//public class TemperatureConverter {
//
//    // Method to convert Celsius to Fahrenheit
//    public static double celsiusToFahrenheit(double celsius) {
//        return (celsius * 9 / 5) + 32;
//    }
//
//    // Method to convert Fahrenheit to Celsius
//    public static double fahrenheitToCelsius(double fahrenheit) {
//        return (fahrenheit - 32) * 5 / 9;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) { // Loop to keep asking for valid input
//            // Ask user to choose the conversion type
//            System.out.print("Type 'C' to convert Celsius to Fahrenheit, or 'F' to convert Fahrenheit to Celsius (or 'Q' to quit): ");
//            String choice = scanner.nextLine().trim().toUpperCase();
//
//            // Check if the user wants to quit
//            if (choice.equals("Q")) {
//                System.out.println("Exiting the program. Goodbye!");
//                break; // Exit the loop
//            }
//
//            // Validate the choice
//            if (!choice.equals("C") && !choice.equals("F")) {
//                System.out.println("Invalid choice! Please enter 'C' for Celsius, 'F' for Fahrenheit, or 'Q' to quit.");
//                continue; // Ask for input again
//            }
//
//            double temperature = 0; // Initialize temperature variable
//            boolean validInput = false; // Flag to check if input is valid
//
//            // Loop to keep asking for a valid temperature input
//            while (!validInput) {
//                System.out.print("Enter the temperature value: ");
//                String tempInput = scanner.nextLine();
//
//                try {
//                    temperature = Double.parseDouble(tempInput);
//                    validInput = true; // Input is valid
//                } catch (NumberFormatException e) {
//                    System.out.println("Invalid temperature! Please enter a valid number.");
//                }
//            }
//
//            // Perform conversion based on the user's choice
//            double result;
//            if (choice.equals("C")) {
//                result = celsiusToFahrenheit(temperature);
//                System.out.printf("%.2f°C is equal to %.2f°F%n", temperature, result);
//            } else {
//                result = fahrenheitToCelsius(temperature);
//                System.out.printf("%.2f°F is equal to %.2f°C%n", temperature, result);
//            }
//        }
//
//        // Close the scanner
//        scanner.close();
//    }
//}
