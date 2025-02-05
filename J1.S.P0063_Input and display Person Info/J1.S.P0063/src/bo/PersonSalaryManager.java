/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import model.Person;

/**
 *
 * @author DELL
 */
public class PersonSalaryManager {
    private Person[] personArray;
    
    public PersonSalaryManager(Person[] personArray) {
        this.personArray = personArray;
    }
    
    public static Person[] sortBySalary(Person[] person, boolean isAscending){
//        // Check for empty array
//        if (person.length == 0) {
//            throw new Exception("Can't Sort Person");
//        }
//        
//        // Check for null elements in array
//        for (Person p : person) {
//            if (p == null) {
//                throw new Exception("Can't Sort Person");
//            }
//        }

        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - i - 1; j++) {
                if (isAscending ? (person[j].getSalary() > person[j + 1].getSalary()) : (person[j].getSalary() < person[j + 1].getSalary())){                    
                    Person temp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = temp;              
                }                
            }
        }
        return person;
    }
}
