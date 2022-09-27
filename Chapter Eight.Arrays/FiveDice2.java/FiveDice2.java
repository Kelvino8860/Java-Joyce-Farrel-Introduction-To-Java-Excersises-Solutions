public class FiveDice2{ 
     public static void main(String[]   args){
            
           Die obj = new Die();
           
           obj.setRandomValue();

           obj.setRandomMine();
           obj.displayComp();
           obj.displayMine();
           obj.winner();
         }         
}