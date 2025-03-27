/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import bo.Validator;
import utils.StringUtils;

/**
 *
 * @author DELL
 */
public class J1SP0064 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("====== Validate Program ======");
        
        String phone = inputPhone();
        String email = inputEmail();
        String date = inputDate();
        
        // Display the validated data
        System.out.println("\n====== Result ======");
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Date: " + date);
    }

    /**
     * Get and validate phone number
     * @return valid phone number
     */
    private static String inputPhone() {
        while (true) {
            String phone = StringUtils.checkInputString("Phone number: ");
            String error = Validator.checkPhone(phone);
            
            if (error.isEmpty()) {
                return phone;
            } else {
                System.err.println(error);
            }
        }
    }

    /**
     * Get and validate email
     * @return valid email
     */
    private static String inputEmail() {
        while (true) {
            String email = StringUtils.checkInputString("Email: ");
            String error = Validator.checkEmail(email);
            
            if (error.isEmpty()) {
                return email;
            } else {
                System.err.println(error);
            }
        }
    }
    
    /**
     * Get and validate date
     * @return valid date
     */
    private static String inputDate() {
        while (true) {
            String date = StringUtils.checkInputString("Date: ");
            String error = Validator.checkDate(date);
            
            if (error.isEmpty()) {
                return date;
            } else {
                System.err.println(error);
            }
        }
    }
}
