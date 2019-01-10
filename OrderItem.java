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
public class OrderItem {
    private int itemNum;
    
    public OrderItem(int itemNum)
    {
        this.itemNum = itemNum;
    }
    
    public int getItemNum(){
        return itemNum;
    }
    
    @Override
    public String toString(){
        return("Item num is "+ itemNum);
    }
}
