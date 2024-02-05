import Models.Customer;
import Models.Item;
import Models.ItemOrder;
import Models.Order;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Lokesh Shrestha", 54545);
        Item item1 = new Item("Burger", 900);
        Item item2 = new Item("Pizza", 900);

        ItemOrder itemOrder1 = new ItemOrder(item1,2);
        ItemOrder itemOrder2 = new ItemOrder(item2,1);
        List<ItemOrder> io1 = new ArrayList<>();
        io1.add(itemOrder1);
        io1.add(itemOrder2);
        List<ItemOrder> io2 = new ArrayList<>();
        io2.add(itemOrder1);
        Order order1 = new Order(1,io1);
        Order order2= new Order(2,io2);
        List<Order> c1order = new ArrayList<>();
        c1order.add(order1);
        c1order.add(order2);
        customer1.setOrderList(c1order);


        System.out.println("Orders");

        for(Order order: customer1.getOrderList()){
            System.out.println("OrderId: "+order.getOrderId());
            System.out.println("Name\t \t Quantity");
            for(ItemOrder itemOrder: order.getItemOrderList()){
                System.out.println(itemOrder.getItem().getName()+"\t \t"+itemOrder.getQuantity());

            }
        }
    }
}