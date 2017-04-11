package com.springboot.model;

public class CartItemPrice {
    private Item item;
    private int count;
    private double sum;

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public CartItemPrice(Item item, int count, double sum) {
        this.item = item;
        this.count = count;
        this.sum = sum;
    }
}
