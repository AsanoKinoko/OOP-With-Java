/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import bo.BinarySearch;
import java.util.List;
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
        int[] array = ArrayUtils.randomIntArray(size, 2, 7);
        System.out.println("Enter search value");
        int numberToFind = NumberUtils.inputInterger();
        BinarySearch binarySearch = new BinarySearch(array);
        System.out.print("Sorted array: ");
        ArrayUtils.displayIntArray(binarySearch.getArray());
        System.out.println();
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
