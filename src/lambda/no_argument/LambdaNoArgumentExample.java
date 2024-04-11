package lambda.no_argument;

public class LambdaNoArgumentExample {
    public static void main(String[] args) {
        String rectangle = "rectangle";

        Shape shape = () -> {
            System.out.println("Drawing " + rectangle);
        };

        shape.draw();
    }
}
