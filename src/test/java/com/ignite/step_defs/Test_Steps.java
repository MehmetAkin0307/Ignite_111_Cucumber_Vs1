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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Steps {

    Introduction_Pg introduction_pg = new Introduction_Pg();
    Parent_Pg parent_pg = new Parent_Pg();
    Parent parent_object = new Parent();
    Student_Pg student_pg = new Student_Pg();
    Student student_object = new Student();
    Schools_Pg schools_pg = new Schools_Pg();
    Finish_Pg finish_pg = new Finish_Pg();
    Confirmation_Pg confirmation_pg = new Confirmation_Pg();


    @Given("User accepts admission term")
    public void user_accepts_admission_term() {

        Driver.getDriver().get(ConfigReader.getKey("url"));
        BrowserUtils.waitFor(3);

    }

    @When("User clicks on the check button")
    public void user_clicks_on_the_check_button() {
        BrowserUtils.waitFor(5);
        introduction_pg.acceptButton.click();


    }

    @Then("User clicks on the next button to goes the Parent page")
    public void user_clicks_on_the_next_button_to_goes_the_Parent_page() {
        BrowserUtils.waitFor(5);
        introduction_pg.next_Btn.click();
    }

    @Then("User launches the Parent Information section.")
    public void user_launches_the_Parent_Information_section() {

    }

    @Then("User writes parent first name in the box")
    public void user_writes_parent_first_name_in_the_box() {
        parent_pg.parentFirstName.sendKeys(parent_object.firstName);
    }

    @Then("User writes parent last name in the box")
    public void user_writes_parent_last_name_in_the_box() {
        parent_pg.parentLastName.sendKeys(parent_object.lastName);
    }

    @Then("User writes how did hear the school?")
    public void user_writes_how_did_hear_the_school() {
        parent_pg.howDidYouHear.sendKeys(parent_object.hdyhau);
    }


    @Given("User launches the parent Contact Information section.")
    public void user_launches_the_parent_Contact_Information_section() {

    }

    @Then("User writes parent contact information.")
    public void user_writes_parent_contact_information() {

    }

    @Then("User writes on the email box.")
    public void user_writes_on_the_email_box() {
        parent_pg.email.sendKeys(parent_object.email);
    }

    @Then("User writes on the home phone box.")
    public void user_writes_on_the_home_phone_box() {

        parent_pg.homePhone.sendKeys(parent_object.homeNumber);
    }

    @Given("User launches the parent Address section.")
    public void user_launches_the_parent_Address_section() {

    }

    @Then("User writes address information.")
    public void user_writes_address_information() {

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

    @Given("User launches the Student Information section.")
    public void user_launches_the_Student_Information_section() {

    }

    @Then("User writes student contact information.")
    public void user_writes_student_contact_information() {

    }

    @Then("User writes on the parent relation box.")
    public void user_writes_on_the_parent_relation_box() {
        student_pg.parentRelation.sendKeys(student_object.parentRelation);
    }

    @Then("User writes student first name in the box")
    public void user_writes_student_first_name_in_the_box() {

        student_pg.firstName.sendKeys(student_object.firstName);
    }

    @Then("User writes student last name in the box")
    public void user_writes_student_last_name_in_the_box() {

        student_pg.lastName.sendKeys(student_object.lastName);
    }

    @Then("User writes the date of birth in the box.")
    public void user_writes_the_date_of_birth_in_the_box() {
        // student_pg.dateOfBirth.sendKeys(student_object.dateOfBird);
        student_pg.studenAgeYear.sendKeys(student_object.studentYear);
        student_pg.studentAgeMonth.sendKeys(student_object.studentMonth);
        student_pg.studentAgeDay.sendKeys(student_object.studentDay);
        student_pg.lastName.click();
    }

    @Then("User writes gender in the box.")
    public void user_writes_gender_in_the_box() {

        student_pg.genderSelect.sendKeys(student_object.gender);
    }

    @Then("User goes to Student Grade Level section")
    public void user_goes_to_Student_Grade_Level_section() {

    }

    @Given("User accesses Grade Level section")
    public void user_accesses_Grade_Level_section() {
      /*  BrowserUtils.waitFor(2);
        student_pg.gradeLevel.click();
        BrowserUtils.waitFor(5);*/
 /*   }


    @Then("User selects the academic year.")
    public void user_selects_the_academic_year() {
        BrowserUtils.waitFor(5);
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

    @Given("User accesses School page.")
    public void user_accesses_School_page() {

    }

    @Then("The user selects the suitable school.")
    public void the_user_selects_the_suitable_school() {
        // schools_pg.radio_button1.click();
        //  schools_pg.schoolChoese();
        schools_pg.ignite111seleck.click();
    }

    @Then("User clicks on the next button to goes the Finish page")
    public void user_clicks_on_the_next_button_to_goes_the_Finish_page() {
        BrowserUtils.waitFor(4);
        schools_pg.next_Btn.click();
    }

    @Given("User launches the Finish page.")
    public void user_launches_the_Finish_page() {
        //  Assert.assertTrue(finish_pg.finishAssert.getText().contains("Finish")); Burda hata veriyor ?????

    }

    @Then("User clicks on the next button to goes the Finish page finish button")
    public void user_clicks_on_the_next_button_to_goes_the_Finish_page_finish_button() {

        finish_pg.finish_Btn.click();
        BrowserUtils.waitFor(5);
    }


    @Then("User clicks on the finish button to complete the registration")             //BURASINI IBRAHIM BEYE SORMA
    public void user_clicks_on_the_finish_button_to_complete_the_registration() {


        Assert.assertEquals(finish_pg.checkComplete.getText(), finish_pg.completeText);

    }
}
*/