Feature: Verify the screen of the option pages
  I, as a user
  require enter to the option error pages
  to view the screen displayed

  Scenario Outline: verify the description of the error
    Given that Geovanny enter to the page sahitest
    When enter to the option <option>
    And select the code <code>
    Then the message of the page <message>
    Examples:
      | option | code | message |