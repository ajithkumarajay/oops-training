package creationalPatterns.factory;

public class FactoryMethod {
    public static void main(String[] args) {
        Payment payment1 = PaymentFactory.getPaymentMethod("CreditCard");
        payment1.processPayment(321.55);

        Payment payment2 = PaymentFactory.getPaymentMethod("UPI");
        payment2.processPayment(734.75);
        
        Payment payment3 = PaymentFactory.getPaymentMethod("PayPal");
        payment3.processPayment(156.83);

        Payment payment4 = PaymentFactory.getPaymentMethod("Stripe");
        payment4.processPayment(74.09);
    }
}