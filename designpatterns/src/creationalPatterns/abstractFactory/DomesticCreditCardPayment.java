package creationalPatterns.abstractFactory;

public class DomesticCreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Domestic Credit card Payment of $" + amount);
    }
}