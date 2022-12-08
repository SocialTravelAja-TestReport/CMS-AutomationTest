@role
Feature: Role ManagementAuthentication

  Scenario: Verify accessing page without authorization
    Given User is on login page
    When User go to role management page by url
    Then User is redirected to login page

  Scenario: Verify accessing page with authorized credentials
    Given User already login as Admin
    When User go to role management page by url
    Then User is on Role Management page

  Scenario: Verify accessing page with unauthorized credentials
    Given User already login as Unauthorized User
    When User go to role management page by url
    Then User is redirected to login page