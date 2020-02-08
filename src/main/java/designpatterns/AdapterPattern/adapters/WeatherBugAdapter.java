package designpatterns.AdapterPattern.adapters;

import designpatterns.AdapterPattern.sources.WeatherBug;
import designpatterns.AdapterPattern.sources.WeatherSource;

public class WeatherBugAdapter implements WeatherSource {

    //probably should not code to concrete class, but ok for this example
    private WeatherBug weatherBug;

    public WeatherBugAdapter(WeatherBug weatherBug) {
        this.weatherBug = weatherBug;
    }

    @Override
    public String getTemperature() {
        return weatherBug.getFullTemp();
    }

    @Override
    public Integer getHigh() {
        return weatherBug.getDailyTemps().stream().max(Integer::compareTo).get();
    }

    @Override
    public Integer getLow() {
        return weatherBug.getDailyTemps().stream().min(Integer::compareTo).get();
    }

    @Override
    public String toString() {
        return weatherBug.toString();
    }
}
