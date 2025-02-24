/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.BillManager;
import java.util.ArrayList;
import java.util.List;
import model.Bill;
import model.Person;
import model.Wallet;
import utils.NumberUtils;

/**
 *
 * @author DELL
 */
public class BillController {    
    private List<Person> persons;
    private BillManager billManager;
    
    public PersonController() {
        this.persons = new ArrayList<>();
    }

    public Person createPerson() {
        Wallet wallet = new Wallet();
        List<Bill> bills = new ArrayList<>();
        Person person = new Person(wallet, bills);
        this.billManager = new BillManager(person.getBills());
        persons.add(person);
        return person;
    }
    
    public void inputBills(Person person) {
        System.out.print("Input number of bill: ");
        int size = NumberUtils.inputPositiveInterger();
        for (int i = 0; i < size; i++) {
            System.out.print("Input value of bill " + (i + 1) + ": ");
            int amount = NumberUtils.inputPositiveInterger();
            person.addBill(new Bill(amount));
        }
    }

    //Get amount that user input
    public void inputWallet(Person person) {
        System.out.print("Input value of wallet: ");
        int balance = NumberUtils.inputPositiveInterger();
        person.getWallet().setBalance(balance);
    }

    public int calculateTotal() {
        return billManager.calcTotal();
    }
    
    public boolean canPay(Person person) {
        int total = calculateTotal();
        return billManager.payMoney(total, person.getWallet().getBalance());
    }
}
