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
        // If the table not contains value in only n, calculate and add
        if (index >= fiboMemo.size()) {
            int result = fibonacciMemoization(index - 1) + fibonacciMemoization(index - 2);
            fiboMemo.add(result);
        }
        // Return the value stored in memory
        return fiboMemo.get(index);
    }

    public void displayFibonacciArray(int n) {
        // Delete the old array (if any) before creating a new one
        fiboMemo.clear();
        // Initialize base value
        fiboMemo.add(0); // F(0) = 0
        fiboMemo.add(1); // F(1) = 1
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciMemoization(i));
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
    } 
}
