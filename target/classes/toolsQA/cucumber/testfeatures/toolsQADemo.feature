@ToolQa
Feature: ToolQa Registration feature

  @firstname&lastname
  Scenario: ToolQa Registration page
    Given The User is in Registration Page
    When The User is entering the firstname and lastname
      | firstname | lastname |
    Then The User is verifying the entered values in firstname and lastname

  @MaritalStatus
  Scenario Outline: verifying Marital Status field
    Given The User is in Registration Page
    When The user selects the marital status "<maritalstaus>"
    Then The user verifies the selected value "<maritalstaus>"

    Examples: 
      | maritalstaus |
      | single       |
      | married      |
      | divorced     |

  @Hobby
  Scenario Outline: verifying Hobby field
    Given The User is in Registration Page
    When The user selects the Hobby  "<hobby>"
    Then The user verifies the selected value in hobby "<hobby>"

    Examples: 
      | hobby   |
      | dance   |
      | reading |
      | cricket |

  @phoneno,username&email
  Scenario: ToolQa Registration page
    Given The User is in Registration Page
    When The User is entering the phoneno username and email
      | 9999954265 | password | a@aol.in |
    Then The User is verifying the entered values in phoneno password and email
