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
    private static final Scanner in = new Scanner(System.in);
    
    public static double checkInputPositiveDouble(String message) {
        System.out.print(message);
        // Loop until user input correct
        while (true) {
            try {
                String input = in.nextLine().trim();
                String maxDouble = String.valueOf(Double.MAX_VALUE);
                if (input.length() > maxDouble.length() || 
                    (input.length() == maxDouble.length() && input.compareTo(maxDouble) >= 0)) {
                    System.err.println("Please input a number smaller than " + Double.MAX_VALUE);
                    System.out.print("Enter again: ");
                    continue;
                }
                double result = Double.parseDouble(input);
                if (result <= 0) {
                    System.err.println("Please input a positive number");
                    System.out.print("Enter again: ");
                    continue;
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input a valid number");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public static int checkInputPositiveInterger(String message) {
        System.out.print(message);
        // Loop until user input correct
        while (true) {
            try {
                String input = in.nextLine().trim();
                String maxInt = String.valueOf(Integer.MAX_VALUE);
                if (input.length() > maxInt.length() || 
                    (input.length() == maxInt.length() && input.compareTo(maxInt) >= 0)) {
                    System.err.println("Please input a number smaller than " + Integer.MAX_VALUE);
                    System.out.print("Enter again: ");
                    continue;
                }
                int result = Integer.parseInt(input);
                if (result <= 0) {
                    System.err.println("Please input a positive number");
                    System.out.print("Enter again: ");
                    continue;
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input a valid number");
                System.out.print("Enter again: ");
            }
        }
    }
}
