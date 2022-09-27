/* b. Revise the MeanMedian class so that the user can enter any number of values up
      to 20. If the list has an even number of values, the median is the numeric average
      of the values in the two middle positions. Save the file as MeanMedian2.java*/

import java.util.Scanner;

public class MeanMedian2{

        public static void main(String[] args){
             
              int[] array = new int[20];
              Scanner input = new Scanner(System.in);
              
              System.out.print("Enter five integers >> ");
                for(int i = 0; i < array.length; ++i){
                      
                      array[i] = input.nextInt();
                   }

             displayMean(array);
           }

       public static void displayMean(int[] a){
          
           //Display all values
               System.out.print("The values are >> ");
               for(int value : a)
                System.out.print(value + " ");
   
          //Display mean
              double total = 0;
                for(int i = 0; i < a.length; ++i){
                     total += a[i];
                  }

               System.out.println("\nThe mean is >> " + (total / a.length));

          
         //Display median
            java.util.Arrays.sort(a);
            int j = a.length / 2;
            int b = a[j], c = a[j-1];
            double d = b + c;
            double median = d/2;
            System.out.println("The median is >> " + median);
            
           }
}