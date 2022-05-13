import java.util.ArrayList;

public class TestOrders{
    public static void main(String[] args) {

        // item section!

        Item item1 = new Item("mocha", 3.25);
        Item item2 = new Item("cappuccino", 2.75);
        Item item3 = new Item("latte", 3.13);
        Item item4 = new Item("drip coffee", 2.25);

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Blake");
        Order order4 = new Order("Madi");
        Order order5 = new Order("Kiki");

        // adding items to the order:

        order1.addItem(item1);
        order4.addItem(item3);
        order2.setReady(true);

        // printing out results to our terminal

        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());
        System.out.println(order5.getStatusMessage());


        System.out.println(order1.getOrderTotal());
        System.out.println(order4.getOrderTotal());
        
        //displaying order

        order1.display();
        order3.display();
        order2.display();
        order4.display();
        order5.display();
    }
}