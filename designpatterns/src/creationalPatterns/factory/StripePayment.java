package creationalPatterns.factory;

public class StripePayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Stripe Payment of $" + amount);
    }
}