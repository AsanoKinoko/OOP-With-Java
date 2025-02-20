/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Fruit;
import java.util.ArrayList;
import utils.NumberUtils;
import utils.StringUtils;

/**
 *
 * @author DELL
 */
public class FruitManager {
    private ArrayList<Fruit> fruits;

    public FruitManager() {
        fruits = new ArrayList<>();
    }

    private int searchById(String fruitId) {
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).getFruitId().equalsIgnoreCase(fruitId)) {
                return i;
            }
        }
        return -1;
    }

    public Fruit getFruitById(String fruitId) {
        int position = searchById(fruitId);
        return position >= 0 ? fruits.get(position) : null;
    }

    public void createFruit() {
        while (true) {
            String fruitId = StringUtils.checkInputString("Enter fruit id: ");
            // Check if ID already exists
            if (getFruitById(fruitId) != null) {
                System.err.println("ID already exists. Please try another ID!");
                continue;
            }
            
            String fruitName = StringUtils.checkInputString("Enter fruit name: ");
            double price = NumberUtils.checkInputPositiveDouble("Enter price: ");
            int quantity = NumberUtils.checkInputPositiveInterger("Enter quantity: ");
            String origin = StringUtils.checkInputString("Enter origin: ");
            
            Fruit newFruit = new Fruit(fruitId, fruitName, price, quantity, origin);
            fruits.add(newFruit);
            
            // Ask the user if they want to continue
            if (!StringUtils.checkInputYesNo("Do you want to continue (Y/N)? ")) {
                break;
            }
        }
    }
}
