/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import bo.BinarySearch;
import utils.ArrayUtils;
import utils.NumberUtils;

/**
 *
 * @author DELL
 */
public class J1SP0006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter number of array:");
        int size = NumberUtils.inputPositiveInterger();
        int[] array = ArrayUtils.randomIntArray(size, -10, 10);
        System.out.println("Enter search value");
        int numberToFind = NumberUtils.inputInterger();
        BinarySearch bs = new BinarySearch(array);
        System.out.print("Sorted array: ");
        ArrayUtils.displayIntArray(bs.getSortedArray(true));
        System.out.println();
        int foundIndex = bs.search(numberToFind);
        if(foundIndex == -1){
            System.out.println("Not found!");
        } else {
            System.out.println("Found " + numberToFind + " at index: " + foundIndex);
        }
    }
    
}
