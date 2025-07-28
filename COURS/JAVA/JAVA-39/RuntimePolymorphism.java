import java.util.Scanner;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.print("What animal do you prefer (1 => cat, 2 => dog): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Cat();
            animal.speak();
        } else if (choice == 2) {
            animal = new Dog();
            animal.speak();
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}

abstract class Animal {

    abstract void speak();
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("The cat goes meow.");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("The dog goes woof.");
    }
}
