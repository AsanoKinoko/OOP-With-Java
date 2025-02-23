/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import bo.RecursiveFibonacci;
import utils.NumberUtils;

/**
 *
 * @author DELL
 */
public class J1SP0009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter the length of fibonacci array: ");
        int length = NumberUtils.inputPositiveInterger();
        System.out.println("The Fibonacci sequence consists of " + length + " elements: ");
        RecursiveFibonacci rf = new RecursiveFibonacci();
        rf.displayFibonacciArray(length);
    }
}
