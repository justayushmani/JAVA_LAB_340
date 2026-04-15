//Ayush mani tiwari (2400320100340)
public class Person {
    String name;
    int age;
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int studentId;
    void displayStudent() {
        System.out.println("Student ID: " + studentId);
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Rahul";
        s.age = 20;
        s.studentId = 101;
        s.displayPerson();   
        s.displayStudent();
    }
}
