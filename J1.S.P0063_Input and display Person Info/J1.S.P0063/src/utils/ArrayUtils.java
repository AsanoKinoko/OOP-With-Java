/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import model.Person;

/**
 *
 * @author DELL
 */
public class ArrayUtils {
    public static Person[] cloneArray(Person[] original) {
        Person[] clone = new Person[original.length];
        for (int i = 0; i < original.length; i++) {
            clone[i] = original[i].clone();
        }
        return clone;
    }
}
