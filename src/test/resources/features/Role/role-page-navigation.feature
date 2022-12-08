@role
Feature: Page Navigation

  Scenario: Verify navigating page trough nav bar
    Given User already login as Admin
    When User navigate to Role Management Page
    Then User is on Role Management page

  Scenario: Verify navigating page trough directly typed
    Given User already login as Admin
    When User go to role management page by url
    Then User is on Role Management page