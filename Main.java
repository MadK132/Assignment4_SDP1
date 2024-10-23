public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100);

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(200);

        cart.setPaymentStrategy(new CryptoPayment());
        cart.checkout(300);



        WeatherStation station = new WeatherStation();
        WeatherDisplay currentDisplay = new CurrentConditionsDisplay();
        WeatherDisplay statsDisplay = new StatisticsDisplay();

        station.addDisplay(currentDisplay);
        station.addDisplay(statsDisplay);

        station.setWeatherData(80, 65, 30.4f);
        station.setWeatherData(82, 70, 29.2f);


        TV tv = new TV();
        Light light = new Light();

        Command tvOn = new TurnTVOn(tv);
        Command dimLights = new DimLights(light);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(0, tvOn);
        remote.setCommand(1, dimLights);

        remote.pressButton(0);
        remote.pressButton(1);
        remote.pressUndo();


        Order order = new Order();

        order.processOrder();

        order.setState(new PaidOrder());
        order.processOrder();

        order.setState(new ShippedOrder());
        order.processOrder();
    }
}

