public class PaidOrder implements OrderState {
    @Override
    public void handleOrder() {
        System.out.println("Order paid. Ready for shipping.");
    }
}
