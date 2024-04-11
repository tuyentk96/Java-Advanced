package lambda.with_foreach;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithForEachExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");

        list.forEach((element)->{
            System.out.println(element);
        });
    }
}
