package stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John","Mark","David","Charlie");

        List<String> upperCaseNames = names.stream().map(String::toUpperCase).toList();
        System.out.println("List names: "+names);
        System.out.println("Upper Case names: " + upperCaseNames);
    }
}
