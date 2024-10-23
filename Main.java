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
    }
}


