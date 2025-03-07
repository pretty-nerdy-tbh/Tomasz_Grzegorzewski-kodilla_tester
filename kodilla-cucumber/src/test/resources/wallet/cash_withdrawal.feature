Feature: Cash Withdrawal
  Scenario Outline: Successful withdrawal from wallet in credit
    Given I have deposited <deposit> in my wallet
    When I request <request>
    Then I should get <cash>
    Examples:
      | deposit | request | cash |
      | 200     | 30      | 30   |
      | 200     | 200     | 200  |
      | 200     | 201     | 0    |
      | 200     | 0       | 0    |
      | 200     | -30     | 0    |
      | -200    | 30      | 0    |
      | -200    | 200     | 0    |
      | -200    | 201     | 0    |
      | -200    | 0       | 0    |
      | -200    | -30     | 0    |
      | 0       | 30      | 0    |
      | 0       | 200     | 0    |
      | 0       | 201     | 0    |
      | 0       | 0       | 0    |
      | 0       | -30     | 0    |