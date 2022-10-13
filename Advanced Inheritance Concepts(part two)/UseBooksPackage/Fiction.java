package com.Kelvino.books;

public class Fiction extends Book
{
    public Fiction(String title)
       {
          super(title);
          setPrice();
       }

    public void setPrice()
       {
         bookPrice = 24.99;
       }
}