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
        BubbleSort bs = new BubbleSort(array);
        this.array = bs.getSortedArray(true);
    }
    
    private int binarySearch(int[] sortedArray, int key, boolean searchFirstIndex){
        int low = 0;
        int high = sortedArray.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Check if x is present at mid
            if (sortedArray[mid] == key) {
                result = mid;
                if (searchFirstIndex) {
                    high = mid - 1;  // Find the first position
                } else {
                    low = mid + 1;   // Find the last position
                }
            } else if (sortedArray[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        // If we reach here, then element was
        // Not present
        return result;
    }
    
    public void findAllOccurrences(int key) {
        int firstIndex = binarySearch(array, key, true);
        int lastIndex = binarySearch(array, key, false);
        if(firstIndex == -1){
            System.out.println("Not found!");
        } else {
            for(int i = firstIndex; i <= lastIndex; i++){
                System.out.println("Found " + key + " at index: " + i);
            }
        }
    }
}
