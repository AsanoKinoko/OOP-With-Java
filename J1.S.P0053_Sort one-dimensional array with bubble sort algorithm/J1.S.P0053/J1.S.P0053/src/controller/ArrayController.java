/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import utils.NumberUtils;

/**
 *
 * @author DELL
 */
public class ArrayController {
    public int inputSizeOfArray() {
        System.out.println("Input Length Of Arrays");
        System.out.print("Enter number: ");
        int input = NumberUtils.inputPositiveInterger();
        return input;
    }
    
    public int[] inputValueOfArray() {
        int size = inputSizeOfArray();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = NumberUtils.inputInterger();
        }
        return array;
    }
}
