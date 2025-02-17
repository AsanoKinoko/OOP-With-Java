/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import bo.LinearSearch;
import utils.ArrayUtils;
import utils.NumberUtils;

/**
 *
 * @author DELL
 */
public class J1SP0010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter number of array:");
        int size = NumberUtils.inputPositiveInterger();
        int[] array = ArrayUtils.randomIntArray(size, -10, 10);
        System.out.println("Enter search value");
        int numberToFind = NumberUtils.inputInterger();
        System.out.print("The array: ");
        ArrayUtils.displayIntArray(array);
        LinearSearch ls = new LinearSearch(array);
        System.out.println();
        int foundIndex = ls.search(numberToFind);
        if(foundIndex == -1){
            System.out.println("Not found!");
        } else {
            System.out.println("Found " + numberToFind + " at index: " + foundIndex);
        }        
    }
    
}
