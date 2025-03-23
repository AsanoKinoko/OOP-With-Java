/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Comparator;

/**
 *
 * @author DELL
 */
public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Sort students by name from A to Z
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
} 