package dinamicstore.utils;
import dinamicstore.Product;

public class SearchUtil{
  //Linear Search by Name
  public static int linearSearchByName(Product[] products, String name){
    for(int i = 0; i < products.length; i++){ if
      (products[i].getName().equalsIgnoreCase(name)){
        returns i;
      }}
    return -1;
  }}

//Binary Search by Price 
public static int binarySearchByPrice(Product[] products, double Price){
  int low = 0;
  int high = products.length - 1;

  while (low <= high){ int mid = (low + high)/2;
                      if (products[mid].getPrice()==price)return mid;
                      if (products[mid].getPrice() < price)
                        low = mid + 1;
                      else high = mid - 1;
                     }
  return - 1;
}
}
                           
