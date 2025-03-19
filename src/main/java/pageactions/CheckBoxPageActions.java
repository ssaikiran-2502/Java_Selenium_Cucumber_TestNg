package pageactions;

import org.openqa.selenium.support.PageFactory;
import pagelocators.CheckBoxPageLocators;
import pagelocators.HomePageLocators;
import utilitys.DriverUtility;

public class CheckBoxPageActions {

    CheckBoxPageLocators checkBoxPageLocators=null;

    public CheckBoxPageActions(){
        this.checkBoxPageLocators=new CheckBoxPageLocators();
        PageFactory.initElements(DriverUtility.getDriver(), checkBoxPageLocators);

    }

    public void firstCheckBox_Check(){
        if(!checkBoxPageLocators.check_boxes.getFirst().isSelected()){
            checkBoxPageLocators.check_boxes.getFirst().click();
        }
        else{
            return;
        }
    }
    public void firstCheckBox_UnCheck(){
        if(checkBoxPageLocators.check_boxes.get(1).isSelected()){
            checkBoxPageLocators.check_boxes.get(1).click();
        }
        else{
            return;
        }
    }
    public void secondCheckBox_Check(){
        if(!checkBoxPageLocators.check_boxes.get(1).isSelected()){
            checkBoxPageLocators.check_boxes.get(1).click();
        }
        else{
            return;
        }
    }
    public void secondCheckBox_UnCheck(){
        if(checkBoxPageLocators.check_boxes.get(1).isSelected()){
            checkBoxPageLocators.check_boxes.get(1).click();
        }
        else{
            return;
        }
    }
}
