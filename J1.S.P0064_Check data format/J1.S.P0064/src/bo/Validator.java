/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

/**
 *
 * @author DELL
 */
public class Validator {
    // Regex pattern for email validation
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    
    // SimpleDateFormat for date validation
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    
    static {
        DATE_FORMAT.setLenient(false); // Strict date validation
    }
    
    /**
     * Check if the phone number is valid
     * @param phone the phone number to validate
     * @return error message or empty string if valid
     */
    public static String checkPhone(String phone) {
        // Check if phone contains only digits
        if (!phone.matches("\\d+")) {
            return "Phone number must be number";
        }
        
        // Check phone length
        if (phone.length() != 10) {
            return "Phone number must be 10 digits";
        }
        
        return ""; // Valid phone number
    }
    
    /**
     * Check if the date is in valid format
     * @param date the date string to validate
     * @return error message or empty string if valid
     */
    public static String checkDate(String date) {
        try {
            DATE_FORMAT.parse(date);
            return ""; // Valid date
        } catch (ParseException e) {
            return "Date to correct format(dd/MM/yyyy)";
        }
    }
    
    /**
     * Check if the email is in valid format
     * @param email the email to validate
     * @return error message or empty string if valid
     */
    public static String checkEmail(String email) {
        if (!EMAIL_PATTERN.matcher(email).matches()) {
            return "Email must be correct format";
        }
        return ""; // Valid email
    }
}