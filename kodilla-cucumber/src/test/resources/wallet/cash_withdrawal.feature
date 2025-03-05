Feature: Cash Withdrawal
  Scenario Outline: Successful withdrawal from wallet in credit
    Given I have deposited <deposit> in my wallet
    When I request <request>
    Then I should get <cash>
    Examples:
      | deposit | request | cash |
      | 200     | 30      | 30   |
      | 200     | 200     | 200  |
      | 200     | 201     | 0 |
