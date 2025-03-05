Feature:  Whether it is divisible by 3, 5 or both

  Scenario Outline: It is or isn't divisible by 3, 5 or both
    Given Number is <dividend>
    When  I ask whether number is divisible by 3, 5 or both
    Then  Then the system returns <answer>
    Examples:
    | dividend | answer |
    | 3 | "Fizz" |
    | 5 | "Buzz" |
    | 15 | "FizzBuzz" |
    | 4  | "None"     |
    | 6 | "Fizz" |
    | 10 | "Buzz" |
    | 30 | "FizzBuzz" |
    | 8 | "None" |