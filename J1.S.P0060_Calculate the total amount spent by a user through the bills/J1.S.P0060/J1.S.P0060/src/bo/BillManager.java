/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import java.util.List;
import model.Bill;
import model.Person;

/**
 *
 * @author DELL
 */
public class BillManager {
    private List<Bill> bills;
    
    public BillManager(List<Bill> bills) {
        this.bills = bills;
    }
    
    public int calcTotal() {
        int total = 0;
        for (Bill bill : bills) {
            total += bill.getAmount();
        }
        return total;
    }
    
    public boolean payMoney(int total, int wallet) {
        return total <= wallet;
    }
}
