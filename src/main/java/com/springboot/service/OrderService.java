package com.springboot.service;

import com.springboot.dao.OrderDao;
import com.springboot.model.Order;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.List;

public class OrderService {

    OrderDao  orderDao = new OrderDao();

    public int addOrder(Order order) {
        List<Order> orders = orderDao.loadAllOrder();
        return orderDao.addOrder(orders, order);
    }

    public int getOrderId() {
        List<Order> orders = orderDao.loadAllOrder();
        return orderDao.getOrderId(orders);
    }
}
