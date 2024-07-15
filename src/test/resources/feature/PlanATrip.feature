Feature: Plan a trip on the Budapest Go site

  Background:
    Given I open Budapest Go site
    And I accept privacy policy

  Scenario: Plan a trip
    When I enter text '' into from field
    And I enter text '' into to field
    And I click on Plan button
    Then I should see some Suggested itineraries