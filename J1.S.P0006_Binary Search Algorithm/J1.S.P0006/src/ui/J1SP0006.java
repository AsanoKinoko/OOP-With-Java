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
        BubbleSort bs = new BubbleSort(array);
        int[] sortedArray = bs.getSortedArray(true);
        System.out.println("Enter search value");
        int numberToFind = NumberUtils.inputInterger();
        System.out.print("Sorted array: ");
        ArrayUtils.displayIntArray(sortedArray);
        System.out.println();
        BinarySearch binarySearch = new BinarySearch(sortedArray);
        List<Integer> occurrences = binarySearch.findAllOccurrences(numberToFind);
        if (occurrences.isEmpty()) {
            System.out.println("Not found!");
        } else {
            for (int index : occurrences) {
                System.out.println("Found " + numberToFind + " at index: " + index);
            }
        }
    }    
}
