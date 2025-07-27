// Main class to demonstrate inheritance
public class Inheritance {
    public static void main(String[] args) {
        // Create instances of Cat and Dog
        Cat cat = new Cat();
        Dog dog = new Dog();

        // Call the inherited method from Animal class
        cat.eat(); // Outputs: The animal is eating
        dog.eat(); // Outputs: The animal is eating
    }
}

// Plant inherits from Organism (multilevel inheritance)
class Plant extends Organism {
    // Unique method to Plant
    void photosynthesize() {
        System.out.println("The plant absorbs sunlight");
    }
}

// Organism inherits from Animal (multilevel inheritance)
class Organism extends Animal {
    boolean isAlive;

    // Constructor initializes isAlive to true
    Organism() {
        isAlive = true;
    }
}

// Base class for all animals
class Animal {
    // Method that will be inherited by all subclasses
    void eat() {
        System.out.println("The animal is eating");
    }
}

// Dog inherits from Animal
class Dog extends Animal {
    int lives = 1; // Specific to Dog

    // Method unique to Dog
    void speak() {
        System.out.println("The dog goes *woof*");
    }
}

// Cat inherits from Animal
class Cat extends Animal {
    int lives = 9; // Specific to Cat

    // Method unique to Cat
    void speak() {
        System.out.println("The cat goes *meow*");
    }
}
