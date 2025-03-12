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
public class QuickSort {
    private int[] array;
    
    public QuickSort(int[] array) {
        this.array = array;
    }
    
    private int partition(int[] array, int startIndex, int endIndex, boolean isAsc) {
        int pivot = array[endIndex];
        int i = startIndex - 1;
        for (int j = startIndex; j < endIndex; j++) {
            if (isAsc ? array[j] < pivot : array[j] > pivot) {
                i++;
                ArrayUtils.swap(array, i, j);
            }
        }
        ArrayUtils.swap(array, i + 1, endIndex);
        return i + 1;
    }
    
    private void quickSort(int[] array, int startIndex, int endIndex, boolean isAsc) {
        if (startIndex < endIndex) {
            int partitionIndex = partition(array, startIndex, endIndex, isAsc);
            quickSort(array, startIndex, partitionIndex - 1, isAsc);
            quickSort(array, partitionIndex + 1, endIndex, isAsc);
        }
    }
    
    private int[] sort(boolean sortOnOriginArray, boolean isAscending){
        int[] copyArray = null;
        if(!sortOnOriginArray){
            copyArray = ArrayUtils.cloneArray(array);
        }
        quickSort(copyArray, 0, copyArray.length - 1, isAscending);
        return copyArray;
    }
    
    public int[] getSortedArray(boolean isAscending) {
        return sort(false, isAscending);
    }
}
