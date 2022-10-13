public class Poker extends CardGame
{
     private int numCards;

     public Poker()
       {
          numCards = 5;
       }

   @Override
   public void displayDescription()
     {
        System.out.println("Each player in poker receives five cards.");
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