package lambda.with_argument;

public class LambdaWithArgument {
    public static void main(String[] args) {

        // use return
        Operation operation = (a, b) -> {
            return a + b;
        };
        System.out.println("a + b = "+ operation.add(10,20));

        // no use return
        Operation operation1 = (a, b) -> (a + b);
        System.out.println("a + b = "+ operation1.add(100,200));
    }
}
