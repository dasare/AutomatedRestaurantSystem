package Aggregator;

/**
 *
 * @author dasare
 */
public class Menu {

    private MenuItem[] menuItems;
    private int current;
    Menu menu;

    public Menu() {
        menuItems = new MenuItem[10];
        initMenu();
    }
    public Menu(Menu otherMenu) {   // copy constructor
        this();
        System.arraycopy(otherMenu.menuItems, 0, menuItems, 0,
                menuItems.length);

        //menuItems = otherMenu.menuItems;
    }

    public void addItem(MenuItem item) {
        menuItems[findAvailIndex()] = item;
    }

    public void reset() {
        current = 0;
    }

    public boolean hasNext() {
        if (current == menuItems.length - 1) {
            return false;
        }

        return menuItems[current + 1] != null;
    }

    public MenuItem getNextItem() {
        return menuItems[current++];
    }

    // --- private methods
    private void initMenu() {
        for (int i = 0; i < menuItems.length; i++) {
            menuItems[i] = null;
        }
    }

    private int findAvailIndex() {
        int i = 0;
        while (menuItems[i] != null) {
            i++;
        }

        return i;
    }

//    public Menu() {
//        menu.addItem(new MenuItem(1, "Roast Beef ", 12.50));
//        menu.addItem(new MenuItem(2, "Turkey Dinner ", 9.50));
//        menu.addItem(new MenuItem(3, "Steak ", 52.50));
//        menu.addItem(new MenuItem(4, "Chicken ", 79.50));
//        menu.addItem(new MenuItem(5, "Beef ", 512.50));
//        menu.addItem(new MenuItem(6, "Turkey ", 39.50));
//
//    }

}
