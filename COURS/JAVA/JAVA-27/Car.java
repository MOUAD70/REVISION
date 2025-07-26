// This class defines a simple blueprint for a Car object
public class Car {

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
