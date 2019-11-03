
```
---
Android App (Tip Calculator)
Author: Mudit Prashar
date: 10/07/2019
---
```
# Tip Calculator!

Tip Calculator is an app that calculates the tip and total  **Each Person** would pay when people splits the bill with other members of the party. This app is accessible offline. 

# Calculations
The first Input field  is for **Check Amount** where you can enter the total amount of the bill. 
The Second Input field is for **Party Size** where you can input the total number of people splitting the bill.
Both of these Input fields **restricts** negative values and only allow positive numeric values. 
**Check Amount** allows decimals as well as integers.
 **Party Size** only allow integers.
The App throws an **error**  if either the **Check Amount** field or **Party Size** field is empty. 
Once you input both values, you can hit the **COMPUTE TIP** button to see the results.
The Tip percentage outputs are calculated by dividing the **Check Amount** by the **Party Size** and then multiplied by (.**Percentage Number **) and the result is rounded to the **nearest integer** using Math.round(). The Total is rounded to **nearest integer** as well. 
 For example the tip & total output for **15%** would be calculated as following: 
				
`Tip for 15% = ((Check Amount/Party Size)* .15)`

`Total per person for 15% tips = ((Check Amount/Party Size) + ((Check Amount/Party Size)* .15))`
