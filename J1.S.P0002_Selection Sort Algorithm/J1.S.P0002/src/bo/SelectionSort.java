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

    private int[] sort(boolean sortOnOriginArray, boolean isAscending){
        int[] copyArray = null;
        if(!sortOnOriginArray){
            copyArray = ArrayUtils.cloneArray(array);
        }
        int n = copyArray.length;
        for (int i = 0; i < n - 1; i++) {
            // Assume the current position holds the minimum element
            int min_idx = i;
            // Iterate through the unsorted portion to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (isAscending ? (copyArray[j] < copyArray[min_idx]) : (copyArray[j] > copyArray[min_idx])) {
                    // Update min_idx if a smaller element is found
                    min_idx = j;
                }   
            }
            // Move minimum element to its correct position
            ArrayUtils.swap(copyArray, i, min_idx);         
        }
        return copyArray;
    }
    
    public int[] getSortedArray(boolean isAscending) {
        return sort(false, isAscending);
    }
}
