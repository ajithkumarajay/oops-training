package creationalPatterns.factory;

public class UpiPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of $" + amount);
    }
}