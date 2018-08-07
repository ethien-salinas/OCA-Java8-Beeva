Exercise 8-2

In the Item class:
1. Write a setItemFields method that takes 3 args and assigns them 
     to desc, quantity, and price fields.  The method returns void. 
2. Write an overloaded setItemFields method that takes 4 args and 
     returns an int.  The method assigns all 4 fields.  Invalid value for 
     the colorCode arg is ' ' (a single space)
   If the colorCode arg is invalid, return -1 without assigning the value.
   If the colorCode is valid, assign the colorCode field and then assign 
     the remaining fields by calling the 3 arg method.

In the ShoppingCart class:
3. Call the 3-arg setItemFields method and then call item1.displayItem()
4. Call the 4-arg setItemFields method, checking the return value.  
     If the return value < 0, print an invalid color code message,
     otherwise call displayItem.
   