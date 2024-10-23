import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<WeatherDisplay> displays = new ArrayList<>();
    private float temperature, humidity, pressure;

    public void addDisplay(WeatherDisplay display) {
        displays.add(display);
    }

    public void removeDisplay(WeatherDisplay display) {
        displays.remove(display);
    }

    public void notifyDisplays() {
        for (WeatherDisplay display : displays) {
            display.update(temperature, humidity, pressure);
        }
    }

    public void setWeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyDisplays();
    }
}