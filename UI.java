/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import SystemInterface.*;
import java.util.*;

/**
 *
 * @author dasare
 */
public class UI {

    private SystemInterface si;
    Scanner in = new Scanner(System.in);

    public UI(SystemInterface si) {
        this.si = si;
    }

    public void start() {
        int x = 0;
        do {
            displayUserOptions();

            int option = in.nextInt();
            switch (option) {
                case 1:
                    displayMenu();
                   
                    si.getMenu();
                    
                    break;
                case 2:
                    submitOrder();
                    si.getOrder();
                    break;
                case 3:
                    displayTab();
                    si.getTab();
                    break;
                    
                case 4: si.getTab();
                    System.out.println("Thank you! Come Again!");
                    break;
                    
                default: System.out.println(" No option chosen ");
                break;

            }
        }while (x !=4);
    }

    private String[] displayMenu() {
        String[] displayLines;
        displayLines = si.getMenu();
        displayScreen(displayLines);
        return si.getMenu();

    }

    private String[] submitOrder() {
        String[] displayLines;
        displayLines = si.getOrder();
        displayScreen(displayLines);
        return si.getOrder();

    }

    private String[] displayTab() {
        String[] displayLines;
        displayLines = si.getTab();
        displayScreen(displayLines);
        return si.getTab();
    }

    private void displayScreen(String[] lines) {

        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }
        System.out.println();
    }

    private void displayUserOptions() {
        System.out.println("Select an option ");
        System.out.println("Press 0 to quit");
        System.out.println(" (1) Display Menu ");
        System.out.println(" (2) Submit Order ");
        System.out.println(" (3) Display Tab ");
    }

//    private void getOption() {
//
//    }
}
