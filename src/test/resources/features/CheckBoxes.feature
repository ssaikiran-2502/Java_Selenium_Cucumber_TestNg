
##----------------Test to verify if checkboxes in The Internet site is working fine---------------------##
Feature: to validate checkboxes
  Scenario: Validate checkboxes in Internet page
    Given User login's to the Internet homepage
    When clicked on checkboxes option
    Then checkboxes page pop's up
    Then validate if you can able to check the 1st check box and uncheck the 2nd checkbox