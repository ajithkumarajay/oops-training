package creationalPatterns.abstractFactory;

public interface PaymentFactory {
    Payment createCreditCardPayment();
    Payment createUpiOrPaypalPayment();
}
