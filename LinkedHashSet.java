public class LinkedHashSet {
    public static void main(String[] args) {
        java.util.LinkedHashSet<String> linkedHashSet = new java.util.LinkedHashSet<>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Apple"); // Duplicate, will not be added

        System.out.println("LinkedHashSet: " + linkedHashSet);
    }                                                                           
    
}
