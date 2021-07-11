Feature: Online shopping

@OrderTshirt
Scenario Outline:  To order T-shirt and verify the order history

    Given A user is in Online shopping website
    And user clicks on Sign In link
    When user enters "<username>","<password>" in the signin page
    And user click on Signin button
    Then user enters "<category>" in the searchbox
    And user clicks on Add to cart button
    Then user clicks on Proceed to checkout in cart page
    And user clicks on Proceed to checkout in summary page
    And user clicks on Proceed to checkout in address page
    Then user clicks on Terms and service checkbox
    And user clicks on Proceed to checkout in shipping page
    Then user chooses  pay by bank wire payment method
    Then user confirms order
    Then user click on Back to orders link
    And user verify the order in the order history page
    Then user signout from the website
  
   Examples:   
    | username  | password | category  |
      | SeleniumTesting_1@gmail.com |Selenium123 | T-shirt |
      
  @UpdateFirstname
  
  Scenario Outline:  To update personal information First name in the  user account
  Given A user is in Online shopping website
    And user clicks on Sign In link
    When user enters "<username>","<password>" in the signin page
    And user click on Signin button
    Then user clicks on user profile link
    Then user clicks on My personal information link
    And user updates "<firstname>" and enters "<password>"
    And user clicks on Save button
    Then verify the successful update message
    Then user signout from the website

    Examples: 
       | username  | password | firstname  |
      | SeleniumTesting_1@gmail.com | Selenium123| Natwest |
 