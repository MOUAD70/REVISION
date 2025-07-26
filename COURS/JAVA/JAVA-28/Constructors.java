// Main class named Constructors
public class Constructors {
    public static void main(String[] args) {
        // Create a new Student object using the constructor with parameters
        Student student = new Student("MOUAD", 20, 3.4);

        // Print the student's name, age, and GPA to the console
        System.out.println(student.name); // Output: MOUAD
        System.out.println(student.age);  // Output: 20
        System.out.println(student.gpa);  // Output: 3.4
    }
}

// Definition of the Student class
class Student {
    // Fields (or attributes) of the Student
    String name;
    int age;
    double gpa;
    boolean isEnrolled; // Default value is false

    // Constructor: initializes name, age, and GPA when a Student object is created
    public Student(String name, int age, double gpa) {
        this.name = name; // Assign the name parameter to the class field
        this.age = age;   // Assign the age parameter to the class field
        this.gpa = gpa;   // Assign the gpa parameter to the class field
        // isEnrolled is not set here, so it remains false by default
    }
}
