package Models;

import java.util.List;

public class Customer {
    String Name;
    int balance;

    List<Order> orderList;

    public Customer(String name, int balance) {
        this.Name = name;
        this.balance = balance;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}