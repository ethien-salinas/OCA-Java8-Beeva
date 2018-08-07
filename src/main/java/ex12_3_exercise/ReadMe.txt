Exercise 12-3

(The Item class is the same as it was in exercise 12-1.)

In the Shirt class:
1.  Add a public getColor method that converts the colorCode field 
      into the corresponding color name (example: 'R' = "Red"). Include
      at least 3 colorCode/color combinations.  
2.  Use a switch statement in the method and return the color String. 

In the ShoppingCart class:
3.  Declare and instantiate a Shirt object using an Item reference type.
      Call the 3-arg constructor to assign values.
4.  Call the display method of the object.
5.  Use instanceof to confirm that the object is, indeed, a Shirt.
6.  If it is a Shirt, 
      - cast the object to a Shirt and call the getColor method, assigning 
        the return value to a String variable.
      - Print out the color name using a suitable label.
7.  If it is not a Shirt, print a message to that effect.
8.  Test your code.  You can test the non-Shirt object condition
      by instantiating an Item object instead of a Shirt object.