package utilitys;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;

public class ScreenshotUtility {

    WebDriver driver;

    public static String captureThisScreen(WebDriver driver) {
        try {
            String directory = "src/test/resources/Screenshots/";
            String ScreenshotName = directory + "ScreenshotAt" + dateAndTime()+".jpg";
            File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File result_file = new File(ScreenshotName);
            Files.copy(ss.toPath(), result_file.toPath());
            return result_file.toPath().toString();
        }catch(IOException e)
        {
            System.out.println("File while Capturing the Screenshot");
            return null;
        }
    }

    public static String dateAndTime(){
        LocalDateTime now=LocalDateTime.now();
        return now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
    }

}
