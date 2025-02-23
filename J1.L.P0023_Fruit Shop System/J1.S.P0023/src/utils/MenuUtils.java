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
    
    /**
     * Display menu and get user choice
     * @param title The title of menu
     * @param options The array of options
     * @return User's choice
     */
    public static int menu(String title, String[] options) {
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
}
