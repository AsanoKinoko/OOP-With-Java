/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class SuperlativeEquation {
    private float a;
    private float b;
    
    public SuperlativeEquation(float a, float b) {
        this.a = a;
        this.b = b;
    }
    
    public List<Float> calculateEquation() {
        List<Float> solutions = new ArrayList<>();
        
        if (a == 0) {
            if (b == 0) {
                // Infinitely many solutions
                return solutions;
            } else {
                // No solution
                return null;
            }
        }
        
        // One solution: x = -b/a
        float x = -b / a;
        solutions.add(x);
        return solutions;
    }
    
    public float getA() {
        return a;
    }
    
    public float getB() {
        return b;
    }
}
