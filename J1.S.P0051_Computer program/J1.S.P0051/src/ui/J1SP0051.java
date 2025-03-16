/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import bo.CalculatorValidator;
import controller.CalculatorController;
import model.BMIStatus;
import model.Operator;
import utils.MenuUtils;
import utils.NumberUtils;
import utils.StringUtils;

/**
 *
 * @author DELL
 */
public class J1SP0051 {
    private static CalculatorController controller = new CalculatorController();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] options = {
            "Normal Calculator",
            "BMI Calculator",
            "Exit"
        };
        
        while (true) {
            int choice = MenuUtils.getChoice("========= Calculator Program =========", options);
            switch (choice) {
                case 1:
                    normalCalculator();
                    break;
                case 2:
                    bmiCalculator();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
    private static void normalCalculator() {
        controller.reset();
        System.out.println("\n----- Normal Calculator -----");
        
        while (true) {
            try {
                // If it's the first operation, get the first number
                if (controller.isFirstOperation()) {
                    double number = NumberUtils.inputPositiveDouble("Enter number: ");
                    controller.setMemory(number);
                }
                // Get operator
                while(true){
                    String operatorInput = StringUtils.checkInputString("Enter operator (+, -, *, /, ^, =): ");
                    Operator operator = CalculatorValidator.checkOperator(operatorInput);
                    if (operator == null) {
                        System.err.println("Please input (+, -, *, /, ^)");
                        continue;
                    }
                    if (operator == Operator.EQUAL) {
                        System.out.println("Result: " + controller.getMemory());
                        return;
                    }
                    // Get second number
                    double number = NumberUtils.inputPositiveDouble("Enter number: ");
                    // Calculate and store result
                    double result = controller.calculate(controller.getMemory(), operator, number);
                    controller.setMemory(result);
                    System.out.println("Memory: " + result);
                }
            }catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());   
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }

    private static void bmiCalculator() {
        System.out.println("\n----- BMI Calculator -----");
        
        while (true) {
            try {
                double weight = NumberUtils.inputPositiveDouble("Enter weight (kg): ");
                double height = NumberUtils.inputPositiveDouble("Enter height (cm): ");

                BMIStatus status = controller.calculateBMI(weight, height);
                System.out.printf("BMI Number: %.2f%n", controller.getBMIValue());
                System.out.println("BMI Status: " + status.getDescription());
                break;

            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}
