/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import model.BMIStatus;

/**
 *
 * @author DELL
 */
public class BMICalculator {
    private double bmiValue;

    public BMIStatus calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        double heightInMeters = height / 100;
        double bmi = weight / (heightInMeters * heightInMeters);
        this.bmiValue = bmi;
        return BMIStatus.getStatus(bmi);
    }

    public double getBMIValue() {
        return bmiValue;
    }
}
