import model.Product;
import model.StoreItem;
import utils.Sorter;
import utils.Searcher;
import exceptions.NegativePriceException;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        try {
            // Polymorphic list
            List<StoreItem> products = new ArrayList<>();
            products.add(new Product("Phone", 1200.0, 10));
            products.add(new Product("Laptop", 3000.0, 5));
            products.add(new Product("Charger", 150.0, 20));
            products.add(new Product("Headphones", 500.0, 15));
            products.add(new Product("Monitor", 1000.0, 8));

            // Original list
            System.out.println("Original List:");
            products.forEach(System.out::println);

            // Clone list to demonstrate both sorts independently
            List<StoreItem> productsForInsertion = new ArrayList<>(products);

            // Selection Sort with timing
            long startSel = System.nanoTime();
            Sorter.selectionSortByPrice(products);
            long endSel = System.nanoTime();

            System.out.println("\nAfter Selection Sort:");
            products.forEach(System.out::println);
            System.out.println("Selection Sort Time: " + (endSel - startSel) + " ns");

            // Insertion Sort with timing
            long startIns = System.nanoTime();
            Sorter.insertionSortByPrice(productsForInsertion);
            long endIns = System.nanoTime();

            System.out.println("\nAfter Insertion Sort:");
            productsForInsertion.forEach(System.out::println);
            System.out.println("Insertion Sort Time: " + (endIns - startIns) + " ns");

            // Linear Search (by name)
            String searchName = "Laptop";
            int indexLinear = Searcher.linearSearchByName(products, searchName);
            System.out.println("\nLinear Search - Name: " + searchName + " => Index: " + indexLinear);

            // Binary Search (by price) - on sorted list
            double searchPrice = 150.0;
            int indexBinary = Searcher.binarySearchByPrice(products, searchPrice);
            System.out.println("Binary Search - Price: $" + searchPrice + " => Index: " + indexBinary);

        } catch (NegativePriceException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
