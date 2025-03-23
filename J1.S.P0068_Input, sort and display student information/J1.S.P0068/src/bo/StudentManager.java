/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import java.util.Collections;
import java.util.List;
import model.Student;
import model.StudentComparator;

/**
 *
 * @author DELL
 */
public class StudentManager {
    /**
     * Sort students by name from A to Z
     * @param students List of students to be sorted
     * @return Sorted list of students
     */
    public List<Student> sortStudent(List<Student> students) {
        Collections.sort(students, new StudentComparator());
        return students;
    }
    
    /**
     * Display the list of students
     * @param students List of students to display
     */
    public void display(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("-------------Student " + (i + 1) + "-------------");
            System.out.println("Name: " + student.getName());
            System.out.println("Classes: " + student.getClasses());
            System.out.println("Mark: " + student.getMark());
        }
    }
}
