package creationalPatterns.factory;

public class PaymentFactory {
    public static Payment getPaymentMethod(String type) {
        if (type.equalsIgnoreCase("CreditCard")) {
            return new CreditCardPayment();
        }
        else if (type.equalsIgnoreCase("PayPal")) {
            return new PayPalPayment();
        }
        else if (type.equalsIgnoreCase("Stripe")) {
            return new StripePayment();
        }
        else if (type.equalsIgnoreCase("UPI")) {
            return new UpiPayment();
        }
        return null;
    }
}