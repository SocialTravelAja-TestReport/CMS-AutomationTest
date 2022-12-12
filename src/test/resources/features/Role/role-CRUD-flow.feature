@role
Feature: CRUD flow

  Background: User already on Role Management Page
    Given User already login as Admin
    And User go to role management page by url

  Scenario: Verify view detailed role information
    When User click detailed role information
    Then Detailed role information shown

  Scenario: Verify edit role functionality
    When User click edit role button
    Then Modal edit Role Page shown

  @Manual
  @Manual:Passed
  Scenario: Verify create new role without privilege
    Given User create new role without privilege
    When User click Simpan button
    Then Data is not saved

  @Manual
  @Manual:Passed
  Scenario: Verify create new role with valid privilege
    Given User edit role with some privilege
    When User click Simpan button
    Then Data is saved

  @Manual
  @Manual:Failed
  Scenario: Verify if Nama Role is unique
    Given User edit Nama Role with already registered Nama Role
    When User click Simpan button
    Then Data is not saved

  Scenario: Verify create new role by multiple tap
    Given User create new role with random name
    And User create role with some privilege
    When User click Simpan button 5 times
    Then Only one data is saved

  @Manual
  @Manual:Passed
  Scenario: Verify create new role with blank nama role
    When User create new role with blank Nama Role
    And User create role with some privilege
    Then Simpan button is not clickable

  Scenario: Verify create new role functionality
    Given User create new role with some privilege
    When User click Simpan button
    Then Data is saved
    And User redirected to Role Management Page

  Scenario: Verify delete role functionality
    Given User delete a role
    And Delete confirmation modal appear
    When User click confirm delete a role
    Then Data deleted

  Scenario: Verify edit role privilege only
    When User click edit role button
    And User edit role with some privilege
    Then Modal success update privilege appeared