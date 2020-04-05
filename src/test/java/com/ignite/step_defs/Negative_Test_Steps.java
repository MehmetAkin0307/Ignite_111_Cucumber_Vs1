package com.ignite.step_defs;


import com.ignite.eif_pages.Introduction_Pg;
import com.ignite.eif_pages.Parent_Pg;
import com.ignite.eif_pages.Student_Pg;
import com.ignite.pojos.Parent;
import com.ignite.pojos.Student;
import com.ignite.utilities.BrowserUtils;
import com.ignite.utilities.ConfigReader;
import com.ignite.utilities.Driver;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Negative_Test_Steps {
/*    Introduction_Pg introduction_pg = new Introduction_Pg();
    Parent_Pg parent_pg = new Parent_Pg();
    Parent parent_object = new Parent();
    Student_Pg student = new Student_Pg();
    Student student_object = new Student();

    @Given("User going to Introduction page")
    public void user_going_to_Introduction_page()  {
        Driver.getDriver().get(ConfigReader.getKey("url"));
        BrowserUtils.waitFor(8);

    }

    @When("User clicks on  accepts  check button")
    public void user_clicks_on_accepts_check_button()  {
        BrowserUtils.waitFor(8);
        introduction_pg.acceptButton.click();


    }

    @When("User clicks on the next button")
    public void user_clicks_on_the_next_button() {
        introduction_pg.next_Btn.click();

    }

    @Then("User going to Parent page")
    public void user_going_to_Parent_page() {

        Assert.assertEquals(parent_pg.confirmParentStep.getText(), parent_object.parentStepConfirmaionText);
    }
    @When("User writes the five-digit phone number in the home phone box.")
    public void user_writes_the_five_digit_phone_number_in_the_home_phone_box() {
        parent_pg.homePhone.sendKeys(parent_object.phoneDigits(5));
        Assert.assertTrue(parent_object.isPhoneNumberCorrect());
    }


    @When("User enters digit number in student name box")
    public void user_enters_digit_number_in_student_name_box() {
        //student.firstName.sendKeys(student_object.firstName);
        student.firstName.sendKeys(student_object.enterNumbersasName(125));
        Assert.assertTrue((student_object.isNameCorrect()));
    }

    @When("User enters symbols in student lastname box")
    public void user_enters_digit_number_in_student_lastname_box() {
        student.lastName.sendKeys(student_object.lastName);
    }


}
    /*@When ("^User enters digit number in student name box $")
    public void user_enters_digit_number_in_student_name_box() {
        student.firstName.sendKeys(student_object.enterNumbersasName(123));
       // Assert.assertFalse(student_object.isNameCorrect());
    }

   // @And("^User enters symbol in student name box $")*/
}