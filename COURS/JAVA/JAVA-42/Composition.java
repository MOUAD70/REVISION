// Main class to test Composition (a Car has-an Engine)
public class Composition {
    public static void main(String[] args) {
        // Create a new Car object with model "Mustang", year 2025, and engine type "V8"
        Car car = new Car("Mustang", 2025, "V8");

        // Print the car's model
        System.out.println(car.model);

        // Print the car's manufacturing year
        System.out.println(car.year);

        // Access the Engine object inside Car and print its type
        System.out.println(car.engine.type);
    }
}

// Car class represents a car and demonstrates composition (Car has-an Engine)
class Car {
    String model;      // Car model (e.g., Mustang)
    int year;          // Year of manufacture
    Engine engine;     // Car has an Engine object (composition)

    // Constructor initializes model, year, and creates an Engine object
    Car(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);  // Engine is composed inside Car
    }
}

// Engine class represents the engine of a car
class Engine {
    String type;  // Type of the engine (e.g., V8, Electric, etc.)

    // Constructor to initialize engine type
    Engine(String type) {
        this.type = type;
    }
}
