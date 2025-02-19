package creationalPatterns.abstractFactory;

public class AbstractFactory {
    public static void main(String[] args) {
        PaymentFactory domestic = FactoryProducer.getFactory("Domestic");
        PaymentFactory international = FactoryProducer.getFactory("International");

        Payment domesticCreditCard = domestic.createCreditCardPayment();
        Payment domesticUpi = domestic.createUpiOrPaypalPayment();

        Payment internationalCreditCard = international.createCreditCardPayment();
        Payment internationalPaypal = international.createUpiOrPaypalPayment();

        domesticCreditCard.processPayment(2876.45);
        domesticUpi.processPayment(43.89);
        internationalCreditCard.processPayment(5678.45);
        internationalPaypal.processPayment(2432.00);
    }
}