public class ArrayObjects {
    public static void main(String[] args) {
        // Création de trois objets Car avec modèle et couleur
        Car car1 = new Car("Mustang", "Gray");
        Car car2 = new Car("Corvette", "Red");
        Car car3 = new Car("Charger", "Yellow");

        // Stocker les objets dans un tableau
        Car[] cars = {car1, car2, car3};

        // Boucle foreach pour parcourir chaque voiture et appeler la méthode drive()
        for (Car car : cars) {
            car.drive(); // Affiche un message indiquant que la voiture est en train d’être conduite
        }
    }
}

// Classe Car représentant un modèle de voiture
class Car {
    String model; // Modèle de la voiture
    String color; // Couleur de la voiture

    // Constructeur pour initialiser une voiture avec son modèle et sa couleur
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Méthode pour simuler la conduite de la voiture
    void drive() {
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}
