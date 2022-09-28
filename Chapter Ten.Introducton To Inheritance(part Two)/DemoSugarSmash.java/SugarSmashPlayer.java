/* 5. The developers of a free online game named Sugar Smash have asked you to develop
      a class named SugarSmashPlayer that holds data about a single player. The class
      contains the following fields: the player’s integer ID number, a String screen name,
      and an array of integers that stores the highest score achieved in each of 10 game
      levels. Include get and set methods for each field. The get and set methods for
      the scores should each require two parameters—one that represents the score
      achieved and one that represents the game level to be retrieved or assigned. Display
      an error message if the user attempts to assign or retrieve a score from a level that
      is out of range for the array of scores. Additionally, no level except the first one
      should be set unless the user has earned at least 100 points at each previous level.
      If a user tries to set a score for a level that is not yet available, issue an error
      message. Create a class named PremiumSugarSmashPlayer that descends from
      SugarSmashPlayer. This class is instantiated when a user pays $2.99 to have access to
      40 additional levels of play. As in the free version of the game, a user cannot set a score
      for a level unless the user has earned at least 100 points at all previous levels. Create a
      program that instantiates several objects of each type and demonstrates the methods.
      Save the files as SugarSmashPlayer.java, PremiumSugarSmashPlayer.java, and
      DemoSugarSmash.java*/


public class SugarSmashPlayer
{
    private int idNum;
    private String screenName;
    private int[] scores = new int[10];
    private int count = 1;;

   public int getIdNum()
     {
        return idNum;
     }
   public String getScreenName()
     {
        return screenName;
     }
   public int getScores(int level)
     {
        int score = 0;
        if(level < 0 || level > 9)
          {
            System.out.println("Error try again!!!");
          }
        else
          {
             score = scores[level];
          }
        return score;
     }

   public void setIdNum(int id)
     {
        idNum = id;
     }
   public void setScreenName(String name)
     {
        screenName = name;
     }
   public void setScore(int score, int level)
     {
       //Initializes the count int to the level the user enters
         if(level > 0)
            count = level;
         
      //Checks wether the level enterde is in the correct range
        if(level < 0 || level > 9)
            {
              System.out.println("Error!!! Level out of range");
              count = 1;
            }
 
     //Prevent any exception error in arrayLength.
     //Makes sure the count is in the right range to prevent outOfBounds error
      if(count < getArray()){ 

       //ensure the first score is recorded
       //even if it is bellow the required minimum score
        if(level == 0)
           {
             scores[0] = score; 
           }
         
      //Record the rest of the scores if the level is correct
      //and the score is correct too
        if(level > 0 && level < 10 && scores[count - 1] >= 100)
           {
             scores[level] = score;
           }

     //Otherwise display an error and initialize count to 1
     //to prevent the program from terminating 
     //and having out of bounds error
         else if(scores[count - 1] < 100)
           {
             System.out.println("Not eligible for the next level!!!");
             count = 1;
            }
          }
     }
  public int getSize()
    {
      return count;
    }
  public int getArray()
    {
       return scores.length;
    }
}