package AdapterPattern.adapters;

import AdapterPattern.WeatherChannel;
import AdapterPattern.WeatherSource;

public class WeatherChannelAdapter implements WeatherSource {

    //probably should not code to concrete class, but ok for this example
    private WeatherChannel weatherChannel;

    public WeatherChannelAdapter(WeatherChannel weatherChannel) {
        this.weatherChannel = weatherChannel;
    }

    @Override
    public String getTemperature() {
        return weatherChannel.getTempWithDegree();
    }

    @Override
    public Integer getHigh() {
        return Integer.parseInt(weatherChannel.getHigh());
    }

    @Override
    public Integer getLow() {
        return Integer.parseInt(weatherChannel.getLow());
    }

    @Override
    public String toString() {
        return weatherChannel.toString();
    }
}
