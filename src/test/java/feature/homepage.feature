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


