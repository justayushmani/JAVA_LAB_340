import java.util.List;
import java.util.ArrayList;

class variable {
    public static void main(String[] args) {
        var a = 5;
        var b = 10;
        var sum = a + b;
        System.out.println("The sum of a and b is: " + sum);

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Fruits: " + fruits);
    }
}