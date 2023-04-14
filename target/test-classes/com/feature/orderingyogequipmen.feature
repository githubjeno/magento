Feature: Ordering yoga equipment 

Scenario: Enters the site and selects his yoga equipment
  Given user enter the url
  When user hover over Gear menu and clicks fitness equipment
  And selects yoga companion kit
  And user clicks on Customize and add to cart
  And user changes according to his customizaton if required and click Add to cart
  
Scenario: user makes checkout by entering the required information
When user clicks on cart icon and clicks on proceed to checkout  
And enters the valid emailaddress "dafdafdsf@gmail.com" 
And entesr his firstname "myfirstnamegreen" and lastname "lastgreen"
And company name "greentechnologies" 
And streeaddress line1 "anna nagar" line2 "annatower" line3 "near amman mess"
And city "anna nagar"
And selects country "India" 
And selects state "Tamil Nadu"
And enters his postalcode
And enters his phoneno
And clicks on next icon

Scenario: user reviews the selected product and places the order
When user reviews the order placed and clicks on place order
Then get the order no and print it

  