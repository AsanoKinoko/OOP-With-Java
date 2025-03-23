/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import controller.EquationController;
import utils.MenuUtils;
import java.util.List;
import utils.NumberUtils;

/**
 *
 * @author DELL
 */
public class J1SP0050 {
    private static final EquationController controller = new EquationController();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] options = {
            "Calculate Superlative Equation",
            "Calculate Quadratic Equation",
            "Exit"
        };
        
        while (true) {
            int choice = MenuUtils.getChoice("========= Equation program =========", options);
            try{
                switch (choice) {
                    case 1:
                        handleSuperlativeEquation();
                        break;
                    case 2:
                        handleQuadraticEquation();
                        break;
                    case 3:
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
    
    private static void handleSuperlativeEquation() {
        System.out.println("----- Calculate Superlative Equation -----");
        
        float a = NumberUtils.inputFloat("Enter A: ");
        float b = NumberUtils.inputFloat("Enter B: ");
        
        List<Float> solutions = controller.calculateEquation(a, b);
        controller.displayResults(solutions, a, b);
    }
    
    private static void handleQuadraticEquation() {
        System.out.println("----- Calculate Quadratic Equation ------");
        
        float a = NumberUtils.inputFloat("Enter A: ");
        float b = NumberUtils.inputFloat("Enter B: ");
        float c = NumberUtils.inputFloat("Enter C: ");
        
        List<Float> solutions = controller.calculateQuadraticEquation(a, b, c);
        controller.displayResults(solutions, a, b, c);
    }
}
