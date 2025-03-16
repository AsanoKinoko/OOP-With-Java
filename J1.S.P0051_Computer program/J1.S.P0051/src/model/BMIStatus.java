/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public enum BMIStatus {
    UNDER_STANDARD("Under-standard", 0, 19),
    STANDARD("Standard", 19, 25),
    OVERWEIGHT("Overweight", 25, 30),
    FAT("Fat - should lose weight", 30, 40),
    VERY_FAT("Very fat - should lose weight immediately", 40, Double.MAX_VALUE);

    private final String description;
    private final double minBMI;
    private final double maxBMI;

    BMIStatus(String description, double minBMI, double maxBMI) {
        this.description = description;
        this.minBMI = minBMI;
        this.maxBMI = maxBMI;
    }

    public String getDescription() {
        return description;
    }

    public static BMIStatus getStatus(double bmi) {
        for (BMIStatus status : values()) {
            if (bmi >= status.minBMI && bmi < status.maxBMI) {
                return status;
            }
        }
        return VERY_FAT;
    }
}
