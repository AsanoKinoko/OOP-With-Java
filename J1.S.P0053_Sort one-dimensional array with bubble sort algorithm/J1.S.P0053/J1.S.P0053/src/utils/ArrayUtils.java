/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author DELL
 */
public class ArrayUtils {
    public static void displayIntArray(int array[], boolean isAscending){
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
            if (i < array.length - 1){
                if(isAscending){
                    System.out.print("->");
                } else {
                    System.out.print("<-");
                }
            }
        }
    }
    
    public static void swap(int array[], int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static int[] cloneArray(int[] array){
        int[] ret = new int[array.length];
        for(int i = 0; i < array.length; i++){
            ret[i] = array[i];
        }
        return ret;
    }
}
