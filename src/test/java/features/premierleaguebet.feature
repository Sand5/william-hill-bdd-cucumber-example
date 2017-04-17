Feature: Place a bet for an English premier league game

  As a WH Customer I want the ability to place a bet on a English Premier League event

  Scenario: English Premier League bet

    Given I am on the William Hill homepage
    When  I select the football option
    And   I select the competitions option
    And   I select an english premier league club "Bournemouth" and place a "0.05" bet
    Then  the odds and returns for club "Bournemouth"  offered are displayed correctly
