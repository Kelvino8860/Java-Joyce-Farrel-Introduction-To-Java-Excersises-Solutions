/* 3. In Chapter 8, you created an application class named FullDeck that implemented a
      52-element array that represented each card in a standard deck of playing cards. Now,
      create an enumeration that holds the four suits SPADES, HEARTS, DIAMONDS, and CLUBS.
      Save the enumeration in a file named Suit.java. Modify the Card class from Chapter 8
      to use the enumeration, and save the class as Card2.java. Modify the FullDeck
      application to use the new Card class, and save the application as FullDeck2.java*/

public class FullDeck2{
      public static void main(String[] args){
         Cards[] obj = new Cards[52];

         Suit[] suits = Suit.values();
         String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        //Initialize cards
          for(int i = 0; i < obj.length; i++){
             obj[i] = new Cards();
             obj[i].setValues(i);
           }

       //Dislay all the cards
          for(int i = 0; i < obj.length; i++){
               obj[i].setSuits(suits[i/13]);
               obj[i].setRanks(ranks[i%13]);
       }
    
      //Shuffle the cards
        for(int i = 0; i < obj.length; i++){
             int index = (int)(Math.random() * obj.length);
              Cards temp = obj[i];
              obj[i] = obj[index];
              obj[index] = temp;
          }

     //Display cards
      // for(int i = 0; i < obj.length; i++){
       //      System.out.println(i + ". " + obj[i].getRanks() + " of " + obj[i].getSuits());
       //   }

     //Play game War3
        Cards[] new_Obj = new Cards[obj.length-1];
         int j = (int)(Math.random() * obj.length);
         System.out.println("Your card is: " + obj[j].getRanks() + " of " + obj[j].getSuits());
            
  }
}
















