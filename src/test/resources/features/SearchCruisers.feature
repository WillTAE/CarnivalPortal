Feature: Search Cruisers in Carnival Portal
  Background: Navigate to Carnival portal
    Given User navigates to https://www.carnival.com page
  @QA1
  Scenario: Search a 6-9 days cruiser to The Bahamas
    When User search a cruiser to The Bahamas with duration of 6-9 days
    Then User should be taken to Search Results page
    And A grid of results should be displayed with the cheapest value by default
  @QA2
  Scenario: User choose a trip and is redirected to Itinerary page
    And User search a cruiser to The Bahamas with duration of 6-9 days
    When A user choose a sail from Search Results page
    Then The user should be taken to ITINERARY page

