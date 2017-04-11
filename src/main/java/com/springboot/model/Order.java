package com.springboot.model;

public class Order {
    private CartItemPrice[] cartItemPrices;
    private double sum;
    private double save;

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
