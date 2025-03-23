/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class Student {
    private String name;
    private float mark;
    private String classes;
    
    public Student() {
    }
    
    public Student(String name, String classes, float mark) {
        this.name = name;
        this.classes = classes;
        this.mark = mark;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public float getMark() {
        return mark;
    }
    
    public void setMark(float mark) {
        this.mark = mark;
    }
    
    public String getClasses() {
        return classes;
    }
    
    public void setClasses(String classes) {
        this.classes = classes;
    }
}
