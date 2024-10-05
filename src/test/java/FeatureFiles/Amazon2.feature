
Feature: Amazon visit



  Scenario Outline: search a tshirt from amazon
    Given user is on google home page
    And user search "<sitename>" in google
    And user have to select the first option
    When user search "<tshirt_company>" in searchbox of amazon
    Then user landed the list of product
    And user verify the list

    Examples: 
      | sitename  | tshirt_company |
      | amazon    | Allen Solly    |