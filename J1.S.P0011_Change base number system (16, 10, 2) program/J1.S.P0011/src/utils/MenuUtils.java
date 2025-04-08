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
public class MenuUtils {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static int getChoice(String title, String[] options) {
        System.out.println(title);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        
        while (true) {
            try {
                System.out.print("Please choice one option: ");
                int choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice >= 1 && choice <= options.length) {
                    return choice;
                } else {
                    System.err.println("Please choose from 1 to " + options.length);
                }
            } catch (NumberFormatException e) {
                System.err.println("Please enter a valid number!");
            }
        }
    }
    
    public static int displayConvert(String from, String toCase1, String toCase2) {
        System.out.println("1. Convert form " + from + " to " + toCase1);
        System.out.println("2. Convert form " + from + " to " + toCase2);
        while (true) {
            try {
                System.out.print("Please choice one option: ");
                int choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice >= 1 && choice <= 2) {
                    return choice;
                } else {
                    System.err.println("Please choose 1 or 2");
                }
            } catch (NumberFormatException e) {
                System.err.println("Please enter a valid number!");
            }
        }
    }
}
