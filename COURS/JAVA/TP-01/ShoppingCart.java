import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total;

        System.out.print("Enter the name of the order: ");
        String order = scanner.nextLine();

        System.out.print("Enter the price of the order: ");
        double price = scanner.nextDouble();

        System.out.print("Enter the quantity you want: ");
        int quantity = scanner.nextInt();

        total = price * quantity;

        scanner.close();

        System.out.println("You have bought " + quantity + " " + order + "/s");
        System.out.println("Your total is $" + total);
    }
}
