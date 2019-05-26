 Feature: this is freecrm site test
 
 @contacts
Scenario: To verify that user should be login with valid credentials
 Given User is on login Page
 When user enter "swapnil7004" and "swapnil22"
 #And User enters UserName and Password
 # And user enters valid credentials as "Swapnilv215@gmail.com" and "swapnil22"
 Then Message displayed crm Login Successfully