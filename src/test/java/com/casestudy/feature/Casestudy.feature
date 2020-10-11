@Registrationform
Feature: Filling registration form  using automation testscript

Background: User login the application
Given User login the application

@Sc11
Scenario Outline: verify user enable to login functionality properly
Then verify user should  enter "<firstname>" in specific textbox
And  Verify user shoud enter "<lastname>" in textbox
And click on the next button
When click into new page
Examples:
|firstname|lastname|
|JULY|JOSEPH|

@Sc11
Scenario: Verify user enable to enter mailid properly
Then Verify user should enter mailid in specific textbox
And Verify user should enter mailid in confirmemail textbox
And Verify user should click on the next button
When Verify user should enter into new page

@Sc11
Scenario: Verify user enable to enter password properly
Then Verify user should enter password in specific textbox
And Verify user should enter password in confirmpassword  textbox
And Verify user should click on the next named button
When Verify user should observe new page

@Sc11
Scenario: Verify user enable to accept all conditions properly
Then Verify user should click on checbox for accepting user agreement
And user should click on previous button
When user should navigate to prevoius page
