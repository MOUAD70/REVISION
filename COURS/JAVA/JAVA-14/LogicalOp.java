public class LogicalOp {
    public static void main(String[] args) {
        // Initialize the temperature and weather condition
        double temp = 20;
        boolean isSunny = true;

        // Check if the temperature is between 0 and 30 inclusive AND it's sunny
        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is SUNNY outside");
        }
        // Check if the temperature is between 0 and 30 inclusive AND it's not sunny
        else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is CLOUDY outside");
        }
        // If the temperature is either above 30 or below 0
        else if (temp > 30 || temp < 0) {
            System.out.println("The weather is BAD");
        }
    }
}
