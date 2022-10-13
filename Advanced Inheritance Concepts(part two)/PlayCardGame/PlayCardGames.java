/* 2. a. Create an abstract CardGame class similar to the one described in this chapter. The
         class contains a “deck” of 52 playing cards that uses a Card class that holds a suit and
         value for each Card object. It also contains an integer field that holds the number of
         cards dealt to a player in a particular game. The class contains a constructor that
         initializes the deck of cards with appropriate values (e.g., “King of Hearts”), and a
         shuffle() method that randomly arranges the positions of the Cards in the array.
         The class also contains two abstract methods: displayDescription(), which
         displays a brief description of the game in each of the child classes, and deal(),
         which deals the appropriate number of Card objects to one player of a game.
         Save the file as CardGame.java.
     b. Create two child classes that extend CardGame. You can choose any games you
        prefer. For example, you might create a Poker class or a Bridge class. Create a
        constructor for each child class that initializes the field that holds the number
        of cards dealt to the correct value. (For example, in standard poker, a player
        receives five cards, but in bridge, a player receives 13.) Create an appropriate
        displayDescription() and deal() method for each child class. Save each file
        using an appropriate name—for example, Poker.java or Bridge.java.
     c. Create an application that instantiates one object of each game type and
        demonstrates that the methods work correctly. Save the application as
        PlayCardGames.java*/


public class PlayCardGames
{
    public static void main(String[] args)
       {
          Poker obj1 = new Poker();
          Bridge obj2 = new Bridge();

          obj1.shuffle();
          obj1.displayDescription();
          obj1.deal();

          System.out.println();//spacing
       
          obj2.shuffle();
          obj2.displayDescription();
          obj2.deal();
         
       }
}