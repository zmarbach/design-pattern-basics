package FacadePattern.CustomAPI;

import FacadePattern.ThirdPartyAPIs.AccurateHumidityService;
import FacadePattern.ThirdPartyAPIs.AccuratePressureService;
import FacadePattern.ThirdPartyAPIs.AccurateTempService;

//use this to map methods to specific third party API that does each service best
public class CustomFacade implements CustomAPI{
    private AccurateHumidityService accurateHumidityService;
    private AccuratePressureService accuratePressureService;
    private AccurateTempService accurateTempService;

    public CustomFacade(AccurateHumidityService accurateHumidityService, AccuratePressureService accuratePressureService, AccurateTempService accurateTempService) {
        this.accurateHumidityService = accurateHumidityService;
        this.accuratePressureService = accuratePressureService;
        this.accurateTempService = accurateTempService;
    }

    @Override
    public String getTemp() {
        return accurateTempService.getTemp();
    }

    @Override
    public String getPressure() {
        return accuratePressureService.getPressure();
    }

    @Override
    public String getHumidity() {
        return accurateHumidityService.getHumidity();
    }
}
