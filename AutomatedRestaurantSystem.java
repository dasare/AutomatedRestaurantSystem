/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatedrestaurantsystem;
import java.util.*;
import SystemInterface.*;
import Aggregator.*;
import Commands.*;
import UserInterface.*;

/**
 *
 * @author dasare
 */
public class AutomatedRestaurantSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Aggregator agg = new Aggregator();
        Invoker invoker = new Invoker(agg);
        SystemInterface si = new SystemInterface(invoker);
        UI ui = new UI(si);
        ui.start();
        
        
        
        
//        menu = new String[20];
//        
//        menu = si.getMenu();
//        for (int i = 0; i < menu.length; i++){
//            System.out.println(menu[i]);
//        }
//        System.out.println("Select an option ");
//        System.out.println("Press 0 to quit");
//       int choice = in.nextInt();
//       while(choice != 0){
//           System.out.println("Select another Option");
//           System.out.println("Press 0 to quit");
//           
//           choice = in.nextInt();
//           
//       }
//       
//       String[] tab = new String[100];
//       tab = si.getTab();
//       for(int i = 0; i < tab.length; i++){
//           System.out.println(tab[i]);
//       }
//        System.out.println("Thanks for dining with us ");
    }

    
}
