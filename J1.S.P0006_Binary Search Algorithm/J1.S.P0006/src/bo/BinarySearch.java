/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import java.util.ArrayList;
import java.util.List;
import utils.ArrayUtils;

/**
 *
 * @author DELL
 */
public class BinarySearch {
    private int[] array;
    
    public BinarySearch(int[] array) {
        BubbleSort bubbleSort = new BubbleSort(array);
        this.array = bubbleSort.getSortedArray(true);
    }
    
    private int binarySearch(int key, boolean searchFirstIndex){
        int low = 0;
        int high = array.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Check if x is present at mid
            if (array[mid] == key) {
                result = mid;
                if (searchFirstIndex) {
                    high = mid - 1;  // Find the first position
                } else {
                    low = mid + 1;   // Find the last position
                }
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        // If we reach here, then element was
        // Not present
        return result;
    }
    
    public List<Integer> findAllOccurrences(int key) {
        List<Integer> occurrences = new ArrayList<>();
        int firstIndex = binarySearch(key, true);
        if(firstIndex != -1){
            int lastIndex = binarySearch(key, false);
            for (int i = firstIndex; i <= lastIndex; i++) {
                occurrences.add(i);
            }
        }
        return occurrences;
    }
    
    public int[] getArray() {
        return array;
    }
}