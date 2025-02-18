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
public class BubbleSort {
    private int[] array;
    
    public BubbleSort(int[] array) {
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
}