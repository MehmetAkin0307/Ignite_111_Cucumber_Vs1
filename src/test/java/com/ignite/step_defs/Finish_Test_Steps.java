/*package com.ignite.step_defs;

import com.ignite.eif_pages.*;
import com.ignite.pojos.Parent;
import com.ignite.pojos.Student;
import com.ignite.utilities.BrowserUtils;
import com.ignite.utilities.ConfigReader;
import com.ignite.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Finish_Test_Steps {

    Introduction_Pg introduction_pg = new Introduction_Pg();
    Parent_Pg parent_pg = new Parent_Pg();
    Parent parent_object = new Parent();
    Student_Pg student_pg = new Student_Pg();
    Student student_object = new Student();
    Schools_Pg schools_pg = new Schools_Pg();
    Finish_Pg finish_pg = new Finish_Pg();
    Confirmation_Pg confirmation_pg = new Confirmation_Pg();
    Database_Pg database_pg = new Database_Pg();


    @Given("User going to Introduction page")
    public void user_going_to_Introduction_page()  {

        Driver.getDriver().get(ConfigReader.getKey("url"));
        BrowserUtils.waitFor(3);

    }

    @Then("User launches the Parent Information section.")
    public void user_launches_the_Parent_Information_section() {

    }

    @Then("User writes parent first name in the box")
    public void user_writes_parent_first_name_in_the_box() {
       parent_pg.parentFirstName.sendKeys(parent_object.firstName);

        //parent_pg.parentFirstName.sendKeys("Tom");
    }

    @Then("User writes parent last name in the box")
    public void user_writes_parent_last_name_in_the_box() {
        parent_pg.parentLastName.sendKeys(parent_object.lastName);
     //   parent_pg.parentLastName.sendKeys("Hank");

    }

    @Then("User writes how did hear the school?")
    public void user_writes_how_did_hear_the_school() {
        parent_pg.howDidYouHear.sendKeys(parent_object.hdyhau);


    }

    @Then("User writes on the email box.")
    public void user_writes_on_the_email_box() {
        parent_pg.email.sendKeys(parent_object.email);

    }

    @Then("User writes on the home phone box.")
    public void user_writes_on_the_home_phone_box() {
        parent_pg.homePhone.sendKeys(parent_object.homeNumber);

    }

    @Then("User writes on the street box.")
    public void user_writes_on_the_street_box() {
        parent_pg.pStreet.sendKeys(parent_object.street);

    }

    @Then("User writes on the home city box.")
    public void user_writes_on_the_home_city_box() {
        parent_pg.pCity.sendKeys(parent_object.city);

    }

    @Then("User writes on the state box.")
    public void user_writes_on_the_state_box() {
        parent_pg.pState.sendKeys(parent_object.state);

    }

    @Then("User writes on the zip code box.")
    public void user_writes_on_the_zip_code_box() {
        parent_pg.pZip.sendKeys(parent_object.zipCode);

    }

    @Then("User clicks on the next button to goes the Student page")
    public void user_clicks_on_the_next_button_to_goes_the_Student_page() {
        parent_pg.next_Btn.click();

    }

    @Then("User writes on the parent relation box.")
    public void user_writes_on_the_parent_relation_box() {
        student_pg.parentRelation.sendKeys(student_object.parentRelation);

    }

    @Then("User writes student first name in the box")
    public void user_writes_student_first_name_in_the_box() {
      //  student_pg.firstName.sendKeys(student_object.firstName);
        student_pg.firstName.sendKeys("Can");

    }

    @Then("User writes student last name in the box")
    public void user_writes_student_last_name_in_the_box() {
      // student_pg.lastName.sendKeys(student_object.lastName);
        student_pg.lastName.sendKeys("Hank");

    }

    @Then("User writes the date of birth in the box.")
    public void user_writes_the_date_of_birth_in_the_box() {
        student_pg.studenAgeYear.sendKeys(student_object.studentYear);
        student_pg.studentAgeMonth.sendKeys(student_object.studentMonth);
        student_pg.studentAgeDay.sendKeys(student_object.studentDay);

    }

    @Then("User writes gender in the box.")
    public void user_writes_gender_in_the_box() {
        student_pg.genderSelect.sendKeys(student_object.gender);

    }

    @Then("User selects the academic year.")
    public void user_selects_the_academic_year() {
        student_pg.currentAcademicYear.click();

    }

    @Then("User selects the grade level.")
    public void user_selects_the_grade_level() {
        student_pg.gradeLevel.sendKeys(student_object.gradeLevel);
    }

    @Then("User clicks on the next button to goes the School page")
    public void user_clicks_on_the_next_button_to_goes_the_School_page() {
        student_pg.next_Btn.click();

    }

    @Then("The user selects the suitable school.")
    public void the_user_selects_the_suitable_school() {
        schools_pg.ignite111seleck.click();

    }

    @Then("User clicks on the next button to goes the Finish page")
    public void user_clicks_on_the_next_button_to_goes_the_Finish_page() {
        schools_pg.next_Btn.click();

    }

    @Then("User clicks on the next button to goes the Finish page finish button")
    public void user_clicks_on_the_next_button_to_goes_the_Finish_page_finish_button() {
        finish_pg.finish_Btn.click();
        BrowserUtils.waitFor(3);
    }

    @Then("User clicks on the finish button to complete the registration")
    public void user_clicks_on_the_finish_button_to_complete_the_registration() {
        Assert.assertEquals(finish_pg.checkComplete.getText(), finish_pg.completeText);
        BrowserUtils.waitFor(3);

    }

    @Given("Navigate to Coolsis Ignite site")
    public void navigateToCoolsisIgniteSite() {

        BrowserUtils.waitFor(5);
        Driver.getDriver().get(ConfigReader.getKey("url2"));
        BrowserUtils.waitFor(5);
     /*  BrowserUtils.waitFor(5);
        System.out.println(Driver.getDriver().getCurrentUrl());
        BrowserUtils.waitFor(5);
        Driver.getDriver().get(ConfigReader.getKey("url2"));
        System.out.println(Driver.getDriver().getCurrentUrl());
        BrowserUtils.waitFor(5);*/


   /* }
    @When("User  enters username and Pasword and logs in")
    public void userEntersUsernameAndPaswordAndLogsIn() {

        database_pg.username.sendKeys("makin");
        database_pg.password.sendKeys("Hamza1071");

    }

    @When("User enters Staff Member button")
    public void user_enters_Staff_Member_button() {

    }

    @When("User click login button")
    public void user_click_login_button() {

    }

    @Then("verify that user is succesfully logged in")
    public void verify_that_user_is_succesfully_logged_in() {

    }

    @When("User clicks  Student Information")
    public void user_clicks_Student_Information() {

    }

    @When("User clicks Applications")
    public void user_clicks_Applications() {

    }

    @When("User checks the grade level")
    public void user_checks_the_grade_level() {

    }

    @Then("Verify that user succesfully   applied grade level")
    public void verify_that_user_succesfully_applied_grade_level() {

    }

    @When("User checks user succesfully Parent Firstname")
    public void user_checks_user_succesfully_Parent_Firstname() {

    }

    @Then("Verify that user succesfully Parent Firstname")
    public void verify_that_user_succesfully_Parent_Firstname() {

    }



}*/
