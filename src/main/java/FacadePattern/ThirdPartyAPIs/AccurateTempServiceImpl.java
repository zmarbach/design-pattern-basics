package FacadePattern.ThirdPartyAPIs;

public class AccurateTempServiceImpl implements AccurateTempService {
    @Override
    public String getTemp() {
        System.out.println("Fetching data from " + this.getClass().toString());
        return "Temperature is 100 degrees C";
    }
}
