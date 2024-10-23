public class StatisticsDisplay implements WeatherDisplay {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Statistics: Temperature=" + temperature + "F, Humidity=" + humidity + "%");
    }
}
