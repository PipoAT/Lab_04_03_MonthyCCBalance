// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // declare variables for initial balance, interest rate, and new balance
        double initialBalance = 5000.00;
        double interestRate = 17.00; // 17% interest rate per month
        double interestPayment = 0;
        double newBalance = 0;


        newBalance = initialBalance; // set up the initial balance

        // calculate the interest rate newBalance at the interest rate for the next 2 months
        for (int i = 1; i < 3; i++) {
            interestPayment = (newBalance * (interestRate / 100));
            newBalance = newBalance + interestPayment;

            // output the interest amount and new balance after each month
            System.out.println("Your interest amount (in USD) after " + i + " month(s) is: " + interestPayment);
            System.out.println("Your new balance (in USD) after " + i + " month(s) is: " + newBalance);

        }
    }
}