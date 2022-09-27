/* Write an application that stores 12 integers in an array. Display the integers from
first to last, and then display the integers from last to first. Save the file as
TwelveInts.java.*/

public class DisplayInt{
     private  int[] myInt = new int[12];
     private int size;
     public static final int DEFAULT_SIZE = 12;

public DisplayInt(){
      
     }
public void setValue(int value){
  
          if(size <= myInt.length){
              
             myInt[size++] = value;
           }     
      }

/* To display the numbers in the array*/
public void display(){
        
           //Display the numbers in increasing order
         for(int i = 0; i < myInt.length; i++){

              System.out.print(myInt[i] + " ");
              }
         System.out.println();
       
           //Display the numbers in reverse order
         for(int i = myInt.length-1; i >= 0; i--){

               System.out.print(myInt[i] + " ");
             }
         System.out.println();
      }
}