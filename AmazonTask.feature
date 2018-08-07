#Author: your.email@your.domain.com

Feature: Place an order in Amazon

  Scenario Outline: Place Amazon Order
    Given User visits Amazon Page
    When User enters "<model>" in Search
    And Selects item <number>
    Then User should be directed to Cart page

    Examples: 
      | model  | number | 
      | iPhone 7 | 1| 
      | iPhone 7 Plus |2| 
