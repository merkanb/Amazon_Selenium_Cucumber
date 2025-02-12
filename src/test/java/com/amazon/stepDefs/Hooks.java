package com.amazon.stepDefs;


import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {


    @Before

    public void setup() {
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
        BrowserUtils.waitFor(3);
    }


}
