/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import bo.BubbleSort;
import utils.ArrayUtils;
import utils.NumberUtils;
/**
 *
 * @author DELL
 */
public class J1SP0001 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Please input length of the array: ");
        int arrayLength = NumberUtils.inputPositiveInterger();
        int array[] = ArrayUtils.randomIntArray(arrayLength, -100, 100);
        BubbleSort bs = new BubbleSort(array);
        System.out.println("Original array:");
        ArrayUtils.displayIntArray(array);
        System.out.println();
        System.out.println("Ascending array:");
        ArrayUtils.displayIntArray(bs.getSortedArray(true));
        System.out.println();
        System.out.println("Descending array:");
        ArrayUtils.displayIntArray(bs.getSortedArray(false));
        System.out.println();
    }
}
