package model;

public class Store {
    private int store_id;
    private String store_name;
    private Stock stock;

    // Constructor methods
    public Store() {
    }

    public Store(int store_id, String store_name, Stock stock) {
        this.store_id = store_id;
        this.store_name = store_name;
        this.stock = stock;
    }

    // Getters and Setters
    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
