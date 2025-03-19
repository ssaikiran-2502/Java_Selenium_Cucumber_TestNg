package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.ElementNotInteractableException;
import pageactions.CheckBoxPageActions;
import pageactions.HomePageActions;
import pagelocators.CheckBoxPageLocators;
import utilitys.DriverUtility;
import utilitys.ExtentReportGen;

import java.io.IOException;


public class CheckBoxes {

    HomePageActions homePageActions=new HomePageActions();
    CheckBoxPageLocators checkBoxPageLocators=new CheckBoxPageLocators();
    CheckBoxPageActions checkBoxPageActions=new CheckBoxPageActions();

    @Given("User login's to the Internet homepage")
    public void user_login_s_to_the_internet_homepage() {
        ExtentReportGen.startTest("checkbox");
        DriverUtility.openPage("https://the-internet.herokuapp.com/");
    }

    @When("clicked on checkboxes option")
    public void clicked_on_checkboxes_option() {
        try {
            homePageActions.clickOnCheckBox();
            ExtentReportGen.logStep("clicked_on_checkboxes_option", "Pass");
            ExtentReportGen.addScreenshotToReport(DriverUtility.getDriver());
        }
        catch (Exception e){
            ExtentReportGen.logStep("clicked_on_checkboxes_option", "Fail");
        }
    }

    @Then("checkboxes page pop's up")
    public void checkboxes_page_pop_s_up() {

        //ScreenshotUtility.captureThisScreen(DriverUtility.getDriver());
        //System.out.println(checkBoxPageLocators.heading.getText());
    }

    @Then("validate if you can able to check the 1st check box and uncheck the 2nd checkbox")
    public void validate_if_you_can_able_to_check_the_1st_check_box_and_uncheck_the_2nd_checkbox() throws IOException {
        try {
            checkBoxPageActions.firstCheckBox_Check();
            checkBoxPageActions.secondCheckBox_UnCheck();
            ExtentReportGen.logStep("Check 1st box and Uncheck the 2nd box", "Pass");
            ExtentReportGen.addScreenshotToReport(DriverUtility.getDriver());
        }catch (Exception e){
            ExtentReportGen.logStep("Check 1st box and Uncheck the 2nd box", "Fail");
            ExtentReportGen.addScreenshotToReport(DriverUtility.getDriver());
        }

    }

}
