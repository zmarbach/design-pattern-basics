package FacadePattern.ThirdPartyAPIs;

public class AccuratePressureServiceImpl implements AccuratePressureService {
    @Override
    public String getPressure() {
        System.out.println("Fetching data from " + this.getClass().toString());
        return "Pressure is HIGH";
    }
}
