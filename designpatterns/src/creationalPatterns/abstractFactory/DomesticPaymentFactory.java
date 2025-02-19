package creationalPatterns.abstractFactory;

public class DomesticPaymentFactory implements PaymentFactory {
    @Override
    public Payment createCreditCardPayment() {
        return new DomesticCreditCardPayment();
    }

    @Override
    public Payment createUpiOrPaypalPayment() {
        return new DomesticUpiPayment();
    }
}
