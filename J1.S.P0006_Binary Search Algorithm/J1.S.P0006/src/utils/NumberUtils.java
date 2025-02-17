/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NumberUtils {
    public static int getRandomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
    
    public static int inputInterger() {
        // Loop until user input correct
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                String input = in.nextLine().trim();
                String maxInt = String.valueOf(Integer.MAX_VALUE);
                if (input.length() > maxInt.length() || 
                    (input.length() == maxInt.length() && input.compareTo(maxInt) >= 0)) {
                    System.err.println("Please input a number smaller than " + Integer.MAX_VALUE);
                    System.out.print("Enter again: ");
                    continue;
                }
                int result = Integer.parseInt(input);
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input a valid number");
                System.out.print("Enter again: ");
            }
        }
    }

    public static int inputPositiveInterger() {
        // Loop until user input correct
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
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
