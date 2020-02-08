package designpatterns.AdapterPattern;

import designpatterns.AdapterPattern.adapters.WeatherBugAdapter;
import designpatterns.AdapterPattern.adapters.WeatherChannelAdapter;
import designpatterns.AdapterPattern.sources.WeatherBug;
import designpatterns.AdapterPattern.sources.WeatherChannel;
import designpatterns.AdapterPattern.sources.WeatherSource;
import designpatterns.ParentMain;

import java.util.ArrayList;
import java.util.List;

public class AdapterMain extends ParentMain {

    public AdapterMain(String patternName) {
        super(patternName);
    }

    public void execute() {
        //use interface to map common methods to specific methods of different implementation classes
        //Weather example - don't have to worry about what each weather service calls its methods or what TYPE it returns
        //use ADAPTER class to map maintain consistency - call same method and get same TYPE result no matter the service
        System.out.println("-------- ADAPTER ----------");
        WeatherBug weatherBug = new WeatherBug(100, "C");
        WeatherSource weatherBugAdapter = new WeatherBugAdapter(weatherBug);

        WeatherChannel weatherChannel = new WeatherChannel("56 F");
        WeatherSource weatherChannelAdapter = new WeatherChannelAdapter(weatherChannel);

        List<WeatherSource> weatherSources = new ArrayList<>();
        weatherSources.add(weatherBugAdapter);
        weatherSources.add(weatherChannelAdapter);

        //can CALL same method on ALL sources and will get same TYPE result you expect because of ADAPTER
        for (WeatherSource source : weatherSources) {
            System.out.println(" ---------- " + source.toString() + " ---------- ");
            System.out.println("Temp: " + source.getTemperature());
            System.out.println("High: " + source.getHigh());
            System.out.println("Low: " + source.getLow());

        }
    }
}
