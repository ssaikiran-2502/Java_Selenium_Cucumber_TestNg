package pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckBoxPageLocators {

    @FindBy(xpath="//h3")
    public WebElement heading;

    @FindBy(xpath="//input[@type='checkbox']")
    public List<WebElement> check_boxes;


}
