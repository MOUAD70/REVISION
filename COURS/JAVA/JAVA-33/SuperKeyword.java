public class SuperKeyword {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("MOUAD", "MOUNJIB");

        // Creating a Student object which inherits from Person
        Student student = new Student("ILIAS", "AHAMMAM", 2.5);

        // Calling method to display full name from Person
        person.showName();

        // Calling overridden method to display full name from Student (inherited)
        student.showName();

        // Calling method to display student's GPA
        student.displayGpa();
    }
}

// Base class Person
class Person {
    String first;
    String last;

    // Constructor for Person
    Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    // Method to print full name
    void showName() {
        System.out.println("Full name: " + this.first + " " + this.last);
    }
}

// Derived class Student which inherits from Person
class Student extends Person {
    double gpa;

    // Constructor for Student
    Student(String first, String last, double gpa) {
        super(first, last); // Call to the superclass constructor (Person)
        this.gpa = gpa;
    }

    // Method to display the GPA of the student
    void displayGpa() {
        System.out.println(this.first + "'s GPA is " + this.gpa);
    }
}
