Feature: Comparing the Release date and Extract Country of "Pushpa: The Rise" on IMDB and Wiki

  Scenario: To Validate Release Date and Extract Country of movie Pushpa 
    Given User Navigates to the Imdb website
    When User enters the search terms in the search bar 
    Then User clicks on the search icon 
    Then User selects Pushpa Part 1 from the options 
    Then User checks the Extract Country and  Release date on Imdb
	Then User navigates to the Wiki website
	And User enters the search terms in the search bar in wikipedia
	Then User clicks on the search icon in Wikipedia
	Then User selects Pushpa Part 1 from the search result
	Then User checks the Extract Country and Release date on Wiki
	Then User compares the Release date and Extract Country
	

