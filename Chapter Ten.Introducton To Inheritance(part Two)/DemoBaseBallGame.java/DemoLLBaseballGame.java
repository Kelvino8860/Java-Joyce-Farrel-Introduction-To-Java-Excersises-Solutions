import java.util.Scanner;

public class DemoLLBaseballGame
{
    public static void main(String[] args)
      {
          LittleLeagueBaseballGame objOne = new LittleLeagueBaseballGame();
            
           Scanner inputString = new Scanner(System.in);
         Scanner inputInt = new Scanner(System.in);

         System.out.print("Enter team one's name: ");
         String teamOne = inputString.nextLine();
         System.out.print("Enter team two's name: ");
         String teamTwo = inputString.nextLine();

         objOne.setTeamOne(teamOne);
         objOne.setTeamTwo(teamTwo);

         int inning = 0;
         int score = 0;

         System.out.println("Enter " + objOne.getTeamOne() + " inning scores(There are 6 innings)");
           do{
               System.out.print("Enter inning number: ");
               inning = inputInt.nextInt();
               System.out.print("Enter score(or 999 to quit): ");
               score = inputInt.nextInt();

                 if(score == 999)
                   break;

               objOne.setScoreOne(inning, score);
             }while(true);

         System.out.println("Enter " + objOne.getTeamTwo() + " inning scores(There are 6 innings)");
            do{
                 System.out.print("Enter inning number: ");
                 inning = inputInt.nextInt();
                 System.out.print("Enter score(or 999 to quit): ");
                 score = inputInt.nextInt();

                 if(score == 999)
                   break;

               objOne.setScoreTwo(inning, score);
              }while(true);

        //View teams inning

    do{
        System.out.print("\n\n1.To view " + objOne.getTeamOne() + " inning scores enter 1 \n2.To view " +
                           objOne.getTeamTwo() + " inning scores enter 2 \n3.To Quit enter(3) \nEnter choice >> ");
          int choice = inputInt.nextInt();

           if(choice == 1)
              {
                 do{
                     System.out.print("Enter inning or (999) to quit: ");
                     inning = inputInt.nextInt();
                        if(inning == 999)
                            break;
                     System.out.println("Score at Inning " + inning + " is " + objOne.getScoreOne(inning));
                     
                   }while(true);
              }
        
            else if(choice == 2)
               {
                   do{
                     System.out.print("Enter inning or (999) to quit: ");
                     inning = inputInt.nextInt();
                        if(inning == 999)
                            break;
                     System.out.println("Score at Inning " + inning + " is " + objOne.getScoreTwo(inning));
                     
                   }while(true);
               }

           else if(choice == 3)
              break;

     }while(true);

          objOne.winner();
      }
}