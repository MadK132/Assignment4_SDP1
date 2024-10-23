public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " with Credit Card.");
    }
}
