Feature: This is the Amezon Test for logibn


 @validLogin
Scenario: Login with valid credentials
 Given User is on Home Page
 When User Navigate to LogIn Page
 And User enters UserName and Password
# And User enters valid "Swapnilv215@gmail.com" and "swapnil22"
 Then Message displayed Login Successfully
 
 @validTest
 Scenario: To verify user should be logout
 Given  User is on Home Page
 When User Navigate to LogIn Page
 And User enters UserName and Password
 And move mouse on account option
 Then Then user should be logout