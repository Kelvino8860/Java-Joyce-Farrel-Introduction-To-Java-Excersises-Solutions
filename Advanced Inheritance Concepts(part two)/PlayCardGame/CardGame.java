public abstract class CardGame extends Cards
{
    protected Cards[] deck = new Cards[52];
    private String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};
    private String[] ranks = {"Ace", "2", "3", "4", "5", "6",
                              "7", "8", "9", "10", "Jack", "Queen", "King"};
    protected int numCards;

    public CardGame()
       {
           //Initialize cards
          for(int i = 0; i < deck.length; i++){
             deck[i] = new Cards();
             deck[i].setValues(i);
           }

       //Initialize all the cards with suits and ranks
          for(int i = 0; i < deck.length; i++){
               deck[i].setSuits(suits[i/13]);
               deck[i].setRanks(ranks[i%13]);
          }
       }

   public void shuffle()
     {
         
      //Shuffle the cards
        for(int i = 0; i < deck.length; i++){
             int index = (int)(Math.random() * deck.length);
              Cards temp = deck[i];
              deck[i] = deck[index];
              deck[index] = temp;
          }
     }

  public abstract void displayDescription();
  public abstract void deal();
    
}