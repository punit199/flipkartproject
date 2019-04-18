@FunctionalTest
Feature: filpkat home page
@EndToEndTesting 
Scenario: Login to filpkat
Given close the popup
When login to filpkat
And capture the all mobile brand name
Then search particular brand

@EndToEndTesting
Scenario: get the current deal time
Given close the popup
When login to filpkat
And capture the deal time from application

@SmokeTesting @first
Scenario: select the mi phone with range 10000 to 20000
Given close the popup
When login to filpkat
And enter the "mobile" in search box and enter
Then set the range and verify the range
Then select the ram for ph
And get all the sujjected phone in ui



