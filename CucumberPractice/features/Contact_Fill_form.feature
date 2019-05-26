Feature: contact fill form senario
 
 @contacts_Form
Scenario Outline: To verify that user should be able to fill contact form
 Given User should have on login Page
 #When enter user details 
 #|swapnil7004|swapnil22|
 When enter user credentials excle
 #And User enters UserName and Password
 # And user enters valid credentials as "Swapnilv215@gmail.com" and "swapnil22"
 Then Message displayed crm Login Successfully again
 Then mouse hover on contacts option
 Then Click on the new contact option "<fristname>" and "<lastname>" and "<company>" and "<position>" and "<mobile>"
 
 Examples:
         |fristname | lastname |  company| position| mobile |
         |Swapnil    | Vyawahare | Ioconnect|QA eng   |9028971601 |