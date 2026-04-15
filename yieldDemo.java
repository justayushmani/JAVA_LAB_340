public class yieldDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Yielding value: " + i);
            Thread.yield(); // Suggests the thread scheduler to give other threads a chance to execute
        }
    }
    
}
