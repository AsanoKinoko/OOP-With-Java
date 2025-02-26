/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Order {
    private String customerName;
    private ArrayList<OrderDetail> orderDetails;
    private double total;

    public Order(String customerName) {
        this.customerName = customerName;
        this.orderDetails = new ArrayList<>();
        this.total = 0;
    }

    public void addOrderDetail(OrderDetail detail) {
        // Check if the fruit already exists in the order
        for (OrderDetail existingDetail : orderDetails) {
            if (existingDetail.getFruit().getFruitId().equals(detail.getFruit().getFruitId())) {
                // Update quantity instead of adding new detail
                int newQuantity = existingDetail.getQuantity() + detail.getQuantity();
                double newAmount = detail.getFruit().getPrice() * newQuantity;
                total = total - existingDetail.getAmount() + newAmount;
                
                // Create new OrderDetail with updated quantity
                orderDetails.set(orderDetails.indexOf(existingDetail), 
                    new OrderDetail(detail.getFruit(), newQuantity));
                return;
            }
        }
        
        // If fruit doesn't exist in order, add new detail
        orderDetails.add(detail);
        total += detail.getAmount();
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public double getTotal() {
        return total;
    }
}
