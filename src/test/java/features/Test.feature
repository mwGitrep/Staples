Feature: To verify API automation with Rest Assured

  Scenario: To verify Rest service - GET Method
    Given I want to execute List Users endpoint
    When I submit the GET request
    Then I should get 200 Success Status code

  Scenario: To verify Rest service - POST Method
      Given I want to execute login endpoint
      When I submit the POST Method
      Then I should get token
