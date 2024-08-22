@Manohar
Feature: vouchar functionality;
Scenario Outline: user able to generate vouchar payment;
Given If user is on home page;
When Click on login link;
And Enter The username As "<username>" and password as "<password>";
And click on the voucher link;
And click on the Business Directory link;
And Enter the business directorys details;
And enter the Keywords as a" <Ann's Cafe>";
And click on the make payment link;
And Enter the amount as "<1200>";
And enter the Payment user details and Discript as "<hi manohar>";

Examples:
       
       | username|password| 
       |   demo  |  1234  |
      
