// This class demonstrates basic Object-Oriented Programming by using a 'Car' class.
public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        // Create a new instance of the Car class
        Car car = new Car();

        // Start the car engine
        car.startEngine();

        // Print the status of the car engine (should be true)
        System.out.println(car.isRunning);

        // Stop the car engine
        car.stopEngine();

        // Print the status of the car engine (should be false)
        System.out.println(car.isRunning);
    }
}

// This class defines a simple blueprint for a Car object
class Car {

    // Fields (attributes) of the Car
    String make = "Ford";         // Brand of the car
    String model = "Mustang";     // Model name
    int year = 2025;              // Year of manufacture
    double price = 58000.99;      // Price of the car
    boolean isRunning = false;    // Indicates if the engine is running

    // Method to start the car engine
    void startEngine() {
        isRunning = true; // Set the engine state to 'running'
        System.out.println("You started the engine.");
    }

    // Method to stop the car engine
    void stopEngine() {
        isRunning = false; // Set the engine state to 'not running'
        System.out.println("You stopped the engine.");
    }
}
