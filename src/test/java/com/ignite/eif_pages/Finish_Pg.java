package com.ignite.eif_pages;

import com.ignite.utilities.BrowserUtils;
import com.ignite.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finish_Pg {
    public Finish_Pg() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id = "studenthdr1")
    public WebElement studentFullName;

    @FindBy(id = "studentyearinfo1")
    public WebElement academicYear;

    @FindBy(id = "studentgradeinfo1")
    public WebElement gradeLevel;

    @FindBy(id = "studentageinfo1")
    public WebElement studentAgeInfo;

    @FindBy(id = "tableSchools_1")
    public WebElement schoolTable;

    @FindBy(linkText = "Finish")
    public WebElement finish_Btn;
    @FindBy (css = "#application-completed-text")
    public WebElement checkComplete;
    public String completeText="Your enrollment inquiry has been submitted successfully.";



    @FindBy(xpath = "//a[@id='example-advanced-form-t-4']/span[3]")
    public WebElement finishAssert;

}

