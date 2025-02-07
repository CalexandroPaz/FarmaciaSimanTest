@tag
Feature: open to the browser in FarmaciaSimanHN


  @tag1
  Scenario: open the browser
    Given User open the browser FarmaciaSiman
    When User click on search
    Then User look for acetaminofen
    And User click in search button
    And User user click in Acetaminofen Calmol Gotas

  @tag2
  Scenario: add purchase to the cart
    Given User click in Add to the cart
    When verify if the purchase was added
 
