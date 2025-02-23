/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class RecursiveFibonacci {
    private ArrayList<Integer> fiboMemo = new ArrayList<>();

    public int fibonacciMemoization(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index cannot be negative");
        }
        // If the table not contains value in only n, calculate and add
        if (index >= fiboMemo.size()) {
            if (index == 0) {
                fiboMemo.add(0);
            } else if (index == 1) {
                fiboMemo.add(1);
            } else {
                int result = fibonacciMemoization(index - 1) + fibonacciMemoization(index - 2);
                fiboMemo.add(result);
            }
        }
        // Return the value stored in memory
        return fiboMemo.get(index);
    }

    public void displayFibonacciArray(int n) {
        // Delete the old array (if any) before creating a new one
        fiboMemo.clear();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciMemoization(i));
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    } 
}
