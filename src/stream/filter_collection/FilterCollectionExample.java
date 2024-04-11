package stream.filter_collection;

import java.util.ArrayList;
import java.util.List;

public class FilterCollectionExample {
    public static void main(String[] args) {
        List<Product> listProduct = new ArrayList<>();
        listProduct.add(new Product("Apple", 12.99));
        listProduct.add(new Product("Banana", 15.99));
        listProduct.add(new Product("Grapes", 9.99));

        List<Product> filterProduct = listProduct.stream().filter(product -> product.getPrice()>10).toList();
        System.out.println("Filtered products: " );
        for (Product product : filterProduct) {
            System.out.println(product);
        }
    }
}
