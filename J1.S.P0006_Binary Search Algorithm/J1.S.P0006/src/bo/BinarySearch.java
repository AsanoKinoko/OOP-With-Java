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
public class BinarySearch {
    private int[] array;
    
    public BinarySearch(int[] array) {
        this.array = array;
    }
    
    private int[] sort(boolean sortOnOriginArray, boolean isAscending){
        int[] copyArray = null;
        if(!sortOnOriginArray){
            copyArray = ArrayUtils.cloneArray(array);
        }
        for (int i = 0; i < copyArray.length; i++) {
            for (int j = 0; j < copyArray.length - i - 1; j++) {
                if (isAscending ? (copyArray[j] > copyArray[j + 1]) : (copyArray[j] < copyArray[j + 1])){                    
                    ArrayUtils.swap(copyArray, j, j + 1);                    
                }                
            }
        }
        return copyArray;
    }
    
    public int[] getSortedArray(boolean isAscending) {
        return sort(false, isAscending);
    }
    
    private int binarySearch(int[] sortedArray, int key){
        int low = 0, high = sortedArray.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Check if x is present at mid
            if (sortedArray[mid] == key){
                return mid;
            } else if(sortedArray[mid] < key){ // If x greater, ignore left half
                low = mid + 1;
            } else { // If x is smaller, ignore right half
                high = mid - 1;
            }
        }
        // If we reach here, then element was
        // Not present
        return -1;
    }
    
    public int search(int key) {
        return binarySearch(getSortedArray(true), key);
    }
}
