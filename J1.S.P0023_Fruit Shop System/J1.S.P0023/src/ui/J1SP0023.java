/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import utils.MenuUtils;

/**
 *
 * @author DELL
 */
public class J1SP0023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] options = {
            "Create Fruit",
            "View orders",
            "Shopping (for buyer)",
            "Exit"
        };
        
        
        while (true) {
            int choice = MenuUtils.menu("========= FRUIT SHOP SYSTEM =========", options);
            switch (choice) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
    
}
