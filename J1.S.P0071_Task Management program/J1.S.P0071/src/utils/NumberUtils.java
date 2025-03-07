/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NumberUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputInterger(String title) {
        System.out.print(title);
        // Loop until user input correct
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                String maxInt = String.valueOf(Integer.MAX_VALUE);
                if (input.length() > maxInt.length() || 
                    (input.length() == maxInt.length() && input.compareTo(maxInt) >= 0)) {
                    System.err.println("Please input a number smaller than " + Integer.MAX_VALUE);
                    System.out.print("Enter Number: ");
                    continue;
                }
                int result = Integer.parseInt(input);
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number");
                System.out.print("Enter Number: ");
            }
        }
    }
    
    public static int inputPositiveInterger(String title) {
        System.out.print(title);
        // Loop until user input correct
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                String maxInt = String.valueOf(Integer.MAX_VALUE);
                if (input.length() > maxInt.length() || 
                    (input.length() == maxInt.length() && input.compareTo(maxInt) >= 0)) {
                    System.err.println("Please input a number smaller than " + Integer.MAX_VALUE);
                    System.out.print("Enter Number: ");
                    continue;
                }
                int result = Integer.parseInt(input);
                if (result <= 0) {
                    System.err.println("Please input number and number is greater than zero");
                    System.out.print("Enter Number: ");
                    continue;
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number and number is greater than zero");
                System.out.print("Enter Number: ");
            }
        }
    }

    public static double inputPositiveDouble(String title) {
        System.out.print(title);
        // Loop until user input correct
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                String maxDouble = String.valueOf(Double.MAX_VALUE);
                if (input.length() > maxDouble.length() || 
                    (input.length() == maxDouble.length() && input.compareTo(maxDouble) >= 0)) {
                    System.err.println("Please input a number smaller than " + Double.MAX_VALUE);
                    System.out.print("Enter Number: ");
                    continue;
                }
                double result = Double.parseDouble(input);
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number");
                System.out.print("Enter Number: ");
            }
        }
    }
}
