Feature: Search for an address on the Budapest Go site

  Background:
    Given I open Budapest Go site
    And I accept privacy policy

  Scenario: Search address
    When I type 'Keleti pályaudvar' into Search for lines, stops and addresses field
    Then I get a dropdown menu with all the Stops and Line information on that address