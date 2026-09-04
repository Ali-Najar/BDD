Feature: Integer calculator multiplication, division and power

  Scenario: multiply two integers
    Given Two input values, 6 and 2
    When I press the * key
    Then I expect the result 12

  Scenario: divide two integers
    Given Two input values, 6 and 2
    When I press the / key
    Then I expect the result 3

  Scenario: raise an integer to a power
    Given Two input values, 6 and 2
    When I press the ^ key
    Then I expect the result 36

  Scenario Outline: calculate two integer inputs
    Given Two input values, <first> and <second>
    When I press the <opt> key
    Then I expect the result <result>

    Examples:
      | first | second | opt | result |
      | 6     | 2      | *   | 12     |
      | 6     | 2      | /   | 3      |
      | 6     | 2      | ^   | 36     |
      | -6    | 2      | *   | -12    |
      | -6    | -2     | *   | 12     |
      | 0     | 5      | *   | 0      |
      | 7     | 2      | /   | 3.5    |
      | -6    | 2      | /   | -3     |
      | 2     | 0      | ^   | 1      |
      | -2    | 3      | ^   | -8     |
      | 2     | -2     | ^   | 0.25   |

  Scenario: division by zero
    Given Two input values, 6 and 0
    When I press the / key
    Then I expect a division by zero error