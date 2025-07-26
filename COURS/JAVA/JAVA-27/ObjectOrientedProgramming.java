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
