import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CharWriteExample {

    // public static void main(String[] args) {
    //     String data = "Hello, this is a character stream example!";
    //     try (FileWriter fw = new FileWriter("CHARFILE.txt")) {
    //         fw.write(data);
    //         System.out.println("Data has been written to CHARFILE.txt");
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }

    public static void main(String[] args) {
        
        try{
            FileReader fr = new FileReader("CHARFILE.txt");

            int data;
            while((data = fr.read()) != -1){
                System.out.print((char) data);
            }
            fr.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
