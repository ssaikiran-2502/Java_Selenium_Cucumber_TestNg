package utilitys;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class ExtentReportGen {

    public static ExtentReports extent;
    public static ExtentTest test;

    public static void extentReportsInit(){
        String path="src/test/resources/extent-reports/";
        ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter(path+"sample.html");
        extent=new ExtentReports();
        extent.attachReporter(htmlReporter);

    }

    public static void startTest(String testName){
        test=extent.createTest(testName);
    }

    public static void logStep(String stepSummary, String status){
        if(status.equalsIgnoreCase("pass")){
            test.pass(stepSummary);
        } else if (status.equalsIgnoreCase("fail")) {
            test.fail(stepSummary);
        }
        else{
            test.skip(stepSummary);
        }
    }

    public static void addScreenshotToReport(WebDriver driver) throws IOException {
        String s=ScreenshotUtility.captureThisScreen(driver);


        test.addScreenCaptureFromPath(s);

    }

    public static void endTest(){
        extent.flush();
    }
}
