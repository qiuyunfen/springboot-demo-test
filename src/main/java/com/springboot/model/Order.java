package com.springboot.model;

public class Order {
    private CartItemPrice cartItemPrice;
    private double sum;
    private double save;

    public CartItemPrice getCartItemPrice() {
        return cartItemPrice;
    }

    public void setCartItemPrice(CartItemPrice cartItemPrice) {
        this.cartItemPrice = cartItemPrice;
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

    public Order(CartItemPrice cartItemPrice, double sum, double save) {
        this.cartItemPrice = cartItemPrice;
        this.sum = sum;
        this.save = save;
    }
}
