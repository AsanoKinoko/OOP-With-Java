package ui;


import bo.InsertionSort;
import utils.ArrayUtils;
import utils.NumberUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author DELL
 */
public class J1SP0003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Please input length of the array: ");
        int arrayLength = NumberUtils.inputPositiveInterger();
        int array[] = ArrayUtils.randomIntArray(arrayLength, -100, 100);
        InsertionSort is = new InsertionSort(array);
        System.out.println("Original array:");
        ArrayUtils.displayIntArray(array);
        System.out.println();
        System.out.println("Ascending array:");
        ArrayUtils.displayIntArray(is.getSortedArray(true));
        System.out.println();
        System.out.println("Descending array:");
        ArrayUtils.displayIntArray(is.getSortedArray(false));
        System.out.println();
    }
    
}
