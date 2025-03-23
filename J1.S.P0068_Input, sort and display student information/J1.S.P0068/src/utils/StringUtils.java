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
public class StringUtils {
    private static final Scanner SCANNER =  new Scanner(System.in);
    
    public static String checkInputString(String title) {
        System.out.print(title);
        // Loop until user input correct
        while (true) {
            String result = SCANNER.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }
    
    public static boolean checkInputYesNo(String message){
        System.out.print(message);
        while (true) {
            String input = SCANNER.nextLine().trim();
            if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")) {
                return input.equalsIgnoreCase("Y");
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
}
