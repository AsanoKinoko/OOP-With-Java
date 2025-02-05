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
    public static double inputPositiveSalary(String input) {
        // Loop until user input correct
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                String maxDouble = String.valueOf(Double.MAX_VALUE);
                if (input.length() > maxDouble.length() || 
                    (input.length() == maxDouble.length() && input.compareTo(maxDouble) >= 0)) {
                    System.err.println("Please input a number smaller than " + Double.MAX_VALUE);
                    System.out.print("Please input salary: ");
                    input = in.nextLine().trim();
                    continue;
                }
                double result = Double.parseDouble(input);
                if (result <= 0) {
                    System.err.println("Salary is greater than zero");
                    System.out.print("Please input salary: ");
                    input = in.nextLine().trim();
                    continue;
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("You must input digidt.");
                System.out.print("Please input salary: ");
                input = in.nextLine().trim();
            }
        }
    }
}
