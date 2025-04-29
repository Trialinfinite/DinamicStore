import java.util.List;

public class SortUtil {

    // Selection Sort by Price
    public static void selectionSort(List<Product> products) {
        for (int i = 0; i < products.size() - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < products.size(); j++) {
                if (products.get(j).getPrice() < products.get(minIdx).getPrice()) {
                    minIdx = j;
                }
            }
            // Swap
            Product temp = products.get(i);
            products.set(i, products.get(minIdx));
            products.set(minIdx, temp);
        }
    }

    // Insertion Sort by Price
    public static void insertionSort(List<Product> products) {
        for (int i = 1; i < products.size(); i++) {
            Product key = products.get(i);
            int j = i - 1;

            while (j >= 0 && products.get(j).getPrice() > key.getPrice()) {
                products.set(j + 1, products.get(j));
                j--;
            }
            products.set(j + 1, key);
        }
    }
}
