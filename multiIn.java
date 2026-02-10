public class multiIn {
    
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

    static class breed extends Dog {
        String breedName;
        void displayBreed() {
            System.out.println("The breed of the dog is " + breedName);
        }
    }

    public static void main(String[] args) {
        breed g = new breed();
        g.name = "Dogesh";
        g.color = "Pink";
        g.age = 12;
        g.breedName = "Desi";

        g.display();
        g.sound();
        g.displayBreed();
    }
    
}
