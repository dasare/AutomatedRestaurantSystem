package Aggregator;

public class Orders {

    private OrderItem[] orderItems;
    private int current;

    public Orders() {
        orderItems = new OrderItem[10];
        initOrder();
    }

    public OrderItem getNextItem() {
        return orderItems[current++];
    }

    public Orders(Orders otherOrder) {   // copy constructor
        this();
        System.arraycopy(otherOrder.orderItems, 0, orderItems, 0, orderItems.length);

        //orderItems = otherOrder.orderItems;
        //this.orderItems = otherOrder.orderItems;
        //this.current = otherOrder.orderItems;
        //orderItems = otherOrder.orderItems;
    }

    public void addOrder(OrderItem item) {
        orderItems[findAvailIndex()] = item;
    }

    public void reset() {
        current = 0;
    }

    public boolean hasNext() {
        if (current == orderItems.length - 1) {
            return false;
        }

        return orderItems[current + 1] != null;
    }

    public OrderItem getNextOrder() {
        return orderItems[current++];
    }

    // --- private methods
    private void initOrder() {
        for (int i = 0; i < orderItems.length; i++) {
            orderItems[i] = null;
        }
    }

    private int findAvailIndex() {
        int i = 0;
        while (orderItems[i] != null) {
            i++;
        }

        return i;
    }

}
