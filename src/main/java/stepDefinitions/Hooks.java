package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utilitys.DriverUtility;
import utilitys.ExtentReportGen;

public class Hooks {

    @Before
    public static void setUp(){
        DriverUtility.initDriver("chrome");
        ExtentReportGen.extentReportsInit();
    }

    @After
    public static void end(){
        DriverUtility.tearDown();
        ExtentReportGen.endTest();
    }
}
