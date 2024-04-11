package stream.sorted;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortedMethodExample {
    public static void main(String[] args) {
        List<Product> listProduct = new ArrayList<>();
        listProduct.add(new Product("Apple", 12.99));
        listProduct.add(new Product("Banana", 15.99));
        listProduct.add(new Product("Grapes", 9.99));

        List<Product> listProductSorted = listProduct.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed()).toList();
        System.out.println("List of products sorted by price descending: ");
        listProductSorted.forEach(System.out::println);
    }
}
