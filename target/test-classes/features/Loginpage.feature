Feature: verifying adactin credentials
Scenario: entering all details to book a hotel in adactin page
    Given go to Adactin page
    When user enters username
      | user | arulps013 |
      | pass | Ice@2795  |
    When user clicks login button
    Then verifying the details
    
    
    