Feature: Swab Lab Demo

  Scenario Outline: Swag Lab Order Placement
    Given user launch the sawglab application
    When user enter username as <username> and password as <password>
    Then user click on login button in the login page
    And verify that user landed on inventory page
    And user close the browser

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |