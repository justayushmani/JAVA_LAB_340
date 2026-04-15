public record Persons(String firstName, String lastName, int age) {
}

class Main {
    public static void main(String[] args) {
        Persons person = new Persons("John", "Doe", 30);
        System.out.println(person);
    }
}