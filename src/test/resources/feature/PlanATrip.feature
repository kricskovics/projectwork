Feature: Plan a trip on the Budapest Go site

  Background:
    Given I open Budapest Go site
    And I accept privacy policy

  Scenario: Plan a trip
    When I plan a trip from "Örs vezér tere" to "Blaha Lujza tér"
    Then I should see some possible routes