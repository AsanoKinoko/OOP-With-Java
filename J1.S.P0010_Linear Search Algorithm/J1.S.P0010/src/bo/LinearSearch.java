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

    private ArrayList<Integer> linearSearch(int key){
        ArrayList<Integer> arrayIndex = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                arrayIndex.add(i);
            }
        }
        return arrayIndex;
    }
    
    public ArrayList<Integer> search(int key) {
        return linearSearch(key);
    }
}
