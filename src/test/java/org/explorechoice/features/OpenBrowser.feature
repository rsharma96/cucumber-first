Feature: As an admin user, I should able to login to hubspot crm

  Scenario: To validate the login functionality of hubstop crm with valid credentials
    Given I am able to open hubspot CRM url
    When I enter valid username "sharma.rajeshwar6@gmail.com"
    And I enter valid password "Rajeshwar@96"
    Then I should able to login successfully
    And I should able to see "Restart Demo"