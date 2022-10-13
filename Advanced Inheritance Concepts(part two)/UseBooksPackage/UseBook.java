/* 1. a. Create an abstract class named Book. Include a String field for the book’s title and
         a double field for the book’s price. Within the class, include a constructor that
         requires the book title, and add two get methods—one that returns the title and
         one that returns the price. Include an abstract method named setPrice().
         Create two child classes of Book: Fiction and NonFiction. Each must include a
         setPrice() method that sets the price for all Fiction Books to $24.99 and for all
         NonFiction Books to $37.99. Write a constructor for each subclass, and include a
         call to setPrice() within each. Write an application demonstrating that you can
         create both a Fiction and a NonFiction Book, and display their fields. Save the
         files as Book.java, Fiction.java, NonFiction.java, and UseBook.java.*/

import com.Kelvino.books.Book;
import com.Kelvino.books.Fiction;
import com.Kelvino.books.NonFiction;

public class UseBook
{
    public static void main(String[] args)
      {
         Fiction book1 = new Fiction("ALICE IN THE BORDER LAND");
         NonFiction book2 = new NonFiction("INTRODUCTION TO JAVA PROGRAMING");

         display(book1);
         display(book2);
      }

    public static void display(Book book)
      {
          System.out.println("\nTITLE: $" + book.getBookTitle() +
                 "\nPRICE: $" + book.getPrice());
      }
}