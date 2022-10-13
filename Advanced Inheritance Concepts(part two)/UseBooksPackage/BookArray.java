/* b. Write an application named BookArray in which you create an array that holds
      10 Books, some Fiction and some NonFiction. Using a for loop, display details
      about all 10 books. Save the file as BookArray.java*/

import com.Kelvino.books.Book;
import com.Kelvino.books.Fiction;
import com.Kelvino.books.NonFiction;
import javax.swing.*;

public class BookArray
{
    public static void main(String[] args)
       {
          String entry;
          int input;
          Book[] bookArray = new Book[10];

          for(int i = 0; i < bookArray.length; ++i)
             {
                 entry = JOptionPane.showInputDialog(null,
                      "Choose which book to create \n1.Fiction \n2.NonFiction");
                 input = Integer.parseInt(entry);

                  if(input == 1)
                     {
                         String title = JOptionPane.showInputDialog(null,
                                 "Enter the book's title;");
                          bookArray[i] = new Fiction(title);
                     }
                  else if(input == 2)
                     {
                          String title = JOptionPane.showInputDialog(null,
                                 "Enter the book's title;");
                          bookArray[i] = new NonFiction(title);
                     }
             }

           for(int i = 0; i < bookArray.length; ++i)
                {
                   display(bookArray[i]);
                }
       }

    public static void display(Book book)
       {
            System.out.println("\nTITLE: $" + book.getBookTitle() +
                 "\nPRICE: $" + book.getPrice());
       }
}