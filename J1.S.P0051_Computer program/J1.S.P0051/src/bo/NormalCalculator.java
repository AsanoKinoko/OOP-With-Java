/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import model.Operator;

/**
 *
 * @author DELL
 */
public class NormalCalculator {
    private double memory = 0;
    private boolean isFirstOperation = true;

    public double calculate(double a, Operator operator, double b) {
        switch (operator) {
            case ADD:
                return a + b;
            case SUBTRACT:
                return a - b;
            case MULTIPLY:
                return a * b;
            case DIVIDE:
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return a / b;
            case EXPONENT:
                return Math.pow(a, b);
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double value) {
        this.memory = value;
        this.isFirstOperation = false;
    }

    public void reset() {
        this.memory = 0;
        this.isFirstOperation = true;
    }

    public boolean isFirstOperation() {
        return isFirstOperation;
    }
}
