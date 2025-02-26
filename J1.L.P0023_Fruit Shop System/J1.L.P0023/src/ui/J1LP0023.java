/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import controller.FruitShopController;
import utils.MenuUtils;

/**
 *
 * @author DELL
 */
public class J1LP0023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FruitShopController controller = new FruitShopController();
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
                    controller.createFruit();
                    break;
                case 2:
                    controller.viewOrders();
                    break;
                case 3:
                    controller.shopping();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
    
}
