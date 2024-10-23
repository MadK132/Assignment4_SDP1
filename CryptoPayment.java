public class CryptoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " in Cryptocurrency.");
    }
}
