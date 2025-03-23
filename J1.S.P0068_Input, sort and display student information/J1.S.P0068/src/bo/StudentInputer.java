/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import java.util.ArrayList;
import java.util.List;
import model.Student;
import utils.NumberUtils;
import utils.StringUtils;

/**
 *
 * @author DELL
 */
public class StudentInputer {
    /**
     * Input student information from user
     * @return List of Student objects
     */
    public List<Student> inputStudents() {
        List<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Please input student information");
            
            // Input student details
            String name = StringUtils.checkInputString("Name: ");
            String classes = StringUtils.checkInputString("Classes: ");
            float mark = NumberUtils.inputPositiveFloat("Mark: ");
            
            // Create student object and add to list
            Student student = new Student(name, classes, mark);
            students.add(student);
            
            // Ask if user wants to continue
            boolean continueInput = StringUtils.checkInputYesNo("Do you want to enter more student information?(Y/N): ");
            if (!continueInput) {
                break;
            }
        }
        
        return students;
    }
}
