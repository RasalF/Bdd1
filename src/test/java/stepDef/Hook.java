package stepDef;

import base.config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.util.Strings;

public class Hook extends config {
    // Test Data and Environment
    public static String envType = System.getProperty("env");
    public static String browserType = System.getProperty("browser");
    public static String baseURL;

    @Before
    public void startTest(){

        if (Strings.isNullOrEmpty(browserType)){
            browserType="ch";
        }
        if(Strings.isNullOrEmpty(envType)){
            envType="qa";
        }

        driver = setupBrowser(browserType);
        switch (envType) {

            case "qa":
                baseURL= "https://www.qa.taltektc.com";
                break;
            case "stage":
                baseURL = "https://www.stage.taltektc.com";
                break;
        }
        driver.get(baseURL);
    }
    @After
    public void afterTest(){


    }
}
