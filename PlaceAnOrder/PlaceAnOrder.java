/* 12. A company accepts user orders for its products interactively. Users might make the
       following errors as they enter data:

            The item number ordered is not numeric, too low (less than 0), or too high (more
            than 9999).

            The quantity is not numeric, too low (less than 1), or too high (more than 12).

            The item number is not a currently valid item.

       Although the company might expand in the future, its current inventory consists of
       the items listed in Table

       Item Number    Price ($)
         111          0.89
         222          1.47
         333          2.43
         444          5.99
 
      Create a class that stores an array of usable error messages; save the file as
      OrderMessages.java. Create an OrderException class that stores one of the messages;
      save the file as OrderException.java. Create an application that contains prompts
      for an item number and quantity. Allow for the possibility of nonnumeric entries as
      well as out-of-range entries and entries that do not match any of the currently available
      item numbers. The program should display an appropriate message if an error has
      occurred. If no errors exist in the entered data, compute the user’s total amount due
      (quantity times price each) and display it. Save the program as PlaceAnOrder.java.*/


import java.util.*;

public class PlaceAnOrder implements OrderMessages
{
    public static void main(String[] args)
      {
         int itemNum, quantity = 0, i, index = 0;
         boolean available = false, quantityAllowed = false;
         double price;
         int[] itemsAvail = {111, 222, 333, 444};
         double[] priceItem = {0.89, 1.47, 2.43, 5.99};

         Scanner input = new Scanner(System.in);
         
         try
          {
            System.out.print("Enter Item Number >> ");
            itemNum = input.nextInt();
               if(itemNum < 1)
                 throw(new OrderException(1));
               if(itemNum > 9999)
                 throw(new OrderException(2));
               for(i = 0; i < itemsAvail.length; ++i)
                {
                   if(itemNum == itemsAvail[i])
                       {
                          available = true;
                          index = i;
                          break;
                       }
                }
             if(available == false)
           System.out.println(messages[6]);
          }
        catch(InputMismatchException e)
          {
             System.out.println(messages[0]);
          }
        catch(OrderException e)
          {
             System.out.println(e.getMessage());
          }

            input.nextLine();
             
            
       try
        {
              System.out.print("Enter Quantity >> ");
            quantity = input.nextInt();
               if(quantity < 1)
                throw(new OrderException(4));
               if(quantity > 12)
                 throw(new OrderException(5));
               if(quantity > 0 && quantity < 13 && available == true)
                 quantityAllowed = true;
        }
        catch(InputMismatchException e)
          {
             System.out.println(messages[3]);
          }
        catch(OrderException e)
          {
             System.out.println(e.getMessage());
          }


         if(available == true && quantityAllowed == true)
           {
              price = quantity * priceItem[index];
              System.out.println("TOTAL PRICE: $" + price);
           }

            System.out.println("END OF PROGRAMME");
      }
}
















