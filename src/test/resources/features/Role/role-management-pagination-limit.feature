@role
Feature: Role Management Pagination Limit

  @Manual
  @Manual:Passed
  Scenario: Verify pagination limit of data shown in Role Management page is 10
    Given USer already on Role Management Page
    When User check data shown per page
    Then Data shown per page is less than equal 10