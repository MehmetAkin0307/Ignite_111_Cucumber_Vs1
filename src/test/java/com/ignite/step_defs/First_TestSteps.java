package com.ignite.step_defs;

import com.ignite.eif_pages.*;
import com.ignite.pojos.Parent;
import com.ignite.pojos.Student;
import com.ignite.utilities.BrowserUtils;
import com.ignite.utilities.ConfigReader;
import com.ignite.utilities.DBConnection;
import com.ignite.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.impl.schema.XQuerySchemaTypeSystem;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class First_TestSteps {


    Introduction_Pg introduction_pg = new Introduction_Pg();
    Parent_Pg parent_pg = new Parent_Pg();
    Parent parent_object = new Parent();
    Student_Pg student_pg = new Student_Pg();
    Student student_object = new Student();
    Schools_Pg schools_pg = new Schools_Pg();
    Finish_Pg finish_pg = new Finish_Pg();
    Confirmation_Pg confirmation_pg = new Confirmation_Pg();
    private String query;


    @Given("User going to Introduction page")
    public void user_going_to_Introduction_page() {

        Driver.getDriver().get(ConfigReader.getKey("url"));
        BrowserUtils.waitFor(3);

    }

    @Given("User launches the Parent Information section.")
    public void user_launches_the_Parent_Information_section() {


    }

    @When("User writes parent first name in the box")
    public void user_writes_parent_first_name_in_the_box() {

        parent_pg.parentFirstName.sendKeys(parent_object.firstName);

    }

    @When("User writes parent last name in the box")
    public void user_writes_parent_last_name_in_the_box() {
        parent_pg.parentLastName.sendKeys(parent_object.lastName);

    }

    @When("User writes how did hear the school?")
    public void user_writes_how_did_hear_the_school() {
        parent_pg.howDidYouHear.sendKeys(parent_object.hdyhau);

    }

    @When("User writes on the email box.")
    public void user_writes_on_the_email_box() {
        parent_pg.email.sendKeys(parent_object.email);

    }

    @When("User writes on the home phone box.")
    public void user_writes_on_the_home_phone_box() {

        parent_pg.homePhone.sendKeys(parent_object.homeNumber);
    }

    @When("User writes on the street box.")
    public void user_writes_on_the_street_box() {
        parent_pg.pStreet.sendKeys(parent_object.street);

    }

    @When("User writes on the home city box.")
    public void user_writes_on_the_home_city_box() {
        parent_pg.pCity.sendKeys(parent_object.city);

    }

    @When("User writes on the state box.")
    public void user_writes_on_the_state_box() {

        parent_pg.pState.sendKeys(parent_object.state);

    }

    @When("User writes on the zip code box.")
    public void user_writes_on_the_zip_code_box() {

        parent_pg.pZip.sendKeys(parent_object.zipCode);

    }

    @Then("User clicks on the next button to goes the Student page")
    public void user_clicks_on_the_next_button_to_goes_the_Student_page() {
        parent_pg.next_Btn.click();

    }

    @When("User writes on the parent relation box.")
    public void user_writes_on_the_parent_relation_box() {

        student_pg.parentRelation.sendKeys(student_object.parentRelation);
    }

    @When("User writes student first name in the box")
    public void user_writes_student_first_name_in_the_box() {
        student_pg.firstName.sendKeys(student_object.firstName);

    }

    @When("User writes student last name in the box")
    public void user_writes_student_last_name_in_the_box() {

        student_pg.lastName.sendKeys(student_object.lastName);

    }

    @When("User writes the date of birth in the box.")
    public void user_writes_the_date_of_birth_in_the_box() {

        student_pg.studenAgeYear.sendKeys(student_object.studentYear);
        student_pg.studentAgeMonth.sendKeys(student_object.studentMonth);
        student_pg.studentAgeDay.sendKeys(student_object.studentDay);

    }

    @When("User writes gender in the box.")
    public void user_writes_gender_in_the_box() {
        student_pg.genderSelect.sendKeys(student_object.gender);

    }

    @When("User selects the academic year.")
    public void user_selects_the_academic_year() {
        student_pg.currentAcademicYear.click();

    }

    @When("User selects the grade level.")
    public void user_selects_the_grade_level() {
        student_pg.gradeLevel.sendKeys(student_object.gradeLevel);

    }

    @Then("User clicks on the next button to goes the School page")
    public void user_clicks_on_the_next_button_to_goes_the_School_page() {

        student_pg.next_Btn.click();
    }

    @When("The user selects the suitable school.")
    public void the_user_selects_the_suitable_school() {

        schools_pg.ignite111seleck.click();

    }

    @Then("User clicks on the next button to goes the Finish page")
    public void user_clicks_on_the_next_button_to_goes_the_Finish_page() {


        schools_pg.next_Btn.click();
        BrowserUtils.waitFor(10);
    }

    @When("User clicks on the next button to goes the Finish page finish button")
    public void user_clicks_on_the_next_button_to_goes_the_Finish_page_finish_button() {

        finish_pg.finish_Btn.click();
        BrowserUtils.waitFor(3);

    }

    @Then("User clicks on the finish button to complete the registration")
    public void user_clicks_on_the_finish_button_to_complete_the_registration() throws InterruptedException,SQLException {

        BrowserUtils.waitFor(6);
        Assert.assertEquals(finish_pg.checkComplete.getText(), finish_pg.completeText);
        BrowserUtils.waitFor(6);

       // DBConnection dbConnection = new DBConnection();
       // dbConnection.myQuery("firstName");

        System.out.println(student_pg.adSorgulama.getText());

        

    }

}







       /* DBConnection dbConnection=new DBConnection();
        dbConnection.myQuery(query);*/



   /* static String LOGIN="ignite";
    static String PASSWORD="Eh7ruY3!p@82";
    static String dbURL="jdbc:sqlserver://192.168.1.15\\COOLSQLIGNITE;";
    DBConnection dbConnection=new DBConnection();

    public Connection getConnection() throws SQLException {*/








