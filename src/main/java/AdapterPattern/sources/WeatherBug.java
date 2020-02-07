package AdapterPattern.sources;

import java.util.ArrayList;

public class WeatherBug {
    private ArrayList<Integer> dailyTemps = new ArrayList<>();
    private Integer temp;
    private String degree;

    public WeatherBug(Integer temp, String degree) {
        this.temp = temp;
        this.degree = degree;
        dailyTemps.add(100);
        dailyTemps.add(99);
        dailyTemps.add(87);
    }

    public Integer getTemp() {
        return temp;
    }

    public String getDegree() {
        return degree;
    }

    public String getFullTemp(){
        return temp + " " + degree;
    }

    public ArrayList<Integer> getDailyTemps() {
        return dailyTemps;
    }

    @Override
    public String toString() {
        return "Weather Bug";
    }
}
