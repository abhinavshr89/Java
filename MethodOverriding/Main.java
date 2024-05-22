// Define the superclass Animal
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Define the subclass Dog that extends Animal
class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Main class to test method overriding
public class Main {
    public static void main(String[] args) {
        // Create an Animal object
        Animal myAnimal = new Animal();
        myAnimal.sound(); // Outputs: Animal makes a sound

        // Create a Dog object
        Dog myDog = new Dog();
        myDog.sound(); // Outputs: Dog barks

        // Polymorphism: Animal reference to a Dog object
        Animal myPet = new Dog();
        myPet.sound(); // Outputs: Dog barks
    }
}
