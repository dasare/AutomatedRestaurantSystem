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
public class Tab {

    private Aggregator agg;
    private final Menu menuItems;
    private final Orders orderItems;
    private TabItem[] tabItems = new TabItem[50];
    private int current;

    public Tab() {

        orderItems = agg.getOrders();
        menuItems = agg.getMenu();
        tabItems = new TabItem[50];
        initTab();
    }

    public void getTab(){
        int bill = 0;
        int index = 0;
        while(index < orderItems.getNextOrder().getItemNum()){
            MenuItem m = menuItems.getNextItem();
            System.out.println(m.getItemNum() + " " + m.getDescription());
            bill+=m.getPrice();
        }
        
        System.out.println();
        System.out.println("Total cost: " + bill);
    }
    public Tab(Tab otherTab) {
        this();
        System.arraycopy(otherTab.tabItems, 0, tabItems, 0, tabItems.length);
    }

    public void addItem(TabItem item) {
        tabItems[findAvailIndex()] = item;
    }

    public void reset() {
        current = 0;
    }

    public boolean hasNext() {
        if (current == tabItems.length - 1) {
            return false;
        }

        return tabItems[current + 1] != null;
    }

    public TabItem getNextItem() {
        return tabItems[current++];
    }

    private void initTab() {
        for (int i = 0; i < tabItems.length; i++) {
            tabItems[i] = null;
        }
    }

    private int findAvailIndex() {
        int i = 0;
        while (tabItems[i] != null) {
            i++;
        }

        return i;
    }
}
