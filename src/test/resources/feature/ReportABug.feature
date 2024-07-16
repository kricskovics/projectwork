Feature: Report a bug on the Budapest Go site

  Background:
    Given I open Budapest Go site
    And I accept privacy policy

  Scenario: Report a bug
    When I Start a Report a bug
    Then Report bug page opens