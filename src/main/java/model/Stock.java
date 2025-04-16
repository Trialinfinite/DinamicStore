/*
 * Stock Class:
 * Represents a stock item with an ID, name, count, and price.
 * Provides constructors to initialize the stock and methods to access and modify its attributes.
 *
 * Attributes:
 * - stock_id (int): Unique identifier for the stock item.
 * - stock_name (String): Name of the stock item.
 * - stock_count (int): Quantity of the stock item available.
 * - stock_price (double): Price per unit of the stock item.
 * 
 * @author 
 * @version 1.0
 */
package model;

public class Stock {
    private int stock_id;
    private String stock_name;
    private int stock_count;
    private double stock_price;

    // Constructor methods
    public Stock() {
    }

    public Stock(int stock_id, String stock_name, int stock_count, double stock_price) {
        this.stock_id = stock_id;
        this.stock_name = stock_name;
        this.stock_count = stock_count;
        this.stock_price = stock_price;
    }

    // Getters and Setters
    public int getStock_id() {
        return stock_id;
    }

    public void setStock_id(int stock_id) {
        this.stock_id = stock_id;
    }

    public String getStock_name() {
        return stock_name;
    }

    public void setStock_name(String stock_name) {
        this.stock_name = stock_name;
    }

    public int getStock_count() {
        return stock_count;
    }

    public void setStock_count(int stock_count) {
        this.stock_count = stock_count;
    }

    public double getStock_price() {
        return stock_price;
    }

    public void setStock_price(double stock_price) {
        this.stock_price = stock_price;
    }

//    @Override
//    public String toString() {
//        return "stock{" +
//                "stock_id=" + stock_id +
//                ", stock_name='" + stock_name + '\'' +
//                ", stock_count=" + stock_count +
//                ", stock_price=" + stock_price +
//                '}';
//    }
}
