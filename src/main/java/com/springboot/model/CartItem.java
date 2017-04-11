package com.springboot.model;

public class CartItem {
    private Item item;
    private int count;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public CartItem(Item item, int count) {
        this.count = count;
        this.item = item;
    }
}
