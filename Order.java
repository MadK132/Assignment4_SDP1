public class Order {
    private OrderState state;

    public Order() {
        state = new NewOrder();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void processOrder() {
        state.handleOrder();
    }
}
