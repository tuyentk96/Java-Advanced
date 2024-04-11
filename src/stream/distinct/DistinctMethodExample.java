package stream.distinct;

import java.util.Arrays;
import java.util.List;

public class DistinctMethodExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John","David","Mark","David","Charlie","John");

        List<String> namesDistinct = names.stream().distinct().toList();

        System.out.println("List of distinct names: " + namesDistinct);

    }
}
