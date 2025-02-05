package ui;

import bo.PersonSalaryManager;
import controller.PersonController;
import model.Person;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class J1SP0063 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        System.out.println("=====Management Person programer=====");
        for (int i = 0; i < 3; i++) {
            persons[i] = PersonController.inputPersonInfo("", "", "");
        }
        System.out.println();
        System.out.println("Information of Person you have entered:");
        PersonSalaryManager.sortBySalary(persons, true);
        for (int i = 0; i < 3; i++){
            PersonController.displayPersonInfo(persons[i]);
        }
    }
}
