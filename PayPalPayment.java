public class PayPalPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " via PayPal.");
    }
}
