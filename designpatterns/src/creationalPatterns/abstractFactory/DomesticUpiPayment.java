package creationalPatterns.abstractFactory;

public class DomesticUpiPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Domestic Upi Payment of $" + amount);
    }
}