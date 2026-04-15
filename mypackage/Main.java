import mypackage.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator obj = new Calculator();

        int result = obj.add(5, 3);

        System.out.println("Sum = " + result);
    }
}