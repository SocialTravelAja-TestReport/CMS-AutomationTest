@role
Feature: Tambah Role Page

  Background: User already on Role Management Page
    Given User already login as Admin
    And User navigate to Role Management Page

  Scenario: Verify accessing Tambah Role page by button
    When User click Tambah Role Button
    Then Tambah Role Page appeared

  Scenario: Verify accessing Tambah role by url
    When User go to Tambah Role page by URL
    Then Tambah Role Page appeared

  Scenario: Verify Tambah Role Modal element visibility
    When User go to Tambah Role page by URL
    Then Element listed below appeared
      | Nama role Field                        |
      | List Fitur and Access Privilege column |
      | Parameter                              |
      | Radio Button                           |

  Scenario: Verify if Nama Role field is mandatory
    When User go to Tambah Role page by URL
    Then There is asterix in Tambah Role Field title

  Scenario: Verify Cancel button visibility and functionality
    When User go to Tambah Role page by URL
    And User click Cancel button
    Then User is on Role Management page