package SystemInterface;

import Aggregator.*;
import Commands.Invoker;
import java.util.ArrayList;

/**
 *
 * @author dasare
 */
public class SystemInterface {

    private Invoker invoker;

    public SystemInterface(Invoker invoker) {
        this.invoker = invoker;
    }

    public String[] getMenu() {
//        Menu menu;
//        Invoker invoker = null;
//        
//        menu = invoker.getMenu();

        Menu menu;
        menu = invoker.getMenu();

        ArrayList<String> displayLines = new ArrayList<>();

        menu.reset();
        while (menu.hasNext()) {
            displayLines.add(menu.getNextItem().toString());
        }

        // convert ArrayList<String> to array of Strings
        String[] displayMenu = new String[displayLines.size()];
        return (String[]) displayLines.toArray(displayMenu);
    }

    public String[] getOrder() {
//        Orders order = Invoker.getOrder();
        String[] displayOrder = null;

        Orders order;
        order = invoker.getOrder();

        ArrayList<String> displayLines = new ArrayList<>();
        order.reset();

        while (order.hasNext()) {
            displayLines.add(order.getNextOrder().toString());

            displayOrder = new String[displayLines.size()];

        }
      
        return displayLines.toArray(displayOrder);
    }

    public String[] getTab() {
//        Tab tab = Invoker.getTab();
        Tab tab;
        tab = invoker.getTab();
        ArrayList<String> displayLines = new ArrayList<>();

        tab.reset();
        while (tab.hasNext()) {
            displayLines.add(tab.getNextItem().toString());
        }

        String[] displayTab = new String[displayLines.size()];
        return displayLines.toArray(displayTab);
    }

}
