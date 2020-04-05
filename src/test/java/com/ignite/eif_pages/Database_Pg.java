package com.ignite.eif_pages;

import com.ignite.utilities.Driver;
import com.ignite.utilities.DriverApp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Database_Pg {
    public Database_Pg() {
        PageFactory.initElements(DriverApp.getDriverApp(), this);

    }

    @FindBy(id = "isc_13")
    public WebElement username;

    @FindBy(id = "isc_17")
    public WebElement password;


   @FindBy(xpath = "//span[@class='comboBoxItemPicker']")
   public WebElement selectBtn;



   /* @FindBy(id = "isc_1D")
    public WebElement logInAs;  // click edilecek*/


    @FindBy(xpath = "//*[@id='isc_PickListMenu_0_row_3']/td/div")
    public WebElement staffMember;

    @FindBy(xpath = "//td[@class='button']")
    public WebElement logInClick;

   // @FindBy(xpath = "//div[@id='isc_13']")
    @FindBy(id = "isc_19")
    public WebElement studentButton;

    @FindBy(xpath = "//div[@id='isc_2A']/table/tbody/tr[5]/td[2]/div")
    public WebElement aplicationsButton;

    //@FindBy(xpath = "//table[@id='isc_72table']/tbody/tr/td[4]/div")
   @FindBy(xpath = "//table[@id='isc_4Ftable']/tbody/tr[2]/td[4]/div" +
           "")
    public WebElement appliedGradeLevel;

   @FindBy(xpath = "//table[@id='isc_43table']/tbody/tr[2]/td[6]/div")
    public WebElement applicationsParentFirstName;

   @FindBy(xpath ="XPathTableRowCell(33,1,6))")
    public WebElement tablecell;

}
