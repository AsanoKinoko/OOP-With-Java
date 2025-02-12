/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author DELL
 */
public class Person {
    private Wallet wallet;
    private List<Bill> bills;

    public Person(Wallet wallet, List<Bill> bills) {
        this.wallet = wallet;
        this.bills = bills;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public List<Bill> getBills() {
        return bills;
    }
    
    public void addBill(Bill bill) {
        bills.add(bill);
    }
}
