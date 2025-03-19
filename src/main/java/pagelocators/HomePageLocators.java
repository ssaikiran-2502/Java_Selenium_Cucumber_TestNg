package pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

    @FindBy(xpath="//a[@href='/checkboxes']")
    public WebElement checkboxes;

    @FindBy(xpath="//a[@href='/disappearing_elements']")
    public WebElement disappear_element;
}
