/*package com.ignite.step_defs;


import com.ignite.eif_pages.*;
import com.ignite.pojos.Parent;
import com.ignite.pojos.Student;
import com.ignite.pojos.XPathTableRowCell;
import com.ignite.utilities.BrowserUtils;
import com.ignite.utilities.ConfigReader;
import com.ignite.utilities.Driver;
import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@RunWith(Cucumber.class)
public class Database_TestSteps {

   Introduction_Pg introduction_pg = new Introduction_Pg();
    Parent_Pg parent_pg = new Parent_Pg();
    Parent parent_object = new Parent();
    Student_Pg student_pg = new Student_Pg();
    Student student_object = new Student();
    Schools_Pg schools_pg = new Schools_Pg();
    Finish_Pg finish_pg = new Finish_Pg();
    Confirmation_Pg confirmation_pg = new Confirmation_Pg();
    Database_Pg database_pg = new Database_Pg();


    @Given("^Initialize the browser with Chrome$")
    public void initialize_the_browser_with_chrome() {


    }

    @And("^Navigate to \"([^\"]*)\"site$")
    public void navigate_to_somethingsite(String strArg1)  {
        BrowserUtils.waitFor(5);
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.getDriver().get(ConfigReader.getKey("url2"));
        System.out.println(Driver.getDriver().getCurrentUrl());
        BrowserUtils.waitFor(5);


    }

    @When("^User  enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
    public void user_enters_something_and_something_and_logs_in(String username, String password) {
        username = "makin";
        password = "Hamza1071";

        database_pg.username.sendKeys(username);
        database_pg.password.sendKeys(password);

    }

    @And("^User enters Staff Member button$")
    public void user_enters_staff_member_button()  {
        database_pg.selectBtn.click();
        BrowserUtils.waitFor(3);
        database_pg.staffMember.click();


    }

    @And("^User click login button$")
    public void user_click_login_button() {
        database_pg.logInClick.click();

    }

    @Then("^verify that user is succesfully logged in$")
    public void verify_that_user_is_succesfully_logged_in() {

    }


    @When("^User clicks  Student Information$")
   public void user_clicks_student_information()  {
        BrowserUtils.waitFor(10);
    database_pg.studentButton.click();
    }



    @And("^User clicks Applications$")
    public void user_clicks_applications()  {
        BrowserUtils.waitFor(10);
     database_pg.aplicationsButton.click();

    }
    @When("User checks the grade level")
    public void user_checks_the_grade_level() {
        BrowserUtils.waitFor(10);
        Assert.assertEquals(student_object.gradeLevel,database_pg.appliedGradeLevel.getText());

        // Assert.assertEquals(student_object.s_first_name, finish_pg.student_first_name.getText());

    }

    @Then("^Verify that user succesfully   applied grade level$")
    public void verify_that_user_succesfully_applied_grade_level() {

    }
    @When("User checks user succesfully Parent Firstname")
    public void user_checks_user_succesfully_Parent_Firstname()  {
        BrowserUtils.waitFor(5);
       // Assert.assertEquals(parent_object.firstName.,database_pg.applicationsParentFirstName.getText());
        //XPathTableRowCell xPathTableRowCell=new XPathTableRowCell();
        //String xpath=xPathTableRowCell.Xpath("(//table)[28]//tr[1]//td[6]");
        //Assert.assertEquals(Driver.getDriver().findElement(By.xpath("(//table)[29]//tr[1]//td[6]")).getText(),"Vanda Lehner");
        List<WebElement> listOfTable=Driver.getDriver().findElements(By.xpath("(//table)[28]"));

        for (int i = 1; i <listOfTable.size() ; i++) {
            WebElement findname=Driver.getDriver().findElement(By.xpath("(//table)[28]//tr["+i+"]//td[6]"));
            if (findname.getText().equals("Elisha Jerde")){
                System.out.println("pass");
            }else{
                System.out.println("fail");
            }
            Assert.assertTrue(findname.getText().equals("Elisha Jerde"));

        }

        for (WebElement each:listOfTable
             ) {
            System.out.print(each.getText());
        }

    }

    @Then("Verify that user succesfully Parent Firstname")
    public void verify_that_user_succesfully_Parent_Firstname() {



    }


    @When("User  enters username and password  and logs in")
    public void userEntersUsernameAndPasswordAndLogsIn() {
        database_pg.username.sendKeys("makin");
        database_pg.password.sendKeys("Hamza1071");


    }

    @And("Navigate to Coolsis Ignite site")
    public void navigateToCoolsisIgniteSite() {
        Driver.getDriver().get(ConfigReader.getKey("url2"));
    }
}

/*
1.(//table) yazip kactane oldugunu bulma.Bulunanlardan tum sayfayi tarayanini buluyorum.
2.(//table)[29]  id sini yaziyorum
3. (//table)[29]//tr[1]  tr=table role(komple bir satiri seciyor) icine 1 yazarsam birinci satiri seciyor 3 yazarsam 2. satiri seciyor.
oglu ise tek slash torunu ise cift slash olacak
4.(//table)[29]//tr[1]/td              td=table data
 */
