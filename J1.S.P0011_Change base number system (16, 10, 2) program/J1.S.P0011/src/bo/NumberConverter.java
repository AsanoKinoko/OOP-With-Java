/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

/**
 *
 * @author DELL
 */
public class NumberConverter {
    private static final char[] hexDigits = {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };
    
    private int convertBinaryToDec(String binary) {
        int decimal = 0;
        int length = binary.length();
        
        for (int i = 0; i < length; i++) {
            char digit = binary.charAt(length - 1 - i);
            if (digit == '1') {
                decimal += Math.pow(2, i);
            } else if (digit != '0') {
                throw new IllegalArgumentException("Invalid binary number");
            }
        }
        return decimal;
    }
    
    private String convertDecToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        int number = decimal;
        
        while (number > 0) {
            binary.insert(0, number % 2);
            number = number / 2;
        }
        
        return binary.toString();
    }
    
    private String convertDecToHex(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        
        StringBuilder hex = new StringBuilder();
        int number = decimal;
        
        while (number > 0) {
            int remainder = number % 16;
            char hexDigit;
            if (remainder < 10) {
                hexDigit = (char) ('0' + remainder);
            } else {
                hexDigit = (char) ('A' + remainder - 10);
            }
            hex.insert(0, hexDigit);
            number = number / 16;
        }
        
        return hex.toString();
    }
    
    private int getHexDigitValue(char hexChar) {
        for (int i = 0; i < hexDigits.length; i++) {
            if (hexDigits[i] == hexChar) {
                return i;
            }
        }
        throw new IllegalArgumentException("Invalid hexadecimal digit: " + hexChar);
    }
    
    private int convertHexToDec(String hex) {
        hex = hex.toUpperCase();
        int decimal = 0;
        
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            int digitValue = getHexDigitValue(hexChar);
            decimal = decimal * 16 + digitValue;
        }
        
        return decimal;
    }
    
    public String convertNumber(String input, int fromBase, int toBase) {
        // First convert to decimal as intermediate step
        int decimal;
        
        // Convert input to decimal based on source base
        switch (fromBase) {
            case 1: // Binary
                decimal = convertBinaryToDec(input);
                break;
            case 2: // Decimal
                decimal = Integer.parseInt(input);
                break;
            case 3: // Hexadecimal
                decimal = convertHexToDec(input);
                break;
            default:
                throw new IllegalArgumentException("Invalid source base");
        }
        
        // Convert decimal to target base
        switch (toBase) {
            case 1: // Binary
                return convertDecToBinary(decimal);
            case 2: // Decimal
                return String.valueOf(decimal);
            case 3: // Hexadecimal
                return convertDecToHex(decimal);
            default:
                throw new IllegalArgumentException("Invalid target base");
        }
    }
}