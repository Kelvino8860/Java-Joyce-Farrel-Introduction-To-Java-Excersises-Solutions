import java.util.*;

public class BubbleSortDemo{
     public static void main(String[] args){
 
            int[] array = new int[10];
            int comparisonsToMake = array.length - 1;
            Scanner input = new Scanner(System.in);
            int a, b, temp;

            for(a = 0; a < array.length; a++){
                 System.out.print("Enter number " + (a + 1) + " >> ");
                 array[a] = input.nextInt();
              }
            
            display(array, 0);

            for(a = 0; a < array.length - 1; ++a){
               
                for(b = 0; b < comparisonsToMake; ++b){
                     
                     if(array[b] > array[b + 1]){
                           temp = array[b];
                           array[b] = array[b + 1];
                           array[b + 1] = temp;
                         }
                  }
                
                  display(array, (a + 1));
                  --comparisonsToMake;
              }
        }

     public static void display(int[] array, int a){

            System.out.print("Iteration " + a + ": ");
            for(int b = 0; b < array.length; ++b){
                System.out.print(array[b] + " ");
              }
            System.out.println();
        }
}