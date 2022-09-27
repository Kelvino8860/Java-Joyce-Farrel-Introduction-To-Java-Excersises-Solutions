/*2. a. In Chapter 4, you created a Die application that randomly “throws” five dice for
        the computer and five dice for the player. The application displays the values.
        Modify the application to decide the winner based on the following hierarchy of
        Die values. Any higher combination beats a lower one—for example, five of a
        kind beats four of a kind.
             *Five of a kind
             *Four of a kind
             *Three of a kind
             *A pair
       For this game, the dice values do not count; for example, if both players have three of
       a kind, it’s a tie, no matter what the values of the three dice are. Additionally, the
       game does not recognize a full house (three of a kind plus two of a kind). Figure 8-21
       shows a sample execution. Save the application as FiveDice2.java.
    
    b. Improve the FiveDice2 game so that when both players have the same combination of dice, the higher value wins. For example, two 6s beats two 5s. Figure 8-22
        shows a sample execution. Save the application as FiveDice3.java.
*/


public class Die{

  private final int HIGHEST_DIE_VALUE = 6;
  private final int LOWEST_DIE_VALUE = 1;
  private int[] randomValue = new int[5];
  private int[] randomMine = new int[5];
  private int[] countArrayComp = new int[6];
  private int[] countArrayHuman = new int[6];
  private int[] allPosibilities = {1, 2, 3, 4, 5, 6};
  private int compKind = 0;
  private int humanKind = 0;

public Die()
    {  
            }

/*Set the values of five dice thrown by a computer*/
public void setRandomValue(){
        
        System.out.print("Computer rolled: ");
        for(int i = 0; i < randomValue.length; i++){
               randomValue[i] = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE +
                              LOWEST_DIE_VALUE); 
         System.out.print(randomValue[i] + " ");
            }
    }

/*set the values of five dice thrown by a player*/
public void setRandomMine(){
       
       System.out.print("\nYou rolled: ");
       for(int i = 0; i < randomMine.length; i++){
               randomMine[i] = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE +
                              LOWEST_DIE_VALUE); 
        System.out.print(randomMine[i] + " ");
            } 
    }

/*count the number of dice thrown by computer that have the same number of values*/
public void displayComp(){
   int countOne = 0, countTwo = 0, countThree = 0, countFour = 0, countFive = 0, countSix = 0;
      for(int i = 0; i < randomValue.length; i++){
            if(randomValue[i] == 1){
                 ++countOne;
                 countArrayComp[0] = countOne;
              }
            if(randomValue[i] == 2){
                 ++countTwo;
                 countArrayComp[1] = countTwo;
              }
            if(randomValue[i] == 3){
                 ++countThree;
                 countArrayComp[2] = countThree;
              }
            if(randomValue[i] == 4){
                 ++countFour;
                 countArrayComp[3] = countFour;
              }
            if(randomValue[i] == 5){
                 ++countFive;
                 countArrayComp[4] = countFive;
              }
            if(randomValue[i] == 6){
                 ++countSix;
                 countArrayComp[5] = countSix;
             }
        }
         
     //Display how many dice have the save value facing upwards
             compKind = countArrayComp[0];
          for(int i = 0; i < countArrayComp.length; i++){
               if(compKind < countArrayComp[i]){
                    compKind = countArrayComp[i];
                  }
           }
      System.out.println("\nComputer has " + compKind + " of a kind.");
       
   }

/*count the number of dice thrown by computer that have the same number of values*/
public void displayMine(){
           int countOne = 0, countTwo = 0, countThree = 0, countFour = 0, countFive = 0, countSix = 0;
      for(int i = 0; i < randomMine.length; i++){
            if(randomMine[i] == 1){
                 ++countOne;
                 countArrayHuman[0] = countOne;
              }
            if(randomMine[i] == 2){
                 ++countTwo;
                 countArrayHuman[1] = countTwo;
              }
            if(randomMine[i] == 3){
                 ++countThree;
                 countArrayHuman[2] = countThree;
              }
            if(randomMine[i] == 4){
                 ++countFour;
                 countArrayHuman[3] = countFour;
              }
            if(randomMine[i] == 5){
                 ++countFive;
                 countArrayHuman[4] = countFive;
              }
            if(randomMine[i] == 6){
                 ++countSix;
                 countArrayHuman[5] = countSix;
             }
        }
    
     //Display how many dice have the save value facing upwards
             humanKind = countArrayHuman[0];
          for(int i = 0; i < countArrayHuman.length; i++){
               if(humanKind < countArrayHuman[i]){
                    humanKind = countArrayHuman[i];
                  }
           }
      System.out.println("You have " + humanKind + " of a kind.");
   }

/*Display the winner who should be having the largest number of kinds*/
public void winner(){

            //find the index of the value with the highest kind
                int indexComp = 0, indexHuman = 0;
                for(int i = 0; i < countArrayComp.length; i++){
                        if(countArrayComp[i] == compKind){
                             indexComp = i;
                           }
                        if(countArrayHuman[i] == humanKind){
                             indexHuman = i;
                           }
                     }
          
        //find the highest value between the computer and the player to break the tie incase
        //they have the same amount of kinds
            int valueComp = compKind * allPosibilities[indexComp];
            int valueHuman = humanKind * allPosibilities[indexHuman];

         if(compKind > humanKind){
               System.out.println("Computer wins");
             }
         else if(humanKind > compKind){
              System.out.println("You win");
           }
         else if(humanKind == compKind){
                if(valueComp > valueHuman){
                    System.out.println("Computer has a higher value - Computer wins");
                  }
                else if(valueHuman > valueComp){
                   System.out.println("Your values are higher - You win"); 
                  }
                else if(valueHuman == valueComp){
                   System.out.println("DRAW!!!!");
                  }
           }
     }
}














