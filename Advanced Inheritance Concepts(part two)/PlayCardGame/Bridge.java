public class Bridge extends CardGame
{
     private int numCards;

     public Bridge()
       {
          numCards = 13;
       }

   @Override
   public void displayDescription()
     {
        System.out.println("Each player in Bridge receives 13 cards.");
     }
   @Override
   public void deal()
     {
        for(int i = 0; i < numCards; ++i)
          {
             System.out.println(deck[i].getRanks() + " of " + deck[i].getSuits());
          }
     }
}