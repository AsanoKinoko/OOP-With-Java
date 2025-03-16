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
public class CalculatorValidator {
    public static Operator checkOperator(String operator) {
        if (operator == null || operator.trim().isEmpty()) {
            return null;
        }
        return Operator.fromSymbol(operator.trim());
    }
}
