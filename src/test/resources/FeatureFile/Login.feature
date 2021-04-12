Feature: Booking Room Functionality
Scenario Outline: Login in Adactin and fill the form and Book ticket

Given User in AdactinHotel page
When  User login with valid "<user name>" and "<password>" and user navigate to SearchHotel page
And   User choosing "<hotel Location>","<Hotel Name>" , "<Room Type>","<Number of room>" , "<Check in date>" , "<Check out date>" , "<Adults>" ,"<Children>" 
And   User click Search button and User go to the Select Hotel page 
And   User choose a Hotel in the list and click Continue button and User should be in payment page 
And   User Enter "<First Name>","<Last name>" and "<Billing Address>", "<Credit Card Num>" , "<Credit card type>" , "<Expiry Month>" ,"<Expiry Year>" and "<CVV Num>"
And   User click Book Now button and then user get the Booked Room details
Then  User click search hotel then moved to home page of search hotel
	


Examples:
|user name   |password|hotel Location|Hotel Name    |Room Type    |Number of room|Check in date|Check out date|Adults|Children|First Name|Last name|Billing Address| Credit Card Num  |Credit card type|Expiry Month|Expiry Year|CVV Num|
|BOJA1987    |8LZG23  |Sydney        |Hotel Creek   |Standard     |3             |10/04/2021   |12/04/2021    |2     |0       |Bhoja     |Rajan    |Chennai        | 1117778889999999 |Master Card     |January     |2022       |1234   |
#|BOJA1987    |8LZG23  |New York      |Hotel Hervey  |Super Deluxe |10            |16/04/2021   |22/04/2021    |4     |4       |Rajan     |Rajan    |Chennai        | 1117778889999999 |American Express|December    |2022       |1234   |
#|BOJA1987    |8LZG23  |Chennai       |Hotel         |Super        |888           |01/04/2021   |09/03/2021    |5     |5       |@#dfd     |12121!@  |Chennai        | 111777888999999  |Card            |January     |2021       |123    |
