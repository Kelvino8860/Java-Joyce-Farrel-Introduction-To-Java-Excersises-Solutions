package com.Kelvino.books;

public abstract class Book
{
   private String bookTitle;
   protected double bookPrice;

   public Book(String title)
     {
         bookTitle = title;
         getBookTitle();
         getPrice();
     }
   public abstract void setPrice();
   public String getBookTitle()
     {
        return bookTitle;
     }
   public double getPrice()
     {
        return bookPrice;
     }
}