@role
Feature: Role Management Search Bar

  Background: User already on Role Management Page
    Given User already login as Admin
    And User navigate to Role Management Page

  Scenario: Verify search by Nama Role
    When User search by Nama Role "Admin"
    Then Role with Nama Role "Admin" appeared

  Scenario: Verify search by Privilege
    When User search by privilege "main-menu"
    Then Role with privilege "main-menu" appeared

  Scenario: Verify search by null value
    When User search by null value
    Then All role displayed