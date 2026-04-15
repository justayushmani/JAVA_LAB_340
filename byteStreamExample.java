import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class byteStreamExample {
    // public static void main(String[] args) {
    //     String data = "Hello, this is a byte stream example!";
    //     try (FileOutputStream fos = new FileOutputStream("BYTEFILE.txt")) {
    //         byte[] byteData = data.getBytes();
    //         fos.write(byteData);
    //         System.out.println("Data has been written to BYTEFILE.txt");
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }   
    
    
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("BYTEFILE.txt");

            int data;
            while((data = fis.read()) != -1){
                System.out.print((char) data);
            }
            fis.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
