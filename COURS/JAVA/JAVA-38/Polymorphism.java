public class Polymorphism {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicule[] vehicules = {car, bike, boat};
        for (Vehicule vehicule : vehicules) {
            vehicule.go();
        }
    }
}

abstract class Vehicule {
    abstract void go();
}

class Car extends Vehicule {
    @Override
    void go() {
        System.out.println("You drive the car.");
    }
}

class Bike extends Vehicule {
    @Override
    void go() {
        System.out.println("You ride the bike.");
    }
}

class Boat extends Vehicule {
    @Override
    void go() {
        System.out.println("You sail the boat.");
    }
}
