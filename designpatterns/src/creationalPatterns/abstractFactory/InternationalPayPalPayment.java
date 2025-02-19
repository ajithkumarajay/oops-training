package creationalPatterns.abstractFactory;

public class InternationalPayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing International PayPal Payment of $" + amount);
    }
}
