Feature: SignUp Functionality
Scenario: verify the user is able to Sighnup valid credential Details
Given if user is on Homepage
When Click on the Create new Account Button
And Enter the FirstName as "<FirstName>" and LastName as "<LastName>"
And Enter the MobileNumber as "<Mobile>" and Password as "<Password>"
And Select the Date  and Month and Year
And Click on the Male RadioButton
Then Verify the SignUp button and Click on the SignUP button

Examples:

|FirstName|LastName |Mobile    |Password|
|kishore  |Kalahasti|8853545454|123456  |

