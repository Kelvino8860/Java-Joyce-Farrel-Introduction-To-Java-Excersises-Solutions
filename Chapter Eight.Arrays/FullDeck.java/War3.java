public class War3{
      public static void main(String[] args){
         Cards[] obj = new Cards[52];

         String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};
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
















