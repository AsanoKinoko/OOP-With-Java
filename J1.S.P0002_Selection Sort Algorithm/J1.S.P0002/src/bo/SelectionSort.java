/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import utils.ArrayUtils;

/**
 *
 * @author DELL
 */
public class SelectionSort {
    private int[] array;
    
    public SelectionSort(int[] array) {
        this.array = array;
    }

    public int[] sort(boolean isAscending){ 
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Assume the current position holds the minimum element
            int min_idx = i;
            // Iterate through the unsorted portion to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (isAscending ? (array[j] < array[min_idx]) : (array[j] > array[min_idx])) {
                    // Update min_idx if a smaller element is found
                    min_idx = j;
                }   
            }
            // Move minimum element to its correct position
            ArrayUtils.swap(array, i, min_idx);         
        }
        return array;
    }
    
}
