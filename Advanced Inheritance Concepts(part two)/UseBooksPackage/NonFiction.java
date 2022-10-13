package com.Kelvino.books;

public class NonFiction extends Book
{
   public NonFiction(String title)
     {
         super(title);
         setPrice();
     }
 
   public void setPrice()
     {
         bookPrice = 37.99;
     }
}
