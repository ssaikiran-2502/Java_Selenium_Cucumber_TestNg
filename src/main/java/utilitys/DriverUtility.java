package utilitys;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverUtility {

    public static WebDriver driver;

    public static void initDriver(String str){
        if (str.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().driverVersion("134.0.6998.89").setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

        } else if (str.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().driverVersion("134.0.3124.72").setup();
            driver = new EdgeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

        }else{
            WebDriverManager.firefoxdriver().driverVersion("134.0.3124.72").setup();
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

        }
    }



    public static WebDriver getDriver(){
        return driver;
    }


    public static void openPage(String url){
        driver.get(url);
    }

    public static void tearDown(){
        if(driver!=null)
            driver.quit();
    }
}
