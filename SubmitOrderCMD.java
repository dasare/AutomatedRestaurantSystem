/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import Aggregator.*;
import java.util.*;

/**
 *
 * @author dasare
 */
public class SubmitOrderCMD implements Command {

    private Aggregator agg;
    public static boolean submitted = false;

    public SubmitOrderCMD(Aggregator agg) {
        this.agg = agg;

    }

    @Override
    public Object execute() {
        
        int s;
        Scanner in = new Scanner(System.in);
        agg.getMenu().toString();
        System.out.println("Place Order. Press 5 to exit");
        s = in.nextInt();
        Orders order = new Orders();
        agg.setOrders(order);
        while(s !=5){
            agg.getOrders().addOrder(new OrderItem(s));
            agg.getMenu().toString();
            System.out.println("Place Order");
            s = in.nextInt();
        }
        submitted = true;
        System.out.println("Order Submitted");
        return new Orders(agg.submitOrder());
        
    }
}
