public class Base64Incoding {
    public static void main(String[] args) {
        String originalString = "bittu is a good boy";
        String encodedString = java.util.Base64.getEncoder().encodeToString(originalString.getBytes());
        System.out.println("Encoded String: " + encodedString);

        byte[] decodedBytes = java.util.Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded String: " + decodedString);
    }
    
}
  