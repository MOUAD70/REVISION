public class ToString {
    public static void main(String[] args) {
        // Creating a Car object with make, model, and year
        Car car = new Car("Ford", "Mustang", 2022);

        // Printing the object using toString() - it calls the overridden method
        System.out.println(car.toString());
        // Output: { make: Ford, model: Mustang, year: 2022 }
    }
}

// Car class definition
class Car {
    String make;
    String model;
    int year;

    // Constructor to initialize the car's attributes
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Overriding the toString() method to provide a custom string representation
    @Override
    public String toString() {
        return "{ make: " + this.make + ", model: " + this.model + ", year: " + this.year + "}";
    }
}
