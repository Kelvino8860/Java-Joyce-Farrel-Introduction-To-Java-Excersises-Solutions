import java.util.Scanner;
public class SammysRentalPriceWithMethods
{public static void main(String[]  args)
  { rentalTime();
    companyMotto();
    computeTime(rentalTime());
             }
public static int rentalTime()
   { int minutes;
     Scanner inputDevice = new Scanner(System.in);
     System.out.print("Enter number of minutes >> ");
     minutes = inputDevice.nextInt();
     return minutes;
         }
public static void companyMotto()
   {   System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
       System.out.println("SsSs                                                SsSs");
       System.out.println("SsSs   Sammy's makes it fun in the sun              SsSs");
       System.out.println("SsSs                                                SsSs");
       System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
         }
public static void computeTime(int time)
   {int noHours;
    int remainingMin;  
    int totalPrice;
    final int minToHours = 60;
    final int costPerHour = 40;
    final int costAddMin = 1;
    noHours = time/minToHours;
    remainingMin = time%minToHours;
    totalPrice = (costPerHour*noHours) + (costAddMin*remainingMin);
    System.out.println("Total number of minutes >> " + time + "\nTotal number of hours >> " +
                        noHours + "\nAdditional minutes >> " + remainingMin + "\nTotal price >>$" + totalPrice);
    
   }
}
  