package creationalPatterns.abstractFactory;

public class FactoryProducer {
    public static PaymentFactory getFactory(String region) {
        if (region.equalsIgnoreCase("Domestic")) {
            return new DomesticPaymentFactory();
        }
        else if (region.equalsIgnoreCase("International")) {
            return new InternationalPaymentFactory();
        }
        return null;
    }
}