@eif
Feature: Coolsis Student Enrolment Page

	@eif1
	Scenario: Introduction Page Features
		Given User accepts admission term
		When User clicks on the check button
		Then User clicks on the next button to goes the Parent page



	@eif2
	Scenario: Parent Information Features
		Given User accepts admission term
		Then User clicks on the check button
		And User clicks on the next button to goes the Parent page
		And User launches the Parent Information section.
		And User writes parent first name in the box
		And User writes parent last name in the box
		And User writes how did hear the school?

	@eif3
	Scenario: Parent Contact Information Features

		Given User launches the parent Contact Information section.
		Then User accepts admission term
		When User clicks on the check button
		And User clicks on the next button to goes the Parent page
		And User launches the Parent Information section.
		And User writes parent first name in the box
		And User writes parent last name in the box
		And User writes how did hear the school?
		And User writes parent contact information.
		And User writes on the email box.
		And User writes on the home phone box.


	@eif4
	Scenario: Parent Address Features

		Given User launches the parent Contact Information section.
		Then User accepts admission term
		When User clicks on the check button
		And User clicks on the next button to goes the Parent page
		And User launches the Parent Information section.
		And User writes parent first name in the box
		And User writes parent last name in the box
		And User writes how did hear the school?
		And User writes parent contact information.
		And User writes on the email box.
		And User writes on the home phone box.
		And User writes address information.
		And User writes on the street box.
		And User writes on the home city box.
		And User writes on the state box.
		And User writes on the zip code box.
		Then User clicks on the next button to goes the Student page




	@eif5
	Scenario: Student Information Features

		Given User launches the Student Information section.
		Then User accepts admission term
		When User clicks on the check button
		And User clicks on the next button to goes the Parent page
		And User launches the Parent Information section.
		And User writes parent first name in the box
		And User writes parent last name in the box
		And User writes how did hear the school?
		And User writes parent contact information.
		And User writes on the email box.
		And User writes on the home phone box.
		And User writes address information.
		And User writes on the street box.
		And User writes on the home city box.
		And User writes on the state box.
		And User writes on the zip code box.
		And User clicks on the next button to goes the Student page
		And User writes student contact information.
		And User writes on the parent relation box.
		And User writes student first name in the box
		And User writes student last name in the box
		And User writes the date of birth in the box.
		And User writes gender in the box.
		And User goes to Student Grade Level section




	@eif6
	Scenario: Student Grade Level Features

		Given User accesses Grade Level section
		Then User accepts admission term
		When User clicks on the check button
		And User clicks on the next button to goes the Parent page
		And User launches the Parent Information section.
		And User writes parent first name in the box
		And User writes parent last name in the box
		And User writes how did hear the school?
		And User writes parent contact information.
		And User writes on the email box.
		And User writes on the home phone box.
		And User writes address information.
		And User writes on the street box.
		And User writes on the home city box.
		And User writes on the state box.
		And User writes on the zip code box.
		And User clicks on the next button to goes the Student page
		And User writes student contact information.
		And User writes on the parent relation box.
		And User writes student first name in the box
		And User writes student last name in the box
		And User writes the date of birth in the box.
		And User writes gender in the box.
		And User selects the academic year.
		And User goes to Student Grade Level section
		And User selects the grade level.
		Then User clicks on the next button to goes the School page

	@eif7
	Scenario: School Features

		Given User accesses School page.
		Then User accepts admission term
		When User clicks on the check button
		And User clicks on the next button to goes the Parent page
		And User launches the Parent Information section.
		And User writes parent first name in the box
		And User writes parent last name in the box
		And User writes how did hear the school?
		And User writes parent contact information.
		And User writes on the email box.
		And User writes on the home phone box.
		And User writes address information.
		And User writes on the street box.
		And User writes on the home city box.
		And User writes on the state box.
		And User writes on the zip code box.
		And User clicks on the next button to goes the Student page
		And User writes student contact information.
		And User writes on the parent relation box.
		And User writes student first name in the box
		And User writes student last name in the box
		And User writes the date of birth in the box.
		And User writes gender in the box.
		And User selects the academic year.
		And User goes to Student Grade Level section
		And User selects the grade level.
		And User clicks on the next button to goes the School page
		And The user selects the suitable school.
		Then User clicks on the next button to goes the Finish page

	@eif8
	Scenario: Finish Page Features
		Given User launches the Finish page.
		Then User accepts admission term
		When User clicks on the check button
		And User clicks on the next button to goes the Parent page
		And User launches the Parent Information section.
		And User writes parent first name in the box
		And User writes parent last name in the box
		And User writes how did hear the school?
		And User writes parent contact information.
		And User writes on the email box.
		And User writes on the home phone box.
		And User writes address information.
		And User writes on the street box.
		And User writes on the home city box.
		And User writes on the state box.
		And User writes on the zip code box.
		And User clicks on the next button to goes the Student page
		And User writes student contact information.
		And User writes on the parent relation box.
		And User writes student first name in the box
		And User writes student last name in the box
		And User writes the date of birth in the box.
		And User writes gender in the box.
		And User selects the academic year.
		And User goes to Student Grade Level section
		And User selects the grade level.
		And User clicks on the next button to goes the School page
		And The user selects the suitable school.
		And User clicks on the next button to goes the Finish page
		And User clicks on the next button to goes the Finish page finish button
		Then User clicks on the finish button to complete the registration



