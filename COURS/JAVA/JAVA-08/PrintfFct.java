public class PrintfFct {
   public static void main(String[] args) {

       // Declare variables of different types
       String name = "Spongebob";
       char firstLetter = 'S';
       int age = 30;
       double height = 60.5;
       boolean isEmployed = true;

       // Print a string using %s
       System.out.printf("Hello %s\n", name);

       // Print a character using %c
       System.out.printf("Your name starts with a %c\n", firstLetter);

       // Print an integer using %d
       System.out.printf("You are %d years old\n", age);

       // Print a floating-point number using %f (default 6 decimal places)
       System.out.printf("You are %f inches tall\n", height);

       // Print a boolean using %b
       System.out.printf("Employed: %b\n", isEmployed);

       // Print multiple values with multiple specifiers
       System.out.printf("%s is %d years old\n", name, age);

       // [.precision] - controls number of decimals displayed
       double price1 = 9.99;
       double price2 = 100.15;
       double price3 = -54.01;

       // Print doubles with 3 decimal places
       System.out.printf("%.3f\n", price1);
       System.out.printf("%.3f\n", price2);
       System.out.printf("%.3f\n", price3);

       // [flags] - special formatting options
       // + : always show plus or minus sign
       // , : add comma grouping for thousands
       // ( : put negative numbers in parentheses
       // space : add space for positive, minus for negative

       // Here printing without any flags (default formatting)
       System.out.printf("%f\n", price1);
       System.out.printf("%f\n", price2);
       System.out.printf("%f\n", price3);

       // [width] - controls minimum width of printed output

       // 0 : zero-padding (fill with zeros instead of spaces)
       // number : right-justify with spaces if output shorter than width
       // negative number : left-justify with spaces if output shorter than width

       int id1 = 1;
       int id2 = 23;
       int id3 = 456;
       int id4 = 7890;

       // Print integer ids padded with zeros to width 4
       System.out.printf("id: %04d\n", id1);
       System.out.printf("id: %04d\n", id2);
       System.out.printf("id: %04d\n", id3);
       System.out.printf("id: %04d\n", id4);
   }
}
