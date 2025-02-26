/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Order;
import entity.OrderDetail;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DELL
 */
public class OrderManager {
    private HashMap<String, Order> orders; // customer name -> order

    public OrderManager() {
        this.orders = new HashMap<>();
    }

    public void addOrder(String customerName, Order order) {
        orders.put(customerName, order);
    }

    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders to display.");
            return;
        }

        for (Map.Entry<String, Order> entry : orders.entrySet()) {
            Order order = entry.getValue();
             System.out.println("\nCustomer: " + entry.getKey());
            System.out.printf("%-20s | %-8s | %-8s | %-8s\n", 
                    "Product", "Quantity", "Price", "Amount");
            System.out.println("------------------------------------------------");
            
            for (OrderDetail detail : order.getOrderDetails()) {
                System.out.printf("%-20s %-10d $%-9.2f $%-8.2f\n",
                        detail.getFruit().getFruitName(),
                        detail.getQuantity(),
                        detail.getFruit().getPrice(),
                        detail.getAmount());
            }
            System.out.printf("Total: $%.2f\n", order.getTotal());
        }
    }

    public Order getOrder(String customerName) {
        return orders.get(customerName);
    }
}
