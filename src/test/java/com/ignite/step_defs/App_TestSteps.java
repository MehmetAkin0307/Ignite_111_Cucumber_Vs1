package com.ignite.step_defs;


import com.ignite.eif_pages.Database_Pg;
import com.ignite.pojos.Student;
import com.ignite.pojos.XPathTableRowCell;
import com.ignite.utilities.BrowserUtils;
import com.ignite.utilities.ConfigReader;
import com.ignite.utilities.Driver;
import com.ignite.utilities.DriverApp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class App_TestSteps {

    Database_Pg database_pg = new Database_Pg();
    Student student_object = new Student();

    @Given("Navigate to Coolsis Ignite site")
    public void navigate_to_Coolsis_Ignite_site() {


        DriverApp.getDriverApp().get(ConfigReader.getKey("url2"));
        BrowserUtils.waitFor(5);
    }

    @When("User  enters username and pasword and logs in")
    public void user_enters_username_and_pasword_and_logs_in() {


        BrowserUtils.waitFor(2);
        database_pg.username.sendKeys("makin");
        BrowserUtils.waitFor(2);
        database_pg.password.sendKeys("Hamza1071");

        BrowserUtils.waitFor(2);
    }

    @When("User enters Staff Member button")
    public void user_enters_Staff_Member_button() {
        database_pg.selectBtn.click();
        BrowserUtils.waitFor(2);
        database_pg.staffMember.click();
        BrowserUtils.waitFor(2);

    }

    @When("User click login button")
    public void user_click_login_button() {
        BrowserUtils.waitFor(2);
        database_pg.logInClick.click();

    }

    @Then("verify that user is succesfully logged in")
    public void verify_that_user_is_succesfully_logged_in() {

    }

    @When("User clicks  Student Information")
    public void user_clicks_Student_Information() {
        BrowserUtils.waitFor(10);
        database_pg.studentButton.click();
        BrowserUtils.waitFor(12);
    }

    @When("User clicks Applications")
    public void user_clicks_Applications() {
        BrowserUtils.waitFor(4);
        database_pg.aplicationsButton.click();
        BrowserUtils.waitFor(4);


    }


    @Then("Verify that user succesfully   applied grade level")
    public void verify_that_user_succesfully_applied_grade_level() {

        Assert.assertEquals(student_object.gradeLevel, database_pg.appliedGradeLevel.getText());
        BrowserUtils.waitFor(6);
    }

    @Then("Verify that user succesfully Parent Firstname")
    public void verify_that_user_succesfully_Parent_Firstname() {


        List<WebElement> listOfTable = DriverApp.getDriverApp().findElements(By.xpath("(//table)[33]"));

        for (int i = 1; i < listOfTable.size(); i++) {
            WebElement findname = DriverApp.getDriverApp().findElement(By.xpath("(//table)[33]//tr[" + i + "]//td[6]"));
            if (findname.getText().equals("Yoshie Ferry1")) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
            Assert.assertTrue(findname.getText().equals("Yoshie Ferry1"));

        }

        for (WebElement each : listOfTable
        ) {
            System.out.print(each.getText());



              /*  String dene=database_pg.tablecell.getText();
        BrowserUtils.waitFor(6);
        System.out.println(dene);*/


       /* XPathTableRowCell xPathTableRowCell=new XPathTableRowCell();
        String xpath=xPathTableRowCell.Xpath(32,4,6);
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("(//table)[32]/tbody/tr[4]/td[6]/div")).getText(),"Yoshie Ferry");*/

        }
        System.out.println("TEST");


    }

    @Then("Verify that user succesfully Student Firsname")
    public void verify_that_user_succesfully_Student_Firsname() {

        List<WebElement> listOfTable = DriverApp.getDriverApp().findElements(By.xpath("(//table)[32]"));

        for (int i = 1; i < listOfTable.size(); i++) {
            WebElement findname = DriverApp.getDriverApp().findElement(By.xpath("((//table)[32]/tbody/tr/td[7]/div"));
            if (findname.getText().equals("Long")) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
            Assert.assertTrue(findname.getText().equals("Long"));

        }

        for (WebElement each : listOfTable
        ) {
            System.out.print(each.getText());


        }

    }

}
