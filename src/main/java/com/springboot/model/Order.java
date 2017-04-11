package com.springboot.model;

public class Order {
    private int orderId;
    private CartItemPrice[] cartItemPrices;
    private double sum;
    private double save;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public CartItemPrice[] getCartItemPrices() {
        return cartItemPrices;
    }

    public void setCartItemPrices(CartItemPrice[] cartItemPrices) {
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

    public Order(CartItemPrice[] cartItemPrice, double sum, double save) {
        this.cartItemPrices = cartItemPrice;
        this.sum = sum;
        this.save = save;
    }
}
