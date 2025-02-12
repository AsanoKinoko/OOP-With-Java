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
public class InsertionSort {
    private int array[];
    
    public InsertionSort(int[] array) {
        this.array = array;
    }
    
    private int[] sort(boolean sortOnOriginArray, boolean isAscending){
        int[] copyArray = null;
        if(!sortOnOriginArray){
            copyArray = ArrayUtils.cloneArray(array);
        }
        int n = copyArray.length;
        for (int i = 1; i < n; ++i) {
            int key = copyArray[i];
            int j = i - 1;
            while (j >= 0 && (isAscending ? copyArray[j] > key : copyArray[j] < key)) {
                copyArray[j + 1] = copyArray[j];
                j = j - 1;
            }
            copyArray[j + 1] = key;
        }
        return copyArray;
    }
    
    public int[] getSortedArray(boolean isAscending) {
        return sort(false, isAscending);
    }
}
