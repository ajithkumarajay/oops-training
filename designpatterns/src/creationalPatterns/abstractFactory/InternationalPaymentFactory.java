package creationalPatterns.abstractFactory;

public class InternationalPaymentFactory implements PaymentFactory {
    @Override
    public Payment createCreditCardPayment() {
        return new InternationalCreditCardPayment();
    }

    @Override
    public Payment createUpiOrPaypalPayment() {
        return new InternationalPayPalPayment();
    }
}