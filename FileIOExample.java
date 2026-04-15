import java.io.*;
import java.util.Scanner;
public class FileIOExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter text: ");
            String data = sc.nextLine();
            FileWriter writer = new FileWriter("sample.txt");
            writer.write(data);
            writer.close();
            System.out.println("Data written to file.");
            FileReader reader = new FileReader("sample.txt");
            int ch;
            System.out.println("Reading from file:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
        sc.close();
    }
}