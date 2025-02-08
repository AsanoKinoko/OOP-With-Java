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

    public int[] sort(boolean isAscending){ 
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (isAscending ? (array[j] > array[j + 1]) : (array[j] < array[j + 1])){                    
                    ArrayUtils.swap(array, j, j + 1);                    
                }                
            }
        }
        return array;
    }
}
