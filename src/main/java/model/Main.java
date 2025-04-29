import model.Product;
import utils.Sorter;
import utils.Searcher;
import exceptions.NegativePriceException;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        try {
            List<Product> products = new ArrayList<>();
            products.add(new Product("Phone", 1200, 10));
            products.add(new Product("Laptop", 3000, 5));
            products.add(new Product("Charger", 150, 20));
            products.add(new Product("Headphones", 500, 15));

            System.out.println("Original:");
            products.forEach(System.out::println);

            System.out.println("\nAfter Selection Sort by Price:");
            Sorter.selectionSortByPrice(products);
            products.forEach(System.out::println);

            System.out.println("\nLinear Search for 'Laptop': Index = " + Searcher.linearSearchByName(products, "Laptop"));
            System.out.println("Binary Search for price 150: Index = " + Searcher.binarySearchByPrice(products, 150));

        } catch (NegativePriceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
