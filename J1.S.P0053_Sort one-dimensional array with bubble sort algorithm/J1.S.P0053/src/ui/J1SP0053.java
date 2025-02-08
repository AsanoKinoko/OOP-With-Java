/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import bo.BubbleSort;
import controller.ArrayController;
import utils.ArrayUtils;
import utils.MenuUtils;

/**
 *
 * @author DELL
 */
public class J1SP0053 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] options = {
            "Input Element",
            "Sort Ascending",
            "Sort Descending",
            "Exit"
        };
        int[] arrayNeedSort = new int[0];
        BubbleSort bs = new BubbleSort(arrayNeedSort);
        
        while (true) {
            int choice = MenuUtils.getChoice("========= Bubble Sort program =========", options);
            switch (choice) {
                case 1:
                    System.out.println("----- Input Element -----");
                    arrayNeedSort = ArrayController.inputValueOfArray();
                    bs = new BubbleSort(arrayNeedSort);
                    break;
                case 2:
                    if (arrayNeedSort.length == 0) {
                        System.err.println("Please input array first!");
                        break;
                    }
                    // Handle ascending sort
                    System.out.println("----- Ascending -----");
                    ArrayUtils.displayIntArray(bs.sort(true), true);
                    System.out.println();
                    break;
                case 3:
                    if (arrayNeedSort.length == 0) {
                        System.err.println("Please input array first!");
                        break;
                    }
                    // Handle descending sort
                    System.out.println("----- Descending -----");
                    ArrayUtils.displayIntArray(bs.sort(false), false);
                    System.out.println();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
    
}
