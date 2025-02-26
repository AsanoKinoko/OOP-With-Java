/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bo.FruitManager;
import bo.OrderManager;
import entity.Fruit;
import entity.Order;
import entity.OrderDetail;
import java.util.ArrayList;
import utils.NumberUtils;
import utils.StringUtils;

/**
 *
 * @author DELL
 */
public class FruitShopController {
    private FruitManager fruitManager;
    private OrderManager orderManager;

    public FruitShopController() {
        this.fruitManager = new FruitManager();
        this.orderManager = new OrderManager();
    }

    public void createFruit() {
        fruitManager.createFruit();
        fruitManager.displayFruitList();
    }

    public void viewOrders() {
        orderManager.displayOrders();
    }

    public void shopping() {
        if (fruitManager.getFruits().isEmpty()) {
            System.out.println("No fruits available for shopping.");
            return;
        }

        ArrayList<OrderDetail> tempOrderDetails = new ArrayList<>();
        String customerName = null;

        while (true) {
            fruitManager.displayFruitList();
            
            int choice = NumberUtils.checkInputPositiveInterger("Select item: ");
            Fruit selectedFruit = fruitManager.getFruitByIndex(choice - 1);
            
            if (selectedFruit == null) {
                System.err.println("Invalid item selection!");
                continue;
            }

            System.out.println("You selected: " + selectedFruit.getFruitName());
            int quantity = NumberUtils.checkInputPositiveInterger("Please input quantity: ");

            if (quantity > selectedFruit.getQuantity()) {
                System.err.println("Not enough quantity in stock!");
                continue;
            }

            tempOrderDetails.add(new OrderDetail(selectedFruit, quantity));

            if (StringUtils.checkInputYesNo("Do you want to order now (Y/N)? ")) {
                customerName = StringUtils.checkInputString("Input your name: ");
                // Check if customer already has an order
                Order existingOrder = orderManager.getOrder(customerName);
                Order order;
                
                if (existingOrder != null) {
                    // Add to existing order
                    order = existingOrder;
                } else {
                    // Create new order
                    order = new Order(customerName);
                }
                
                // Add all items to order
                for (OrderDetail detail : tempOrderDetails) {
                    order.addOrderDetail(detail);
                    fruitManager.updateFruitQuantity(
                        detail.getFruit().getFruitId(), 
                        detail.getQuantity()
                    );
                }
                
                // Store/update order in HashMap
                orderManager.addOrder(customerName, order);
                break;
            }
        }
    }
}
