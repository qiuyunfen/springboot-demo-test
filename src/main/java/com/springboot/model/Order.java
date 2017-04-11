package com.springboot.model;

import java.util.List;

public class Order {
    private int orderId;
    private List<CartItemPrice> cartItemPrices;
    private double sum;
    private double save;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<CartItemPrice> getCartItemPrices() {
        return cartItemPrices;
    }

    public void setCartItemPrices(List<CartItemPrice> cartItemPrices) {
        this.cartItemPrices = cartItemPrices;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getSave() {
        return save;
    }

    public void setSave(double save) {
        this.save = save;
    }

    public Order(int orderId, List<CartItemPrice> cartItemPrice, double sum, double save) {
        this.orderId = orderId;
        this.cartItemPrices = cartItemPrice;
        this.sum = sum;
        this.save = save;
    }
}
