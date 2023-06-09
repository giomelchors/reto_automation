Feature: Verify the screen of the option pages
  I, as a user
  require enter to the option error pages
  to view the screen displayed

  Scenario: verify the description of the error
    Given that Geovanny enter to the page sahitest
    When enter to the option Error Pages
    And  select the code 500 page
    Then the screen should display the message "HTTP ERROR 500"

