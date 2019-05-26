Feature: This is the Amezon Test for logibn


 @validLogin
Scenario: Login with valid credentials
 Given User is on Home Page
 When User Navigate to LogIn Page
 #And User enters UserName and Password
 And user enters valid credentials as "Swapnilv215@gmail.com" and "swapnil22"
 Then Message displayed Login Successfully
 
 @validTest
 Scenario: To verify user should be logout
 Given  User is on Home Page
 When User Navigate to LogIn Page
 And User enters UserName and Password
 And move mouse on account option
 Then Then user should be logout
 
  @validLogin
Scenario Outline: Login with valid credentials
 Given User is on Home Page
 When User Navigate to LogIn Page
 #And User enters UserName and Password
 #And user enters valid credentials as "Swapnilv215@gmail.com" and "swapnil22"
 And User enters "<username>" and "<password>"
 Then Message displayed Login Successfully

 Examples:
 | username            | password |
 | testuser_1          | Test@153 |
 |Swapnilv215@gmail.com| swapnil22|
 
   @validLogin3
Scenario: Login with valid credentials and serach product
 Given User is on Home Page
 When User Navigate to LogIn Page
 #And User enters UserName and Password
 And user enters valid credentials as "Swapnilv215@gmail.com" and "swapnil22"
 Then Message displayed Login Successfully
 When go to search tab 
 And eneter product to search
 |lenovo|
 |mobile|
 Then product serached sucessfylly
 
 
 
 
 