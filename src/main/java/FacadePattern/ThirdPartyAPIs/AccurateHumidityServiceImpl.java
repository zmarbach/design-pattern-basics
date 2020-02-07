package FacadePattern.ThirdPartyAPIs;

public class AccurateHumidityServiceImpl implements AccurateHumidityService {
    @Override
    public String getHumidity() {
        System.out.println("Fetching data from " + this.getClass().toString());
        return "Humidity is 93";
    }
}
