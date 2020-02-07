package AdapterPattern;

public interface WeatherSource {
    String getTemperature();
    Integer getHigh();
    Integer getLow();
}
