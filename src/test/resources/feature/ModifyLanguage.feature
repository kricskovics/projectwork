Feature: Modify the language on the Budapest Go site

  Rule: Language modification is possible to hungarian or english

    Background:
      Given I open Budapest Go site
      And I accept privacy policy

    Scenario: When I press the Hungarian flag button, language changes to Hungarian
      Given language is set to 'English'
      When I click on the 'Hungarian' flag
      Then language is changed to 'Hungarian'

    Scenario: When I press the English flag button, language changes to English
      Given language is set to 'Hungarian'
      When I click on the 'English' flag
      Then language is changed to 'English'