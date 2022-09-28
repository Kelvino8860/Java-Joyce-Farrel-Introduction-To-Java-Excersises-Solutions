public class LittleLeagueBaseballGame extends BaseballGame
{
   private int[] highSchoolOne = new int[6];
   private int[] highSchoolTwo = new int[6];

   @Override
    public int getScoreOne(int inning)
     {
         int score = 0;
           if(inning >= 1 || inning <= 6)
               {
                  score = highSchoolOne[inning - 1];
               }
             else if(inning < 1 || inning > 6)
              {
                 System.out.println("Out of range");
              }
         return score;
     }
   @Override
   public int getScoreTwo(int inning)
     {
         int score = 0;
           if(inning >= 1 || inning <= 6)
              {
                score = highSchoolTwo[inning - 1];
              }
           else if(inning < 1 || inning > 6)
              {
                 System.out.println("Out of range");
              }
          return score;
     }
   
   @Override
    public void setScoreOne(int inning, int score)
     {
           if(inning >= 1 && inning <= 6)//Ensure the inning is the right range
              {
                  if(inning == 1)//set the first inning
                    {
                      highSchoolOne[inning - 1] = score;
                    }
                  
                  else if(inning > 1 && inning <= 6)//set the rest of the innings
                    {
                       if(highSchoolOne[inning - 2] > 0)
                         {
                            highSchoolOne[inning - 1] = score;
                         }
                       else if(highSchoolOne[inning - 2] <= 0)
                         {
                            System.out.println("The previous inning score is missing!!!");
                         }
                    }
              }
           else if(inning < 1 || inning > 6)
              {
                 System.out.println("Out of Range!!!");
              }
     }

  @Override
   public void setScoreTwo(int inning, int score)
     {
           if(inning >= 1 && inning <= 6)//Ensure the inning is in the right range
              {
                  if(inning == 1)//set the first inning
                    {
                      highSchoolTwo[inning - 1] = score;
                    }
                  
                  else if(inning > 1 && inning <= 6)//set the rest of the innings
                    {
                       if(highSchoolTwo[inning - 2] > 0)
                         {
                            highSchoolTwo[inning - 1] = score;
                         }
                       else if(highSchoolTwo[inning - 2] <= 0)
                         {
                            System.out.println("The previous inning score is missing!!!");
                         }
                    }
              }
           else if(inning < 1 || inning > 6)
              {
                 System.out.println("Out of Range!!!");
              }
     }

   @Override
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