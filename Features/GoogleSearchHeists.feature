Feature: perform a google search 

Scenario Outline: simple keybopard search 

Given I am on the google homepage
When I enter search "<keyword>"
And I click on google search button
Then I see the number of results return

Examples:
| keyword          |
|Quality assurance |
#|Software engineering				 |

