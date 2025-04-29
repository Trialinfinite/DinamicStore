package model;

import util.NegativePriceException;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) throws NegativePriceException {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) throws NegativePriceException {
        if (price < 0) {
            throw new NegativePriceException("Price cannot be negative: " + price);
        }
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("Product: %s, Price: %.2f, Qty: %d", name, price, quantity);
    }
}
