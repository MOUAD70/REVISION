public class VariableScope {
    // Class-level (static) variable
    static int x = 3;

    public static void main(String[] args) {
        // Local variable in main method shadows the class-level x
        int x = 1;

        // Call the method doSomething
        doSomething();
    }

    static void doSomething() {
        // Local variable in this method shadows the class-level x again
        int x = 2;

        // Print the local variable x (value = 2)
        System.out.print(x);
    }
}
