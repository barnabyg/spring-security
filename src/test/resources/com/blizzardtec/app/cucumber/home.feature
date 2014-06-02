Feature: Visit the homepage

As a user
I want to visit the homepage
so that I can see the homepage

@home
Scenario: Visit homepage
    Given I visit the homepage
    When I load the homepage
    Then I can see the title