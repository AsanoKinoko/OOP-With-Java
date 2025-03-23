/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.NumberValidator;
import bo.QuadraticEquation;
import bo.SuperlativeEquation;
import java.util.List;

/**
 *
 * @author DELL
 */
public class EquationController {
    public List<Float> calculateEquation(float a, float b) {
        SuperlativeEquation equation = new SuperlativeEquation(a, b);
        return equation.calculateEquation();
    }
    
    public List<Float> calculateQuadraticEquation(float a, float b, float c) {
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        return equation.calculateQuadraticEquation();
    }
    
    public boolean isOdd(float number) {
        return NumberValidator.isOdd(number);
    }
    
    public boolean isPerfectSquare(float number) {
        return NumberValidator.isPerfectSquare(number);
    }
    
    // public Float validateNumber(String input) {
    //     return NumberValidator.checkin(input);
    // }
    
    public void displayResults(List<Float> solutions, float... coefficients) {
        if (solutions == null) {
            System.out.println("No solution");
        } else if (solutions.isEmpty()) {
            System.out.println("Infinitely many solutions");
        } else {
            System.out.print("Solution(s): ");
            for (int i = 0; i < solutions.size(); i++) {
                System.out.printf("x%d = %.3f%n", i + 1, solutions.get(i));
            }
        }
        
        float[] allValues = new float[coefficients.length + (solutions != null ? solutions.size() : 0)];
        System.arraycopy(coefficients, 0, allValues, 0, coefficients.length);
        if (solutions != null && !solutions.isEmpty()) {
            for (int i = 0; i < solutions.size(); i++) {
                allValues[coefficients.length + i] = solutions.get(i);
            }
        }
        
        String oddNumbers = "Number is Odd:";
        String evenNumbers = "Number is Even:";
        String perfectSquares = "Number is Perfect Square:";
        for (float num :  allValues) {
            if (isOdd(num)) {
                oddNumbers += " " + num + ",";
            } else {
                evenNumbers += " " + num + ",";
            }
            
            if (isPerfectSquare(num)) {
                perfectSquares += " " + num + ",";
            }
        }
        // Remove the last comma and print the result
        if (!oddNumbers.equals("Number is Odd:")) {
            System.out.println(oddNumbers.substring(0, oddNumbers.length() - 1));
        }
    
        if (!evenNumbers.equals("Number is Even:")) {
            System.out.println(evenNumbers.substring(0, evenNumbers.length() - 1));
        }
    
        if (!perfectSquares.equals("Number is Perfect Square:")) {
            System.out.println(perfectSquares.substring(0, perfectSquares.length() - 1));
        }
    }
}
