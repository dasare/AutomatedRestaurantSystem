/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aggregator;

/**
 *
 * @author dasare
 */
public class MenuItem {

    private final int itemNum;
    private final String description;
    private final double price;

    public MenuItem(int itemNum, String description, double price) {
        this.itemNum = itemNum;
        this.description = description;
        this.price = price;
    }

    /**
     * @return the itemNum
     */
    public int getItemNum() {
        return itemNum;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return ("Item num is " + getItemNum() + ", description: " + getDescription() + "Price: " + " $" + getPrice());
    }
}
