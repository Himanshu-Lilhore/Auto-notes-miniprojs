Feature: Login File
Scenario: To test the Login Page

When we open the browser
Then we navigate to facebook website
Given we enter the mail <myEmail>
And we also enter the password <myPassword>
And close the browser

Examples:

| myEmail | myPassword |
| himanshu@gmail.com | PaSSwOrd |