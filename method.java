public class method {
    int mul(int a, int b) {
        return a * b;
    }

  
    public static void main(String[] args) {
        method obj = new method();
        int sum = obj.mul(10, 5);
        System.out.println("Multiplication: " + sum);
    }
    
}
