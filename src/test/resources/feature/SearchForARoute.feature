Feature: Search for a route on the Budapest Go site

  Background:
    Given I open Budapest Go site
    And I accept privacy policy

  Scenario: Look up routs
    When I type "907" into search for lines, stops and addresses field
    And select "907" in the drop down menu
    Then I get shown the Page with line details and schedule