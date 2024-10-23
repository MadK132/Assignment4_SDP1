public class NewOrder implements OrderState {
    @Override
    public void handleOrder() {
        System.out.println("Order placed. Awaiting payment.");
    }
}
