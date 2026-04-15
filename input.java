import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // String name = scanner.nextLine();

        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();

        // System.out.print("Enter your Salary: ");
        // int salary = scanner.nextInt();

        // System.out.println("Hello, " + name + "! You are " + age + " years old.");
        // System.out.println("Your salary is: " + salary);
        // scanner.close();

        int n=scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()
        String name=scanner.nextLine();
        System.out.println(n);
        System.out.println(name);
        scanner.close();
    }

    
}
