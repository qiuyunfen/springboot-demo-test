package com.springboot.dao;

import com.springboot.model.CartItemPrice;
import com.springboot.model.Item;
import com.springboot.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderDao {

    public List<Order> loadAllOrder() {
        List<Order> orders = new ArrayList<Order>();
        List<CartItemPrice> cartItems = new ArrayList<CartItemPrice>();
        cartItems.add(new CartItemPrice(new Item("ITEM000000", "可口可乐", "瓶", 3.00), 3, 6));
        orders.add(new Order(1, cartItems, 6, 3));
        return orders;
    }

    public int addOrder(List<Order> orders, Order order) {
        orders.add(order);
        return order.getOrderId();
    }

    public int getOrderId(List<Order> orders) {
        return orders.get(orders.size() - 1).getOrderId() + 1;
    }
}
