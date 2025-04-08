/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.NumberConverter;

/**
 *
 * @author DELL
 */
public class NumberConvertController {
    private final NumberConverter numberConverter;
    
    public NumberConvertController() {
        this.numberConverter = new NumberConverter();
    }
    
    public String convertNumber(String input, int fromBase, int toBase) {
        // First convert to decimal as intermediate step
        int decimal;
        
        // Convert input to decimal based on source base
        switch (fromBase) {
            case 1: // Binary
                decimal = numberConverter.convertBinaryToDec(input);
                break;
            case 2: // Decimal
                decimal = Integer.parseInt(input);
                break;
            case 3: // Hexadecimal
                decimal = numberConverter.convertHexToDec(input);
                break;
            default:
                throw new IllegalArgumentException("Invalid source base");
        }
        
        // Convert decimal to target base
        switch (toBase) {
            case 1: // Binary
                return numberConverter.convertDecToBinary(decimal);
            case 2: // Decimal
                return String.valueOf(decimal);
            case 3: // Hexadecimal
                return numberConverter.convertDecToHex(decimal);
            default:
                throw new IllegalArgumentException("Invalid target base");
        }
    }
}
