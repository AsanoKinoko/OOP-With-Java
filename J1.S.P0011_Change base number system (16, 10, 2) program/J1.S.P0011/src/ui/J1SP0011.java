/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import bo.NumberConverter;
import utils.MenuUtils;
import utils.StringUtils;

/**
 *
 * @author DELL
 */
public class J1SP0011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] options = {
            "Convert From Binary.",
            "Convert From Decimal",
            "Convert From Hexa",
            "Exit"
        };
        
        NumberConverter numberConverter = new NumberConverter();
        
        while (true) {
            int choice = MenuUtils.getChoice("========= Number Convert program =========", options);
            int choiceConvert;
            String input; 
            try{
                switch (choice) {
                    case 1:
                        choiceConvert = MenuUtils.displayConvert("Binary", "Decimal", "Hexadecimal");
                        input = StringUtils.checkInputString("Enter binary number: ");
                        try {
                            String result = numberConverter.convertNumber(input, 1, choiceConvert + 1);
                            System.out.println("Result: " + result);
                        } catch (IllegalArgumentException e) {
                            System.err.println("Invalid binary number!");
                        }
                        break;
                    case 2:
                        choiceConvert = MenuUtils.displayConvert("Decimal", "Binary", "Hexadecimal");
                        input = StringUtils.checkInputString("Enter decimal number: ");
                        try {
                            String result = numberConverter.convertNumber(input, 2, choiceConvert == 1 ? 1 : 3);
                            System.out.println("Result: " + result);
                        } catch (NumberFormatException e) {
                            System.err.println("Invalid decimal number!");
                        }
                        break;
                    case 3:
                        choiceConvert = MenuUtils.displayConvert("Hexadecimal", "Binary", "Decimal");
                        input = StringUtils.checkInputString("Enter hexadecimal number: ");
                        try {
                            String result = numberConverter.convertNumber(input, 3, choiceConvert);
                            System.out.println("Result: " + result);
                        } catch (IllegalArgumentException e) {
                            System.err.println("Invalid hexadecimal number!");
                        }
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println();
        }
    }
}