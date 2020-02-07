package AdapterPattern.sources;

public class WeatherChannel {
    private String tempWithDegree;
    private String high = "100";
    private String low = "32";

    public WeatherChannel(String tempWithDegree) {
        this.tempWithDegree = tempWithDegree;
    }

    public String getTempWithDegree() {
        return tempWithDegree;
    }


    public String getHigh() {
        return high;
    }

    public String getLow() {
        return low;
    }

    @Override
    public String toString() {
        return "Weather Channel";
    }
}
