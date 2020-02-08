package designpatterns.AdapterPattern.sources;

public interface WeatherSource {
    String getTemperature();
    Integer getHigh();
    Integer getLow();
}
