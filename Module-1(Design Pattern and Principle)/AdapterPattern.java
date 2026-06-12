interface PaymentProcessor {
    void processPayment(double amount);
}

class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("PayPal Payment Processed: Rs." + amount);
    }
}

class StripeGateway {
    public void payAmount(double amount) {
        System.out.println("Stripe Payment Processed: Rs." + amount);
    }
}

class PayPalAdapter implements PaymentProcessor {

    private PayPalGateway huan;

    public PayPalAdapter(PayPalGateway huan) {
        this.huan = huan;
    }
    @Override
    public void processPayment(double amount) {
        huan.makePayment(amount);
    }
}

class StripeAdapter implements PaymentProcessor {

    private StripeGateway huan;

    public StripeAdapter(StripeGateway huan) {
        this.huan = huan;
    }
    @Override
    public void processPayment(double amount) {
        huan.payAmount(amount);
    }
}

public class AdapterPattern {

    public static void main(String[] args) {

        PayPalGateway huanPayPal = new PayPalGateway();
        PaymentProcessor processor1 =
                new PayPalAdapter(huanPayPal);

        processor1.processPayment(5000);

        StripeGateway huanStripe = new StripeGateway();
        PaymentProcessor processor2 =
                new StripeAdapter(huanStripe);

        processor2.processPayment(2500);
    }
}