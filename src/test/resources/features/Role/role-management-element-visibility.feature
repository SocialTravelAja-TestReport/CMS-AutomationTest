@role
Feature: Role Management Element Visibility

  Background: User already on role management page
    Given User already login as Admin
    And User go to role management page by url

  #TODO create automation

  @Manual
  @Manual:Passed
  Scenario: Verify critical element visibility
    When User Verify critical element visibility
    Then All element listed below is visible:
      | User Name Field    |
      | Search Bar         |
      | Tambah Role Button |
      | List Role          |

  @Manual
  @Manual:Passed
  Scenario: Verify column visibility
    When User verify column visibility
    Then All column listed below is visible:
      | No         |
      | Nama Role  |
      | List Fitur |
      | Aksi       |

  @Manual
  @Manual:Passed
  Scenario: Verify action button visibility
    When User verify action button visibility
    Then All action button below is visible:
    | Edit Button|
    | See Detail Button|
    | Delete Button    |