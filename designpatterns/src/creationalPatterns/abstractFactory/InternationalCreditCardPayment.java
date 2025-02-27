package creationalPatterns.abstractFactory;

public class InternationalCreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing International Credit card Payment of $" + amount);
    }
}