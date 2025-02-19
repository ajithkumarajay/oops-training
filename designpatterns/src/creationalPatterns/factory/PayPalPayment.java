package creationalPatterns.factory;

public class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Paypal Payment of $" + amount);
    }
}
