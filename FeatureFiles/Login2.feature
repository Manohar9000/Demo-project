
@Login
Feature: Login functinality;

@Smoke
Scenario Outline: User able to Login valid credentials;
Given If user is on home page;
When Click on login link;
And Enter The username As "<username>" and password as "<password>";
Then Verify logout link; 
Examples:
       | username|password|
       |   demo  |  1234  |
       


@Sanity
Scenario Outline: verify user is able to generate QRCode;
Given If user is on home page;
When Click on login link;
And Enter The username As "<username>" and password as "<password>";
And Click the payUser;
And Click the Recevier QRCode;
And Enter the Amount as "<Amount>";
And Enter the Text into Description "<Discript>";
Examples:
       | username|password|Amount|         Discript       |
       |   demo  |  1234  | 1200 | hi manohar Check money |

  
