import java.io.*;

public class excep {

    static void readFile() throws IOException {
        FileReader fr = new FileReader("text.txt");
        System.out.println("File opened successfully");
        fr.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}
