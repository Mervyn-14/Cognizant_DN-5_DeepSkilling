interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid Rs."+amount+" using Credit Card");
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid Rs."+amount+" using PayPal");
    }
}

class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void makePayment(double amount) {
        paymentStrategy.pay(amount);
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        PaymentContext creditCardPayment =new PaymentContext(new CreditCardPayment());
        creditCardPayment.makePayment(5000);

        PaymentContext payPalPayment = new PaymentContext(new PayPalPayment());
        payPalPayment.makePayment(3000);
    }
}