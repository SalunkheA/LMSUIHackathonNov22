Feature: Header Validation

Scenario: Validating the heading of Registration form
    Given Admin/User/Staff Logged on to "https://lms-frontend-phase2.herokuapp.com/login"
    When Admin/User/Staff lands on Registration page
    Then Admin/User/Staff sees the heading on the form as "Registration Form"