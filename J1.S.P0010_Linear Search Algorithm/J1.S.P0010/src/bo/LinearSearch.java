/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;


/**
 *
 * @author DELL
 */
public class LinearSearch {
    private int[] array;
    
    public LinearSearch(int[] array) {
        this.array = array;
    }

    private int linearSearch(int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
    
    public int search(int key) {
        return linearSearch(key);
    }
}
