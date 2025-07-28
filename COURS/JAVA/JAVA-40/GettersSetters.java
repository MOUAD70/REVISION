// Main class to test the Car class
public class GettersSetters {
    public static void main(String[] args) {
        // Create a new Car object with model "Mustang", color "blue", and price 50000
        Car car = new Car("Mustang", "blue", 50000);

        // Print the car's model, color, and price using getter methods
        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());
    }
}

// Car class representing a car with model, color, and price
class Car {
    // The model is marked as final, so it cannot be changed after being set once
    private final String model;

    // Color and price are private, meaning they cannot be accessed directly from outside
    private String color;
    private double price;

    // Constructor to initialize a Car object with model, color, and price
    Car(String model, String color, double price) {
        this.model = model;  // Set model (cannot change later because it's final)
        this.color = color;
        setPrice(price);     // Use setter to apply validation when setting price
    }

    // Getter method for model (no setter since it's final/immutable)
    String getModel() {
        return this.model;
    }

    // Getter method for color
    String getColor() {
        return this.color;
    }

    // Setter method for color (allows changing the color after creation)
    void setColor(String color) {
        this.color = color;
    }

    // Getter method for price, returns the price as a formatted string
    String getPrice() {
        return "$" + this.price;
    }

    // Setter method for price with validation
    void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }
}
