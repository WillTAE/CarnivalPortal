Feature: Search Cruisers in Carnival Portal
@QA
  Scenario: Search a 6-9 days cruiser to The Bahamas
    Given User navigates to https://www.carnival.com page
    When User search a cruiser to The Bahamas with duration of 6-9 days
    Then User should be taken to Search Results page
    And A grid of results should be displayed with the cheapest value by default

