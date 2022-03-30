
Feature: yahoo search 
 
  Scenario Outline: simple searrch
    Given I am on google search 
    When I put "<term>" search on google 
    Then I see lot of search camne up for yahoo

    Examples: 
  |Quality assurance|
  #|software testing|
  |news|
  
