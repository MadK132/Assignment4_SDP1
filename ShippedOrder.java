public class ShippedOrder implements OrderState {
    @Override
    public void handleOrder() {
        System.out.println("Order shipped. In transit.");
    }
}
