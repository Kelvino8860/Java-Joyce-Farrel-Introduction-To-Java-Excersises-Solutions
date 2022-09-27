import java.util.*;

public class InsertionSortDemo{
     public static void main(String[] args){
 
            int[] array = new int[5];
            Scanner input = new Scanner(System.in);
            int a, b, temp;

            for(a = 0; a < array.length; a++){
                 System.out.print("Enter number " + (a + 1) + " >> ");
                 array[a] = input.nextInt();
              }
            
            display(array, 0);
            
            a = 1;
             while(a < array.length)
               {
                   temp = array[a];
                   b = a - 1;
                   while(b >= 0 && array[b] > temp){
                        array[b + 1] = array[b];
                        --b; 
                     }
                      array[b + 1] = temp;
                      display(array, a);
                      ++a;
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