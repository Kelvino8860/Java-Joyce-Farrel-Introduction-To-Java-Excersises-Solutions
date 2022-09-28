/* 6. Create a class named BaseballGame that contains data fields for two team names and
      scores for each team in each of nine innings. Create get and set methods for each
      field; the get and set methods for the scores should require a parameter that indicates
      which inning’s score is being assigned or retrieved. Do not allow an inning score to be
      set if all the previous innings have not already been set. If a user attempts to set an
      inning that is not yet available, issue an error message. Also include a method that
      determines the winner of the game after scores for the last inning have been entered.
      (For this exercise, assume that a game might end in a tie.) Create two subclasses from
      BaseballGame: HighSchoolBaseballGame and LittleLeagueBaseballGame. High
      school baseball games have seven innings, and Little League games have six innings.
      Ensure that scores for later innings cannot be accessed for objects of these subtypes.
      Write three applications that each instantiate one of the object types and demonstrate
      their methods. Save the files as BaseballGame.java, HighSchoolBaseballGame.java,
      LittleLeagueBaseballGame.java, DemoBaseballGame.java,
      DemoHSBaseballGame.java, and DemoLLBaseballGame.java*/


import java.util.Scanner;

public class DemoBaseballGame
{
    public static void main(String[] args)
      {
         BaseballGame objOne = new BaseballGame();
         
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

         System.out.println("Enter " + objOne.getTeamOne() + " inning scores(There are nine innings)");
           do{
               System.out.print("Enter inning number: ");
               inning = inputInt.nextInt();
               System.out.print("Enter score(or 999 to quit): ");
               score = inputInt.nextInt();

                 if(score == 999)
                   break;

               objOne.setScoreOne(inning, score);
             }while(true);

         System.out.println("Enter " + objOne.getTeamTwo() + " inning scores(There are nine innings)");
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















