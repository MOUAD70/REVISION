public class Interfaces {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee(); // Output: The rabbit is running away.
        hawk.hunt();   // Output: The hawk is hunting.
        fish.flee();   // Output: The fish is swimming away.
        fish.hunt();   // Output: The fish is hunting.
    }
}

// Interface for prey animals
interface Prey {
    void flee(); // Prey animals flee from predators
}

// Interface for predator animals
interface Predator {
    void hunt(); // Predators hunt other animals
}

// Rabbit is a prey animal
class Rabbit implements Prey {
    @Override
    public void flee() {
        System.out.println("The rabbit is running away.");
    }
}

// Fish is both prey and predator
class Fish implements Prey, Predator {
    @Override
    public void flee() {
        System.out.println("The fish is swimming away.");
    }

    @Override
    public void hunt() {
        System.out.println("The fish is hunting.");
    }
}

// Hawk is a predator
class Hawk implements Predator {
    @Override
    public void hunt() {
        System.out.println("The hawk is hunting.");
    }
}
