package pageactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pagelocators.HomePageLocators;
import utilitys.DriverUtility;

public class HomePageActions {

    /*
    WebDriver driver;
    HomePageActions(WebDriver driver){
        this.driver=driver;
    }
    */

    HomePageLocators homepagelocators=null;

    public HomePageActions(){
        this.homepagelocators=new HomePageLocators();
        PageFactory.initElements(DriverUtility.getDriver(), homepagelocators);

    }
    public void clickOnCheckBox(){
        homepagelocators.checkboxes.click();
    }

    public void disappearElement(){
        homepagelocators.disappear_element.click();
    }

    /*public String homePageTitle() {
        return driver.getTitle();
    }*/

}
