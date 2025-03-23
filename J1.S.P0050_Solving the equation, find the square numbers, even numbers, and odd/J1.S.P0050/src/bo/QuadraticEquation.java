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
public class QuadraticEquation {
    private float a;
    private float b;
    private float c;
    
    public QuadraticEquation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public List<Float> calculateQuadraticEquation() {
        List<Float> solutions = new ArrayList<>();
        
        if (a == 0) {
            // If a = 0, it's a linear equation
            SuperlativeEquation linear = new SuperlativeEquation(b, c);
            return linear.calculateEquation();
        }
        
        float delta = b * b - 4 * a * c;
        
        if (delta < 0) {
            // No real solutions
            return null;
        } else if (delta == 0) {
            // One solution: x = -b/(2a)
            float x = -b / (2 * a);
            solutions.add(x);
            solutions.add(x);
        } else {
            // Two solutions: x = (-b ± √delta)/(2a)
            float x1 = (-b + (float)Math.sqrt(delta)) / (2 * a);
            float x2 = (-b - (float)Math.sqrt(delta)) / (2 * a);
            solutions.add(x1);
            solutions.add(x2);
        }
        
        return solutions;
    }
    
    public float getA() {
        return a;
    }
    
    public float getB() {
        return b;
    }
    
    public float getC() {
        return c;
    }
}
