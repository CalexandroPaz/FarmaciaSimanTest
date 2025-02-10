@test2
Feature: Multiple Products

  @open
  Scenario: Open the webside
    Given user open the webside
    When user close any popup

  @MultipleChoise
  Scenario Outline: Choice multiple products
    Given user search for "<products>"
    When user search and verify the product is the correct

    Examples: 
      | products     |
      | Acetaminofen |
      | tosan D      |
