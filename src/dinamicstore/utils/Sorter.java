package dinamicstore.utils;
import dinamicstore.Product;

public class Sorter{

  //selection sort by price
  public static void selectionSortByPrice(Product[] products){
    for (int i = 0; i < products.length - 1; i++) { int minIdx = i;
             for (int j = i + 1; j < products.length; j++) { if (products[j].getPrice() < products[minIdx].getPrice()) {
                minIdx = j;
             }}
  product temp = products[i];
  products[i] = products[minIdx];
  products[minIdx] = temp;                                            
                }}

// Insertion Sort by Price
public static void insertionSortByPrice(Product[] products){
  for (int i = 1; i < products.length; i++) { product key = products[i]; int j = i - 1;
                        while (j >= 0 && products[j].getPrice() > key.getPrice())
                          { products[j + 1] = products[j]; j--;}
products [j + 1] = key;
                                            }
}
}                                            
                                            
                                        
