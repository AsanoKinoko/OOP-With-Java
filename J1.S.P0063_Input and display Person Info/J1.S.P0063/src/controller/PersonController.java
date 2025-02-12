/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Person;
import utils.NumberUtils;
import utils.StringUtils;

/**
 *
 * @author DELL
 */
public class PersonController {
    public Person inputPersonInfo(String name, String address, String sSalary){
        System.out.println("Input Information of Person");
        System.out.print("Please input name: ");
        name = StringUtils.checkInputString();
        System.out.print("Please input address: ");
        address = StringUtils.checkInputString();
        System.out.print("Please input salary: ");
        sSalary = StringUtils.checkInputString();
        double salary = NumberUtils.inputPositiveSalary(sSalary);
        return new Person(name, address, salary);
    }
    
    public void displayPersonInfo(Person person){
        System.out.println("Name: " + person.getName());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Salary: " + person.getSalary());
    }
}
