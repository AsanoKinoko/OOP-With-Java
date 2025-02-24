/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import bo.BillManager;
import controller.BillController;
import model.Person;

/**
 *
 * @author DELL
 */
public class J1SP0060 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("======= Shopping program ==========");
        PersonController personController = new PersonController();
        Person person = personController.createPerson();
        personController.inputBills(person);
        System.out.println();
        personController.inputWallet(person);

        int total = personController.calculateTotal();
        System.out.println("This is total of bill: " + total);
        System.out.println();
        if (personController.canPay(person)) {
            System.out.println("You can buy it");
        } else {
            System.out.println("You can't buy it.");
        }
    }
    
}
