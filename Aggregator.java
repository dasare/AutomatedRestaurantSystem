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
public final class Aggregator {
    
    
    private Menu menu;
    private Orders orders;
    private Tab tab;
    
    public Aggregator(){
        menu = new Menu();
        populateMenu();
        
        orders = new Orders();
        populateTab();
        

    }
    
    public Menu getMenu(){
        return menu;
    }
    
    public Orders getOrders(){
        return orders;
    }
    
    public Tab getTab(){
  
        return tab;
    }
    
    // --- private methods
    
    private void populateMenu(){
        menu.addItem(new MenuItem(1, "Roast Beef ", 12.50));
        menu.addItem(new MenuItem(2, "Turkey Dinner ", 9.50));
        menu.addItem(new MenuItem(3, "Steak ", 52.50));
        menu.addItem(new MenuItem(4, "Chicken ", 79.50));
        menu.addItem(new MenuItem(5, "Beef ", 512.50));
        menu.addItem(new MenuItem(6, "Turkey ", 39.50));
        
    }
    
    private void populateTab(){
        orders.addOrder(new OrderItem(1));
        orders.addOrder(new OrderItem(2));
        orders.addOrder(new OrderItem(3));
        orders.addOrder(new OrderItem(4));
        orders.addOrder(new OrderItem(5));
        orders.addOrder(new OrderItem(6));
    }
    
    public Orders submitOrder(){
        return null;
    }

    /**
     * @param orders the orders to set
     */
    public void setOrders(Orders orders) {
        this.orders = orders;
    }
}
