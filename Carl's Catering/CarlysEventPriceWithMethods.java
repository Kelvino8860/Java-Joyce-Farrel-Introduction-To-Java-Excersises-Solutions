import java.util.Scanner;
public class CarlysEventPriceWithMethods
{  public static void main(String[] args)
     {  numberOfGuests();
        displayMotto();
        computePrice(numberOfGuests());
        }
public static int numberOfGuests()
     {  int noGuest;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Number of guests >> ");
        noGuest = inputDevice.nextInt();
          return noGuest;
  }
public static void displayMotto()
      {
         System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
         System.out.println("xx                                                     xx");
         System.out.println("xx  Carly's makes the food that makes it a party       xx");
         System.out.println("xx                                                     xx");
         System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
           }  
public static void computePrice(int guests)
     {   int totalPrice;
        boolean isEquall;
        final int isLarge = 50;
        final int pricePerInd = 35;
        totalPrice = guests * pricePerInd;
        isEquall = guests >= isLarge;
        System.out.println("Total number of guests are >> " + guests + "\nPrice per guest is >> " +
                         pricePerInd + "\nTotal price is >> " + totalPrice + "\nThe event was classified as a large event >> " +
                         isEquall); 
       }
}