class Student {
    int id;
    String name;

    void display() {
        System.out.println("ID: " + id); 
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Alice";
        s1.display();

        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Bob";
        s2.display();
    }
}
