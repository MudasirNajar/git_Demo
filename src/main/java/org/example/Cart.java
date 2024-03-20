package org.example;

public class Cart {
    private Product product;

    public void add(Product product) {
        this.product = product;
    }

    public int total() {
        return product.getPrice();
    }
}
