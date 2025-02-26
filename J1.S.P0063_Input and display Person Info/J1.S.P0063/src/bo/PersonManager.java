/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import model.Person;
import utils.ArrayUtils;

/**
 *
 * @author DELL
 */
public class PersonManager {
    private Person[] personArray;
    
    public PersonManager(Person[] personArray) {
        this.personArray = personArray;
    }
    
    private Person[] sortBySalary(boolean sortOnOriginArray, Person[] person, boolean isAscending){
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
        Person[] clonedArray = null;
        if(!sortOnOriginArray){
            clonedArray = ArrayUtils.cloneArray(person);
        }
        for (int i = 0; i < clonedArray.length; i++) {
            for (int j = 0; j < clonedArray.length - i - 1; j++) {
                if (isAscending ? (clonedArray[j].getSalary() > clonedArray[j + 1].getSalary()) : (clonedArray[j].getSalary() < clonedArray[j + 1].getSalary())){                    
                    Person temp = clonedArray[j];
                    clonedArray[j] = clonedArray[j + 1];
                    clonedArray[j + 1] = temp;              
                }                
            }
        }
        return clonedArray;
    }
    
    public Person[] getSortedArray(Person[] person, boolean isAscending) {
        return sortBySalary(false, person, isAscending);
    }
}
