@log
Feature:Coolsis Database Page


  @log1
  Scenario: Finish Page Features
    Given User going to Introduction page
    And User launches the Parent Information section.
    When User writes parent first name in the box
    And User writes parent last name in the box
    And User writes how did hear the school?
    And User writes on the email box.
    And User writes on the home phone box.
    And User writes on the street box.
    And User writes on the home city box.
    And User writes on the state box.
    And User writes on the zip code box.
    Then User clicks on the next button to goes the Student page
    When User writes on the parent relation box.
    And User writes student first name in the box
    And User writes student last name in the box
    And User writes the date of birth in the box.
    And User writes gender in the box.
    And User selects the academic year.
    And User selects the grade level.
    Then User clicks on the next button to goes the School page
    When The user selects the suitable school.
    Then User clicks on the next button to goes the Finish page
    When User clicks on the next button to goes the Finish page finish button
    Then User clicks on the finish button to complete the registration

  @log2
  Scenario:Coolsis Page Login
    Given Navigate to Coolsis Ignite site
    When User  enters username and pasword and logs in
    And User enters Staff Member button
    And User click login button
    Then verify that user is succesfully logged in
    When User clicks  Student Information
    And User clicks Applications
    Then Verify that user succesfully   applied grade level
    Then Verify that user succesfully Parent Firstname
    Then Verify that user succesfully Student Firsname