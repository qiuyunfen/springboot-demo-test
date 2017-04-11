package com.springboot.model;

public class CartItemWithPromotion {
    private CartItem cartItem;
    private String promotionType;

    public CartItem getCartItem() {
        return cartItem;
    }

    public void setCartItem(CartItem cartItem) {
        this.cartItem = cartItem;
    }

    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    public CartItemWithPromotion(CartItem cartItem, String promotionType) {
        this.cartItem = cartItem;
        this.promotionType = promotionType;
    }
}
