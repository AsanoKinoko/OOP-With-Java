/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

/**
 *
 * @author DELL
 */
public class NumberValidator {
    // public static Float checkin(String floatString) {
    //     try {
    //         return Float.parseFloat(floatString);
    //     } catch (NumberFormatException e) {
    //         return null;
    //     }
    // }
    
    public static boolean isOdd(float number) {
        return number % 2 != 0;
    }
    
    public static boolean isPerfectSquare(float number) {
        if (number < 0) return false;
        float sqrt = (float)Math.sqrt(number);
        float roundedSqrt = Math.round(sqrt);
        return (roundedSqrt * roundedSqrt == number);
    }
}
