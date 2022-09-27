/* 10. Morgan’s Department Store distributes bonuses to its salespeople after the holiday
       rush. Table 9-6 shows the bonuses, which are based on full weeks worked during the
       season and the number of positive online customer reviews. Write a program that
       allows a user to continuously enter values for the two bonus-determining factors
       and displays the appropriate bonus. Save the file as MorgansBonuses.java.

                                       Positive Reviews Received
               Full Weeks Worked   0      1      2       3       4 or More
                               0   5.00   9.00   16.00   22.00   30.00
                               1   10.00  12.00  18.00   24.00   36.00
                               2   20.00  25.00  32.00   42.00   53.00
                               3   32.00  38.00  45.00   55.00   68.00
                               4   46.00  54.00  65.00   77.00   90.00
                               5   60.00  72.00  84.00   96.00   120.00
                        6 or more  85.00  100.00 120.00  140.00  175.00
        
                           Table 9-6 Morgan’s Department Store bonuse*/


import java.util.Scanner;

public class MorgansBonuses{

     public static void main(String[]  args){

              double[][] table = {{5.00, 9.00, 16.00, 22.00, 30.00},
                                  {10.00, 12.00, 18.00, 24.00, 36.00},
                                  {20.00, 25.00, 32.00, 42.00, 53.00},
                                  {32.00, 38.00, 45.00, 55.00, 68.00},
                                  {46.00, 54.00, 65.00, 77.00, 90.00},
                                  {60.00, 72.00, 84.00, 96.00, 120.00},
                                  {85.00, 100.00, 120.00, 140.00, 175.00}};

            Scanner input = new Scanner(System.in);
            int week, reviews;

              do{
                   System.out.print("Enter an integer to represent full weeks worked or (999 to quit) >> ");
                   week = input.nextInt();
                   System.out.print("Enter an integer to represent positive reviews received >> ");
                   reviews = input.nextInt();
                 
                       if(reviews >= 4 && week < 6){
                             System.out.println("Your sales bonus is >> $" + table[week][4]);
                           }
                       else if(week >= 6 && reviews < 4){
                                  System.out.println("Your sales bonus is >> $" + table[6][reviews]);
                                }
                       else if(week >= 6 && reviews >= 4){
                             System.out.println("Your sales bonus is >> $" + table[6][4]);
                          }
                       else if(week < 6 && reviews < 4 && week >= 0 && reviews >= 0){
                             System.out.println("Your sales bonus is >> $" + table[week][reviews]);
                          }
                       else if(week < 0 || reviews < 0){
                             System.out.println("ERROR!!!");
                          }

                 }while(week != 999);
          }
}