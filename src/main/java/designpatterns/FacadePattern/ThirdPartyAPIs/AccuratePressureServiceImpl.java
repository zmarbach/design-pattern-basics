package designpatterns.FacadePattern.ThirdPartyAPIs;

public class AccuratePressureServiceImpl implements AccuratePressureService {
    @Override
    public String getPressure() {
        System.out.println("Fetching data from " + this.getClass().getSimpleName());
        return "Pressure is HIGH";
    }
}
