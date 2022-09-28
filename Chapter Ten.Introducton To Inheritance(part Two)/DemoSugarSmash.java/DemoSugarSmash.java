import java.util.Scanner;

public class DemoSugarSmash
{
   public static void main(String[] args)
      {
          Scanner input = new Scanner(System.in);
          Scanner inputString = new Scanner(System.in);

          SugarSmashPlayer obj1 = new SugarSmashPlayer();
          int score = 0;
          int level = 0;
          String pay = "";
          
          System.out.print("Enter player's ID Number: ");
          int idNum = input.nextInt();
          obj1.setIdNum(idNum);

          System.out.print("Enter player's screen name: ");
          String screen = inputString.nextLine();
          obj1.setScreenName(screen);

      do{

          System.out.print("Enter game level: ");
          level = input.nextInt();
          System.out.print("Enter game score or 999 to exit: ");
          score = input.nextInt();
           
             if(score == 999)
               break;

          obj1.setScore(score, level);
          
            if(obj1.getSize() == (obj1.getArray() - 1))
               break;

        }while(true);

    
            System.out.print("To continue with the Premium version, pay $2.99(YES OR NO): ");
            pay = inputString.nextLine().toUpperCase();

            if(pay.equals("YES"))
               {  
                    PremiumSugarSmashPlayer obj2 = new PremiumSugarSmashPlayer();
                         System.out.print("Enter player's ID Number: ");
                         idNum = input.nextInt();
                         obj2.setIdNum(idNum);

                         System.out.print("Enter player's screen name: ");
                         screen = inputString.nextLine();
                         obj2.setScreenName(screen);

                   do{

                         System.out.print("Enter game level: ");
                         level = input.nextInt();
                         System.out.print("Enter game score or 999 to exit: ");
                         score = input.nextInt();
                            
                              if(score == 999)
                                  break;

                         obj2.setScore(score, level);

                          if(obj2.getSize() == (obj2.getArray() - 1))
                             break;
         
                    }while(true);

                 displayObj2(obj2);
               }

       
         displayObj1(obj1);
         
      }

  public static void displayObj1(SugarSmashPlayer x)
         {   Scanner input = new Scanner(System.in);
             System.out.println("\n\n");
             System.out.println("PLAYERS DATA");
             System.out.print("Player's ID: " + x.getIdNum() + "\nPlayer's Screen Name: " +
                              x.getScreenName());
             int disScore = 0;

                do{
                    System.out.print("\nEnter level(0-9) to display score & 999 to quit: ");
                    disScore = input.nextInt();
                       if(disScore >= 0 && disScore <= 9)
                           {
                                System.out.println("LEVEL: " + disScore +
                                    "\nSCORE: " + x.getScores(disScore));
                           }
                        else if(disScore == 999)
                            break;
                  }while(true);
         }

  public static void displayObj2(PremiumSugarSmashPlayer y)
       {   Scanner input = new Scanner(System.in);
           System.out.println("\n\n");
             System.out.println("PLAYERS DATA");
             System.out.print("Player's ID: " + y.getIdNum() + "\nPlayer's Screen Name: " +
                              y.getScreenName());
             int disScore = 0;

                do{
                    System.out.print("\nEnter level(1 - 40) to display score & 999 to quit: ");
                    disScore = input.nextInt();
                       if(disScore >= 0 && disScore <= y.getArray() - 1)
                           {
                                System.out.println("LEVEL: " + disScore +
                                    "\nSCORE: " + y.getScores(disScore));
                           }
                        else if(disScore == 999)
                            break;
                  }while(true);
       }








}