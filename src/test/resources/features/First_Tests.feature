@asa
Feature: Coolsis Student Enrolment Page

  @asa1
  Scenario: Introduction Page Features
    Given User going to Introduction page

  @asa2
  Scenario: Parent Information Features
    Given User going to Introduction page
    And User launches the Parent Information section.
    When User writes parent first name in the box
    And User writes parent last name in the box
    And User writes how did hear the school?


  @asa3
  Scenario: Parent Contact Information Features

    Given User going to Introduction page
    And User launches the Parent Information section.
    When User writes parent first name in the box
    And User writes parent last name in the box
    And User writes how did hear the school?
    And User writes on the email box.
    And User writes on the home phone box.


  @asa4
  Scenario: Parent Address Features
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


  @asa5
  Scenario: Student Information Features
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

  @asa6
  Scenario:  Student Grade Level Features
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

  @asa7
  Scenario: School Features
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
    And The user selects the suitable school.
    And User clicks on the next button to goes the Finish page

  @asa8
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




