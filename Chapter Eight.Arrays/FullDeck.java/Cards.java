/* 3. a. In Chapter 7, you modified a previously created Card class so that each Card
         would hold the name of a suit (“Spades”, “Hearts”, “Diamonds”, or “Clubs”) as well
         as a value (“Ace”, “King”, “Queen”, “Jack”, or a number value). Now, create an array
         of 52 Card objects, assigning a different value to each Card, and display each Card.
         Save the application as FullDeck.java*/


public class Cards{
     private String suits;
     private String ranks;
     private int values;

public Cards(){
   }
public void setSuits(String suits){
         this.suits = suits;
   }
public String getSuits(){
       return suits;
   }
public void setRanks(String ranks){
      this.ranks = ranks;
   }
public String getRanks(){
      return ranks;
   }
public void setValues(int values){
     this.values = values;
   }
public int getValues(){
     return values;
   }
}