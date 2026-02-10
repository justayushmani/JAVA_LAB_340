public class Hieriarchical {
    static class Animal {
        String name;
        String color;
        int age;

        void display() {
            System.out.println("The colour of " + name + " is " + color);
            System.out.println("The age is " + age);
        }
    }

    static class Dog extends Animal {
        void sound() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {
        void sound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        Dog g = new Dog();
        g.name = "Dogesh";
        g.color = "Pink";
        g.age = 12;

        Cat c = new Cat();
        c.name = "Catty";
        c.color = "White";
        c.age = 5;

        g.display();
        g.sound();

        c.display();
        c.sound();
    }
    
}
