public class hashMap{
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> hashMap = new java.util.HashMap<>();

        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Orange", 3);
        hashMap.put("Apple", 4); // Duplicate key, value will be updated

        Integer value = hashMap.get("Banana");
        System.out.println("Value for 'Banana': " + value);

        hashMap.remove("Orange");   
        System.out.println(hashMap.size()); 

        entrySetExample(hashMap){
            for (java.util.Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
        
        System.out.println("HashMap: " + hashMap);
    }

}