/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DateUtils {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static Date parseDate(String dateString) throws Exception {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            sdf.setLenient(false);
            return sdf.parse(dateString);
        } catch (ParseException e) {
            throw new Exception("Invalid date format. Date must be in format dd-MM-yyyy.");
        }
    }
    
    /**
     * Get a date input from the user in the format dd-MM-yyyy
     * @param message the prompt message
     * @return the validated date input
     */
    public static Date getDate(String message) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(false);
        Date date = null;
        while (date == null) {
            try {
                System.out.print(message);
                date = sdf.parse(scanner.nextLine().trim());
            } catch (ParseException e) {
                System.out.println("Invalid date format! Please use dd-MM-yyyy.");
            }
        }
        return date;
    }
    
    /**
     * Get a date input from the user in the format dd-MM-yyyy as a string
     * @param message the prompt message
     * @return the validated date input as a string
     */
    public static String getDateString(String message){
        String dateString;
        while (true) {
            try {
                System.out.print(message);
                dateString = scanner.nextLine().trim();
                parseDate(dateString);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return dateString;
    }
}
