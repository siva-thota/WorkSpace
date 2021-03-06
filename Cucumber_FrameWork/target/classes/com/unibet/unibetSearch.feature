
Feature: Unibet Search

Scenario: Unbet Search
Given I go to "http://bet.unibet.co.uk" on "firefox"
And I click on "unisearchButton"
And I enter text into "unisearchtxtboxlocator" as "unisearchtxt"
And I click on "unibetsearchButton"
Then Search should be "unibetsearchresult"

Scenario: Special Character Search
Given I go to "http://bet.unibet.co.uk" on "firefox"
And I click on "unisearchButton"
And I enter text into "unisearchtxtboxlocator" as "specialcharacter1"
And I click on "unibetsearchButton"
Then Search should be "specialcharacter1result"

Scenario: No results for Invalid Search
Given I go to "http://bet.unibet.co.uk" on "firefox"
And I click on "unisearchButton"
And I enter text into "unisearchtxtboxlocator" as "invalidsearchtxt"
And I click on "unibetsearchButton"
Then Search should be "noresults"