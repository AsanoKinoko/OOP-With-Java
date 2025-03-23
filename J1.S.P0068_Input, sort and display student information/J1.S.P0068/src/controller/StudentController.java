/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.StudentInputer;
import bo.StudentManager;
import java.util.List;
import model.Student;

/**
 *
 * @author DELL
 */
public class StudentController {
    private final StudentInputer studentInputer;
    private final StudentManager studentManager;
    
    public StudentController() {
        studentInputer = new StudentInputer();
        studentManager = new StudentManager();
    }
    
    /**
     * Execute the main program flow
     */
    public void execute() {
        // Function 1: Input data
        List<Student> students = studentInputer.inputStudents();
        
        // Function 2: Sort and display
        students = studentManager.sortStudent(students);
        studentManager.display(students);
    }
}
