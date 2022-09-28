public class PremiumSugarSmashPlayer extends SugarSmashPlayer
{
  private int[] newScores = new int[40];
  private int size = 1;

   @Override
   public int getScores(int level)
    {
       int score = 0;
         if(level <= 0 || level > 41)
          {
            System.out.println("Error try again!!!");
          }
        else
          {
             score = newScores[level - 1];
          }
        return score;
    }
  @Override
     public void setScore(int score, int level)
     {
            if(level > 0)
                size = level;

        if(level < 0 || level > 39)
            {
              System.out.println("Error!!! Level out of range");
              size = 1;
            }

   if(size < getArray()){

        if(level == 0)
         {
           newScores[0] = score;
         }
         
        if(level > 0 && level < 40 && newScores[size - 1] >= 100)
          {
             newScores[level] = score;
          }
        else if(newScores[size - 1] < 100)
          {
             System.out.println("Not eligible for the next level!!!");
             size = 1;
          }
       }
     }
  @Override
     public int getSize()
       {
         return size;
       }
   @Override
     public int getArray()
       {
          return newScores.length;
       }
}