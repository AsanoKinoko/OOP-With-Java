/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.BMICalculator;
import bo.NormalCalculator;
import model.BMIStatus;
import model.Operator;

/**
 *
 * @author DELL
 */
public class CalculatorController {
    private final NormalCalculator normalCalculator;
    private final BMICalculator bmiCalculator;

    public CalculatorController() {
        this.normalCalculator = new NormalCalculator();
        this.bmiCalculator = new BMICalculator();
    }

    public double calculate(double a, Operator operator, double b) {
        return normalCalculator.calculate(a, operator, b);
    }

    public BMIStatus calculateBMI(double weight, double height) {
        return bmiCalculator.calculateBMI(weight, height);
    }

    public void setMemory(double value) {
        normalCalculator.setMemory(value);
    }

    public double getMemory() {
        return normalCalculator.getMemory();
    }

    public boolean isFirstOperation() {
        return normalCalculator.isFirstOperation();
    }

    public void reset() {
        normalCalculator.reset();
    }

    public double getBMIValue() {
        return bmiCalculator.getBMIValue();
    }
}
