package designpatterns.FacadePattern;

import designpatterns.FacadePattern.CustomAPI.CustomAPI;
import designpatterns.FacadePattern.CustomAPI.CustomFacade;
import designpatterns.FacadePattern.ThirdPartyAPIs.*;
import designpatterns.ParentMain;

public class FacadeMain extends ParentMain {
    public FacadeMain(String patternName) {
        super(patternName);
    }

    @Override
    public void execute() {
    //similar to ADAPTER - mapping bad APIs to using a custom interface that makes more sense (naming, types, etc)
        System.out.println("-------- FACADE ----------");
        AccurateTempService accurateTempService = new AccurateTempServiceImpl();
        AccuratePressureService accuratePressureService = new AccuratePressureServiceImpl();
        AccurateHumidityService accurateHumidityService = new AccurateHumidityServiceImpl();
        CustomAPI customAPI = new CustomFacade(accurateHumidityService, accuratePressureService, accurateTempService);

        //use ONE customAPI with consistent methods to interact with 3 different third party APIs
        //makes easier for us to remember and can write clearer method names if third party methods are confusing
        System.out.println(customAPI.getTemp());
        System.out.println(customAPI.getHumidity());
        System.out.println(customAPI.getPressure());
    }
}
