Feature: Add experience positive test

  @as
  Scenario: Add experience positive test 1
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!" credentials
    Then The user should be able to login
    Then The welcome message contains "Teacher"
    When The user clicks "Add Experience"
    Then The user should land on Add An Experience page
    And The user fills "Job Title" field as "QA Engineer"
    And The user fills "Company" field as "Oracle"
    And The user fills "Location" field as "New York"
    And The user picks "From Date" as "01/05/2021"
    And The user picks "To Date" as "05/05/2023"
    And The user fills "Job Description" field as "Quality Assurance"
    And The user click the submit button
    Then The user should see the experince added message

  Scenario: Add experience positive test 2
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!" credentials
    Then The user should be able to login
    Then The welcome message contains "Teacher"
    When The user clicks "Add Experience"
    Then The user should land on Add An Experience page
    When The user fills experience form and submit
      | Job Title       | QA Engineer       |
      | Company         | Oracle            |
      | Location        | New York          |
      | From Date       | 01/05/2021        |
      | To Date         | 05/05/2023        |
      | Job Description | Quality Assurance |
    And The user click the submit button
    Then The user should see the experince added message


