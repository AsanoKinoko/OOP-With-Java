/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import bo.QuickSort;
import utils.ArrayUtils;
import utils.NumberUtils;

/**
 *
 * @author DELL
 */
public class J1SP0004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Please input length of the array: ");
        int arrayLength = NumberUtils.inputPositiveInterger();
        int array[] = ArrayUtils.randomIntArray(arrayLength, -100, 100);
        QuickSort qs = new QuickSort(array);
        System.out.println("Original array:");
        ArrayUtils.displayIntArray(array);
        System.out.println();
        System.out.println("Ascending array:");
        ArrayUtils.displayIntArray(qs.getSortedArray(true));
        System.out.println();
        System.out.println("Descending array:");
        ArrayUtils.displayIntArray(qs.getSortedArray(false));
        System.out.println();
    }
    
}
