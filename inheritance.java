public class inheritance {

    // Base class
    static class Animal {
        String name;
        String color;
        int age;

        void display() {
            System.out.println("The colour of " + name + " is " + color);
            System.out.println("The age is " + age);
        }
    }

    // Derived class
    static class Dog extends Animal {
        void sound() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        Dog g = new Dog();
        g.name = "Dogesh";
        g.color = "Pink";
        g.age = 12;

        g.display();
        g.sound();
    }
}
