package com.springboot.model;

public class CartItemPrice {
    private CartItem cartItem;
    private double sum;
    private double save;

    public CartItem getCartItem() {
        return cartItem;
    }

    public void setCartItem(CartItem cartItem) {
        this.cartItem = cartItem;
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

    public CartItemPrice(CartItem cartItem, double sum, double save) {
        this.cartItem = cartItem;
        this.sum = sum;
        this.save = save;
    }
}
