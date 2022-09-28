public class BaseballGame
{
   private String teamOne;
   private String teamTwo;
   private int[] scoreOne = new int[9];
   private int[] scoreTwo = new int[9];

   public String getTeamOne()
     {
        return teamOne;
     }
   public String getTeamTwo()
     {
       return teamTwo;
     }
   public int getScoreOne(int inning)
     {
         int score = 0;
           if(inning >= 1 || inning <= 9)
               {
                  score = scoreOne[inning - 1];
               }
           else if(inning < 1 || inning > 9)
              {
                 System.out.println("Out of range");
              }
         return score;
     }
   public int getScoreTwo(int inning)
     {
         int score = 0;
           if(inning >= 1 || inning <= 9)
              {
                score = scoreTwo[inning - 1];
              }
           else if(inning < 1 || inning > 9)
              {
                 System.out.println("Out of range");
              }
          return score;
     }

   public void setTeamOne(String name)
     {
       teamOne = name;
     }
   public void setTeamTwo(String name)
     {
        teamTwo = name;
     }
   public void setScoreOne(int inning, int score)
     {
           if(inning >= 1 && inning <= 9)//Ensure the inning is the right range
              {
                  if(inning == 1)//set the first inning
                    {
                      scoreOne[inning - 1] = score;
                    }
                  
                  else if(inning > 1 && inning <= 9)//set the rest of the innings
                    {
                       if(scoreOne[inning - 2] > 0)
                         {
                            scoreOne[inning - 1] = score;
                         }
                       else if(scoreOne[inning - 2] <= 0)
                         {
                            System.out.println("The previous inning score is missing!!!");
                         }
                    }
              }
           else if(inning < 1 || inning > 9)
              {
                 System.out.println("Out of Range!!!");
              }
     }
   public void setScoreTwo(int inning, int score)
     {
           if(inning >= 1 && inning <= 9)//Ensure the inning is in the right range
              {
                  if(inning == 1)//set the first inning
                    {
                      scoreTwo[inning - 1] = score;
                    }
                  
                  else if(inning > 1 && inning <= 9)//set the rest of the innings
                    {
                       if(scoreTwo[inning - 2] > 0)
                         {
                            scoreTwo[inning - 1] = score;
                         }
                       else if(scoreTwo[inning - 2] <= 0)
                         {
                            System.out.println("The previous inning score is missing!!!");
                         }
                    }
              }
           else if(inning < 1 || inning > 9)
              {
                 System.out.println("Out of Range!!!");
              }
     }

  public void winner()
    {
      // if(scoreOne[8] > 0 && scoreTwo[8] > 0)
      //    {
      //       Dettermine winner
      //   }

        //Assume the game is a draw for this exercise
       System.out.println("THE GAME IS A TIE");
    }

}




























